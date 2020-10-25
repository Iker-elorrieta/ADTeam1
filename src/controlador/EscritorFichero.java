package controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;


import org.w3c.dom.*;

import excepciones.ExcepcionNombreArchivo;
import modelo.Libro;
import modelo.Menu;

public class EscritorFichero {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void escribirFicheroTxt(ArrayList<Libro> pLibros){

		ArrayList<Libro> libros = pLibros;

		int numLibros = 0;
		
		try{
			String sFichero = (solicitarNombreFichero() + ".txt");
		
			BufferedWriter bwFichero = new BufferedWriter(new FileWriter(sFichero, aniadirDatosFicheroExistente(sFichero)));
			
			for (int i = 0; i < libros.size(); i++){
				Libro libro = libros.get(i);
				bwFichero.write(libro.toString()); 
				bwFichero.newLine(); 
				numLibros++;
			}
			bwFichero.close();
			
			System.out.println("\nSe ha(n) guardado " + numLibros + " libro(s) en el fichero " + sFichero);
		
		}catch (FileNotFoundException fn ){
			 System.out.println("\nNo se encuentra el fichero");
		}catch (IOException io) {
			 System.out.println("\nError de E/S ");
		}
	}
		

	public static void escribirFicheroDat(ArrayList<Libro> pLibros){
		
		ArrayList<Libro> libros = pLibros;
		 
		int numLibros = 0;
		String sFichero = (solicitarNombreFichero() + ".dat");			
		
		ObjectOutputStream dataOS = null;
		try {
			dataOS = new ObjectOutputStream(new FileOutputStream(new File(sFichero)));
		} catch (FileNotFoundException e1) {
			System.out.println("\nNo se encuentra el fichero");
		} catch (IOException e1) {
			System.out.println("\nError de E/S ");
		}
		
		for (Libro libro : libros){
			
		 	try {
				dataOS.writeObject(libro);
			} catch (IOException e) {
				 System.out.println("\nError de E/S ");
			} 
		 	numLibros++;
		}
		try {
			dataOS.close();
		} catch (IOException e) {
			 System.out.println("\nError de E/S ");
		} 
		 
		System.out.println("\nSe ha(n) guardado " + numLibros + " libro(s) en el fichero " + sFichero);		 
	}
	 
	
	public static void escribirFicheroXml(ArrayList<Libro> pLibros){
		
		ArrayList<Libro> libros = pLibros;
		
		String sFichero = (solicitarNombreFichero() + ".xml");
		File fichero = new File(sFichero);
		
		DocumentBuilderFactory  dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = null;
		
		try {
			dbBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			System.out.println("\nError en la configuracion para la creacion del DocumentBuilder");
		}
		
		Document doc = dbBuilder.newDocument();
		
		Element elementoRaiz = doc.createElement("CATALOGO");
		doc.appendChild(elementoRaiz);
		
		for (Libro libro : libros) {
			
			Element eLibro = doc.createElement("LIBRO");
			elementoRaiz.appendChild(eLibro);
			
			Attr attrTitulo = doc.createAttribute("TITULO");
			attrTitulo.setValue(libro.getTitulo());
			eLibro.setAttributeNode(attrTitulo);
			
			Attr attrEditorial = doc.createAttribute("EDITORIAL");
			attrEditorial.setValue(libro.getEditorial());
			eLibro.setAttributeNode(attrEditorial);
			
			Attr attrPaginas = doc.createAttribute("PAGINAS");
			attrPaginas.setValue(Integer.toString(libro.getPaginas()));
			eLibro.setAttributeNode(attrPaginas);
			
			Attr attrAltura = doc.createAttribute("ALTURA");
			attrAltura.setValue(Double.toString(libro.getAltura()));
			eLibro.setAttributeNode(attrAltura);
			
			Attr attrNotas = doc.createAttribute("NOTAS");
			attrNotas.setValue(libro.getNotas());
			eLibro.setAttributeNode(attrNotas);
			
			Attr attrIsbn = doc.createAttribute("ISBN");
			attrIsbn.setValue(libro.getIsbn());
			eLibro.setAttributeNode(attrIsbn);
			
			Attr attrMaterias = doc.createAttribute("MATERIAS");
			attrMaterias.setValue(libro.getMaterias());
			eLibro.setAttributeNode(attrMaterias);	
		}
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = tf.newTransformer();
		} catch (TransformerConfigurationException e) {
			System.out.println("\nError en la configuracion para la transformacion del archivo XML");
		}		
		
		DOMSource source = new DOMSource(doc);
		
		StreamResult result = new StreamResult(fichero);
		
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			System.out.println("\nError en la transformacion del archivo XML");
		}
		
		System.out.println("\nSe ha(n) guardado " + libros.size() + " libro(s) en el fichero " + sFichero);
	}
	
	
	public static boolean aniadirDatosFicheroExistente(String pSFichero) {
		
		boolean aniadir = true;
		String sFichero = pSFichero;
		File fichero = new File(sFichero);
		
		if (fichero.exists()) {
			
			System.out.println(Menu.mostrarSubmenuSobreescribir());
			switch(MetodosAdicionales.solicitarOpcion(sc,2, 1, "submenuSobreescribir")) {
			
			case 1:
				aniadir = false;
				break;
			case 2: 
				aniadir = true;
				break;
			}
			
		}
		else {
			System.out.println("\nSe ha creado el archivo " + sFichero);
		}
		
		return aniadir;
	}
	
	
	public static String solicitarNombreFichero(){
		
		String nombreFichero = "";
		boolean error = true;
		
		do {
			try{
				System.out.print("\nIntroduce el nombre del archivo: ");
				nombreFichero =  sc.next();
				ExcepcionNombreArchivo.comprobarNombreFichero(nombreFichero);
				sc.nextLine();
				error = false;
			}catch(ExcepcionNombreArchivo exNA) {
				
				System.out.println(exNA.getMessage());
			}
			
		}while(error);
		
		return nombreFichero;
	}
	
	
	public static void escribirFicheroCsv(ArrayList<Libro> pLibros){

		ArrayList<Libro> libros = pLibros;

		int numLibros = 0;

		try{
			String sFichero = (solicitarNombreFichero() + ".csv");
		
			BufferedWriter bwFichero = new BufferedWriter(new FileWriter(sFichero));
			
			for (int i = 0; i < libros.size(); i++){
				Libro libro = libros.get(i);
				bwFichero.write(libro.toString()); 
				bwFichero.newLine(); 
				numLibros++;
			}
			bwFichero.close();
			
			System.out.println("\nSe ha(n) guardado " + numLibros + " libro(s) en el fichero " + sFichero);
	}
		catch (FileNotFoundException fn ){
			 System.out.println("\nNo se encuentra el fichero");
		}
		catch (IOException io) {
			 System.out.println("\nError de E/S ");
		}
	}
}
