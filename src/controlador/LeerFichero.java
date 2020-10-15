package controlador;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import exploradorDeArchivos.ProcesoExplorador;
import exploradorDeArchivos.ExploradorArchivos;
import exploradorDeArchivos.HiloExplorador;
import modelo.Libro;

public class LeerFichero {


	public static ArrayList<Libro> leerFicheroTxt(ArrayList<Libro> pLibros) throws ParseException, InterruptedException {
		
		ArrayList<Libro> libros = pLibros;
		
		try{
			
			int contadorEntradas = 0;
			String sFichero = "";
			
			ExploradorArchivos.main(null);
			
			HiloExplorador eG = new HiloExplorador();
			Thread hilo = new Thread(eG);
			hilo.start();
			hilo.join();

			
			File fichero = new File(sFichero);
			BufferedReader brFichero = new BufferedReader(new FileReader(fichero));
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
								
				//System.out.println(linea);
				libros.add(libro);
			}
			brFichero.close();
			if (libros.isEmpty()){
				System.out.println("\nNo se ha cargado ningun libro ");

			}
			else {
				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas + " libro(s)");
			}
		}catch (FileNotFoundException fn ){
			System.out.println("\nNo se encuentra el fichero de carga");
		
		}catch (IOException io) {
			System.out.println("\nError de E/S ");}
		

		return libros;
		
	}
	
	public static ArrayList<Libro> leerFicheroDat(ArrayList<Libro> pLibros) throws ParseException, IOException, ClassNotFoundException {
		
		ArrayList<Libro> libros = pLibros;
		
		try {
			int contadorEntradas = 0;
			
			FileInputStream fi = new FileInputStream(new File("libros.dat"));
			ObjectInputStream oi = new ObjectInputStream(fi);
	   
	        try {
	            while (true) {

	                Libro liburu = (Libro)oi.readObject();

	                if (liburu != null) {
	                    libros.add(liburu);
	                    contadorEntradas++;
	                }
	                
	            }
        	} catch (EOFException eo) {
	        	System.out.println("\nFIN DE LECTURA");
        	} 
	        catch (StreamCorruptedException x) {
	        }

			oi.close();
			
	        if (libros.isEmpty()){
				System.out.println("\nNo se ha cargado ningun libro");
			}
			else {
				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas +" libro(s)");
			}
	        
		} catch (FileNotFoundException e) {
			System.out.println("\nNo se encuentra el fichero de carga");
		}
		
		return libros;
	
	
	
	}
	
	
	public static ArrayList<Libro> leerFicheroXml(ArrayList<Libro> pLibros) throws ParseException, IOException, ClassNotFoundException {
		
		ArrayList<Libro> libros = pLibros;
		
		int contadorEntradas = 0;
		
		try {
            File archivo = new File("libros.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
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
                    
                    libros.add(liburu);
                    contadorEntradas++;
                    
                }
            }
            if (libros.isEmpty()){
  				System.out.println("\nNo se ha cargado ningun libro");
  			}
  			else {
  				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas +" libro(s)");
  			}
            
		} catch (FileNotFoundException e) {
			System.out.println("\nNo se encuentra el fichero de carga");
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		
		return libros;
	}
}