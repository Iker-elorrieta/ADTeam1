package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import manejoDeFicheros.EscritorFichero;
import manejoDeFicheros.LectorFichero;
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
					
			switch (MetodosAdicionales.solicitarOpcion(sc,3, 0, "menuPrincipal")) {
			
			case 1:
				LectorFichero lecFichero = new LectorFichero(libros);

				System.out.println(Menu.mostrarSubmenu("Leer"));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, "submenuLeer")) {
				
				case 1: 
				
					File ficheroTxt = new File("ficherosDeSalida\\libros.txt");
					lecFichero.leerFicheroTxt(ficheroTxt);
					break;
					
				case 2:
					File ficheroDat = new File("ficherosDeSalida\\libros.dat");
					lecFichero.leerFicheroDat(ficheroDat);
					break;
					
				case 3:
					File ficheroXml = new File("ficherosDeSalida\\libros.xml");
					lecFichero.leerFicheroXml(ficheroXml);
					break;
					
				case 4:
					File ficheroCsv = new File("ficherosDeSalida\\libros.csv");
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

			case 2:
				
				EscritorFichero escFichero = new EscritorFichero(libros);
				
				System.out.println(Menu.mostrarSubmenu("Escribir"));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, "submenuEscribir")) {
				
				case 1: 
				
					File ficheroTxt = new File("ficherosDeSalida\\" + EscritorFichero.solicitarNombreFichero(sc) + ".txt");
					boolean sobreescribir = EscritorFichero.aniadirDatosFicheroExistente(sc, ficheroTxt);
					escFichero.escribirFicheroTxt(ficheroTxt, sobreescribir);
					break;
					
				case 2:
					File ficheroDat = new File("ficherosDeSalida\\" + EscritorFichero.solicitarNombreFichero(sc) + ".dat");
					escFichero.escribirFicheroDat(ficheroDat);
					break;
					
				case 3:
					File ficheroXml = new File("ficherosDeSalida\\" + EscritorFichero.solicitarNombreFichero(sc) + ".xml");
					escFichero.escribirFicheroXml(ficheroXml);
					break;
					
				case 4:
					File ficheroCsv = new File("ficherosDeSalida\\" + EscritorFichero.solicitarNombreFichero(sc) + ".csv");
					escFichero.escribirFicheroCsv(ficheroCsv);
					break;
				}
				
				break;
			case 3:
				MetodosAdicionales.insertarLibro(sc, libros);
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
