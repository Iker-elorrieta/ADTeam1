package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import modelo.Libro;
import modelo.Menu;

public class ControladorMenu {

	public static void iniciarControladorMenu() throws InterruptedException, IOException, ParseException, ClassNotFoundException, ParserConfigurationException, TransformerException {
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		boolean salir = false;
				
		do {
				
			Menu.mostrarMenu();		
					
			
			switch (MetodosAdicionales.solicitarOpcion(5, 0, "menuPrincipal")) {
			
			case 1:
				Menu.mostrarSubmenu("Leer");
								
				switch(MetodosAdicionales.solicitarOpcion(4, 0, "submenuLeer")) {
				
				case 1: 
					LeerFichero.leerFicheroTxt(libros);
					break;
					
				case 2:
					LeerFichero.leerFicheroDat(libros);
					break;
					
				case 3:
					LeerFichero.leerFicheroXml(libros);
					break;
					
				case 4:
					LeerFichero.leerFicheroCsv(libros);
					break;
				}
				break;
				
			case 2:							
				Menu.mostrarSubmenu("Escribir");
									
				switch(MetodosAdicionales.solicitarOpcion(4, 0, "submenuEscribir")) {
				
				case 1: 
					EscribirFichero.escribirFicheroTxt(libros);
					break;
					
				case 2:
					EscribirFichero.escribirFicheroDat(libros);
					break;
					
				case 3:
					EscribirFichero.escribirFicheroXml(libros);
					break;
					
				case 4:
					EscribirFichero.escribirFicheroCsv(libros);
					break;
				}
				
				break;
				
			case 3: 
				libros = MetodosAdicionales.insertarLibro(libros);
				
				break;
				
			case 4:
				MetodosAdicionales.mostrarLibros(libros);
				
				break;
				
			case 5:
				MetodosAdicionales.borrarMemoria(libros);
				
				break;
				
			case 0:
				System.out.println("\nSaliendo del programa...");
				
				salir = true;
				break;
			
			}
			
		}while (!salir);

	}
}
