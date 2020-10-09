package controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;


import org.w3c.dom.*;

import modelo.Libro;

public class EscribirFichero {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void escribirFicheroTxt(ArrayList<Libro> pLibros) throws IOException {

		ArrayList<Libro> libros = pLibros;

		try{
			String sFichero = (solicitarNombreFichero() + ".txt");
		
			BufferedWriter bwFichero = new BufferedWriter(new FileWriter(sFichero, comprobarFicheroExistente(sFichero)));
			
			for (int i=0; i<libros.size(); i++){
				Libro libro = libros.get(i);
				bwFichero.write(libro.toString()); 
				bwFichero.newLine(); 
			}
			bwFichero.close();
			
			System.out.println("\nSe han guardado " + libros.size() + " libros en el fichero " + sFichero);
	}
		catch (FileNotFoundException fn ){
			 System.out.println("\nNo se encuentra el fichero");}
		catch (IOException io) {
			 System.out.println("\nError de E/S ");}
	}
		

	public static void escribirFicheroDat(ArrayList<Libro> pLibros) throws IOException {
		
		ArrayList<Libro> libros = pLibros;
		 
		Libro libro;
		String sFichero = (solicitarNombreFichero() + ".dat");	
		 
		File fichero = new File(sFichero);//declara el fichero
		
		FileOutputStream fileout = new FileOutputStream(fichero,comprobarFicheroExistente(sFichero)); //crea el flujo de salida
		//conecta el flujo de bytes al flujo de datos
		ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		
		for (int i=0;i<libros.size(); i++){ //recorro los arrays
			libro = libros.get(i);
		 	dataOS.writeObject(libro); //escribo el libro en el fichero
		 
		}
		dataOS.close(); //cerrar stream de salida
		 
		System.out.println("\nSe han guardado " + libros.size() + " libros en el fichero " + sFichero);

		 
	}
	 
	public static void escribirFicheroXml(ArrayList<Libro> pLibros) throws IOException, ParserConfigurationException, TransformerException{
		
		ArrayList<Libro> libros = pLibros;
		
		String sFichero = (solicitarNombreFichero() + ".xml");
		
		File fichero = new File(sFichero);
		
		
		DocumentBuilderFactory  dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
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
		Transformer transformer = tf.newTransformer();		
		
		DOMSource source = new DOMSource(doc);
		
		StreamResult result = new StreamResult(fichero);
		
		transformer.transform(source, result);
		
		System.out.println("\nSe han guardado " + libros.size() + " libros en el fichero " + sFichero);

	}
	
	public static boolean comprobarFicheroExistente(String pSFichero) {
		
		boolean añadir = true;
		String sFichero = pSFichero;
		
		File fichero = new File(sFichero);
		
		if (fichero.exists()) {
			
			int opcion = 0;
			boolean error = false;
			do {		
				
				System.out.print("\nEl fichero " + sFichero + " ya existe.\n ¿Que desea realizar?\n\n 1) Sobreescribir datos\n 2) Añadir datos\n\nIntroduzca una opcion: ");

				try {
					opcion = sc.nextInt();
					error = true;
					ExcepcionIntervalo.rango(2, 1, opcion);
				}catch(ExcepcionIntervalo ex) {
					System.out.println(ex.getMessage());
					sc.nextLine();
					error = false;
				}catch(Exception e) {
					System.out.println("\n\n--------\n ERROR! \n--------\nDebe escribir un numero de los indicados en las opciones");
					sc.nextLine();
					error = false;
				}
				
			}while(!error);
			
			switch(opcion) {
			
			case 1:
				añadir = false;
				break;
			case 2: 
				añadir = true;
				break;
			}
			
		}
		else {
			System.out.println("\nSe ha creado el archivo " + sFichero);
		}
		
		return añadir;
	}
	
	public static String solicitarNombreFichero() {
		
		String nombreFichero;
		boolean error = true;
		
		do {
			System.out.print("\nIntroduce el nombre del archivo: ");
			nombreFichero =  sc.next();
			
			if (!Validadores.validador(nombreFichero, Patron.devolverPatron("nombreFichero"))){
				System.out.println("\n\n--------\n ERROR! \n--------\nDebe escribir un nombre valido. (Caracteres admitidos: Letras minusculas/mayusculas, numeros o guion bajo)");
			}
			else {
				error = false;
			}
		}while(error);
		
		return nombreFichero;
	}

}
