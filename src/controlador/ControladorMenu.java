package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Libro;
import modelo.Menu;

public class ControladorMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public ControladorMenu() {
		
	}
	
	public boolean iniciarControladorMenu(Scanner sc){
		
		this.sc = sc;
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		boolean salir = false;
				
		do {
			System.out.println(Menu.mostrarMenu());		
					
			switch (MetodosAdicionales.solicitarOpcion(sc,1, 0, "menuPrincipal")) {
			
			case 1:
				System.out.println(Menu.mostrarSubmenu("Leer"));
								
				switch(MetodosAdicionales.solicitarOpcion(sc,4, 0, "submenuLeer")) {
				
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
//////////////////////////////////////////////////////////////////////////
//				DESCOMENTAR PARA MOSTRAR LOS LIBROS QUE HAY EN LA MEMORIA DESPUES DE REALIZAR UNA LECTURA DE FICHERO
//				
//				for(Libro libro : libros) {
//					System.out.println(libro.toString());
//				}
//				System.out.println("\nNum libros en memoria: " + libros.size());
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
