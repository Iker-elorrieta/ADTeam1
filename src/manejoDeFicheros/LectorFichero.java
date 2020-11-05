package manejoDeFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import modelo.Libro;

public class LectorFichero {

	private ArrayList<Libro> libros;
	boolean aniadido = true;
	
	
	public LectorFichero(ArrayList<Libro> pLibros) {
		this.libros = pLibros;
	}	
	
	
	public ArrayList<Libro> getLibros(){
		return this.libros;
	}
	
	
	public boolean leerFicheroTxt(File pFichero){

		int contadorEntradas = 0;
	
		
		String linea;
		
		try{
			BufferedReader brFichero = new BufferedReader(new FileReader(pFichero));
			
			while((linea = brFichero.readLine())!=null) {
				
				StringTokenizer st = new StringTokenizer(linea, ";");
				
				Libro libro = new Libro();	

				while(st.hasMoreTokens()) {
					
					libro.setTitulo(st.nextToken());
					libro.setEditorial(st.nextToken());
					libro.setPaginas(Integer.parseInt(st.nextToken()));
					libro.setAltura(Double.parseDouble(st.nextToken()));
					libro.setNotas(st.nextToken());
					libro.setIsbn(st.nextToken());
					libro.setMaterias(st.nextToken());
					contadorEntradas++;
				}
								
				this.libros.add(libro);
			}
			brFichero.close();
			
			if (this.libros.isEmpty()){
				System.out.println("\nNo se ha cargado ningun libro ");
				aniadido = false;
			}
			else {
				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas + " libro(s)");
			}
		}catch (FileNotFoundException fn ){
			System.out.println("\nNo se encuentra el fichero de carga");
			aniadido =  false;
		}catch (IOException io) {
			System.out.println("\nError de E/S ");
		}
		return aniadido;
	}
	
	public boolean leerFicheroDat(File pFichero) {
				
		try {
			int contadorEntradas = 0;
			
			FileInputStream fi = new FileInputStream(pFichero);
			ObjectInputStream oi = new ObjectInputStream(fi);
	  
	        try {
	            while(fi.getChannel().position() < fi.getChannel().size()) {

	                Libro liburu = (Libro)oi.readObject();

	                if (liburu != null) {
	                    this.libros.add(liburu);
	                    contadorEntradas++;
	                } 
	            }
	            oi.close();
	            fi.close();
        	}
	         catch (ClassNotFoundException e) {
				System.out.println("\nClass not found");			
			}

	        if (libros.isEmpty()){
				System.out.println("\nNo se ha cargado ningun libro");
				aniadido = false;
			}
			else {
				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas +" libro(s)");
			}
	        
		} catch (FileNotFoundException e) {
			System.out.println("\nNo se encuentra el fichero de carga");
			return false;
		} catch (IOException e) {
			System.out.println("\nError de E/S ");
		}

		return aniadido;
	}
	
	public boolean leerFicheroXml(File pFichero){
		
		int contadorEntradas = 0;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = null;
		try {
			documentBuilder = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			System.out.println("\nError en la configuracion para la creacion del DocumentBuilder");
			e.printStackTrace();
		}
		Document document = null;
		try {
			document = documentBuilder.parse(pFichero);
		} catch (SAXException e) {
			System.out.println("SAX exception");
		} catch (IOException e) {
			aniadido = false;
			System.out.println("Error de E/S");
		}
		document.getDocumentElement().normalize();
		NodeList listalibros = document.getElementsByTagName("LIBRO");
		
		for (int temp = 0; temp < listalibros.getLength(); temp++) {
		    Node nodo = listalibros.item(temp);

		    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
		        Element element = (Element) nodo;
		        
		        Libro liburu= new Libro();
		        liburu.setTitulo(element.getAttribute("TITULO"));
		        liburu.setEditorial(element.getAttribute("EDITORIAL"));
		        liburu.setPaginas(Integer.parseInt(element.getAttribute("PAGINAS")));
		        liburu.setAltura(Double.parseDouble(element.getAttribute("ALTURA")));
		        liburu.setNotas(element.getAttribute("NOTAS"));
		        liburu.setIsbn(element.getAttribute("ISBN"));
		        liburu.setMaterias(element.getAttribute("MATERIAS"));
		        
		        this.libros.add(liburu);
		        contadorEntradas++;
		    }
		}
		if (this.libros.isEmpty()){
			System.out.println("\nNo se ha cargado ningun libro");
			aniadido = false;
		}
		else {
			System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas +" libro(s)");
		}

		return aniadido;
	}
	
	public boolean leerFicheroCsv(File pFichero){
				
		try{
			
			int contadorEntradas = 0;

			BufferedReader brFichero = new BufferedReader(new FileReader(pFichero));
			String linea;
			while((linea = brFichero.readLine())!=null) {
				
				StringTokenizer st = new StringTokenizer(linea, ";");
				
				Libro libro = new Libro();	

				while(st.hasMoreTokens()) {
					
					libro.setTitulo(st.nextToken());
					libro.setEditorial(st.nextToken());
					libro.setPaginas(Integer.parseInt(st.nextToken()));
					libro.setAltura(Double.parseDouble(st.nextToken()));
					libro.setNotas(st.nextToken());
					libro.setIsbn(st.nextToken());
					libro.setMaterias(st.nextToken());
					contadorEntradas++;
				}
								
				this.libros.add(libro);
			}
			brFichero.close();
			if (this.libros.isEmpty()){
				System.out.println("\nNo se ha cargado ningun libro ");
				aniadido = false;
			}
			else {
				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas + " libro(s)");
			}
		}
		catch (FileNotFoundException fn ){
			System.out.println("\nNo se encuentra el fichero de carga");
			return false;
				
		}catch (IOException io) {
			System.out.println("\nError de E/S ");}

		return aniadido;
		
	}
}