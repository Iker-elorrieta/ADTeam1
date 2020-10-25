package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Libro;
import modelo.Menu;

public class ControladorMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public ControladorMenu() {
		
	}
	
	public boolean iniciarControladorMenu(Scanner sc){
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		boolean salir = false;
				
		do {
			System.out.println(Menu.mostrarMenu());		
					
			switch (MetodosAdicionales.solicitarOpcion(sc,1, 0, "menuPrincipal")) {
			
			case 1:
				LectorFichero lecFichero = new LectorFichero(libros);

				System.out.println(Menu.mostrarSubmenu("Leer"));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, "submenuLeer")) {
				
				case 1: 
				
					File ficheroTxt = new File("libros.txt");
					lecFichero.leerFicheroTxt(ficheroTxt);
					break;
					
				case 2:
					File ficheroDat = new File("libros.dat");
					lecFichero.leerFicheroDat(ficheroDat);
					break;
					
				case 3:
					File ficheroXml = new File("libros.xml");
					lecFichero.leerFicheroXml(ficheroXml);
					break;
					
				case 4:
					File ficheroCsv = new File("libros.csv");
					lecFichero.leerFicheroCsv(ficheroCsv);
					break;
				}
				
				libros = lecFichero.getLibros();
				
				
//////////////////////////////////////////////////////////////////////////
//				DESCOMENTAR PARA MOSTRAR LOS LIBROS QUE HAY EN LA MEMORIA DESPUES DE REALIZAR UNA LECTURA DE FICHERO
//				
				
				for(Libro libro : libros) {
					System.out.println(libro.toString());
				}
				System.out.println("\nNum libros en memoria: " + libros.size());
//////////////////////////////////////////////////////////////////////////				
				
				break;

			case 0:
				System.out.println("\nSaliendo del programa...");
				
				salir = true;
				break;
			}
		}while (!salir);
		return true;
	}
}
