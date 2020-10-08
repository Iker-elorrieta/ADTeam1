package controlador;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.xml.parsers.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;


import org.w3c.dom.*;

import modelo.Libro;

public class EscribirFichero {
	
	public static void escribirFicheroTxt(ArrayList<Libro> pLibros) throws IOException {

		ArrayList<Libro> libros = pLibros;

		try{
			String sFichero = "libros.txt";
			File fichero = new File(sFichero);
			
			if (fichero.exists()) {
				System.out.println("El fichero " + sFichero + " existe");
			}
			else {
				System.out.println("Se ha creado el archivo " + sFichero);
			}
			
			BufferedWriter bwFichero = new BufferedWriter(new FileWriter(sFichero, true));
			
			for (int i=0; i<libros.size(); i++){
				Libro libro = libros.get(i);
				bwFichero.write(libro.toString()); 
				bwFichero.newLine(); 
			}
			bwFichero.close();
			
			JOptionPane.showMessageDialog(null, "Se han guardado " + libros.size() + " libros en el fichero " + sFichero, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
		catch (FileNotFoundException fn ){
			 System.out.println("No se encuentra el fichero");}
		catch (IOException io) {
			 System.out.println("Error de E/S ");}
	}
		

	 public static void escribirFicheroDat(ArrayList<Libro> pLibros) throws IOException {

		 ArrayList<Libro> libros = pLibros;
		 
		 Libro libro;

		 File fichero = new File("libros.dat");//declara el fichero
		 FileOutputStream fileout = new FileOutputStream(fichero,true); //crea el flujo de salida
		 //conecta el flujo de bytes al flujo de datos
		 ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		
		 for (int i=0;i<libros.size(); i++){ //recorro los arrays
			 libro = libros.get(i);
			 dataOS.writeObject(libro); //escribo la persona en el fichero
		 
			 System.out.println("GRABO LOS DATOS DE LIBRO.");
		 }
		 dataOS.close(); //cerrar stream de salida
		 
	}
	 
	public static void escribirFicheroXml(ArrayList<Libro> pLibros) throws IOException, ParserConfigurationException, TransformerException{
		
		ArrayList<Libro> libros = pLibros;
		
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
		
		StreamResult result = new StreamResult(new File("libros.xml"));
		
		transformer.transform(source, result);
	}

}
