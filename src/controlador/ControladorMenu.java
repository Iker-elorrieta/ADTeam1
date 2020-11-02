package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import manejoDeFicheros.EscritorFichero;
import manejoDeFicheros.LectorFichero;
import modelo.Libro;
import modelo.Menu;

public class ControladorMenu {
	
	private static final String FDS = "ficherosDeSalida";
	private static final String MP = "menuPrincipal";
	private static final String SUB_L = "submenuLeer";
	private static final String SUB_E = "submenuEscribir";
	private static final String LEER = "leer";
	private static final String ESCR = "escribir";
	
	private static File FICHERO_ENTRADA;
	private static File FICHERO_SALIDA;


	Scanner sc = new Scanner(System.in);
	
	public ControladorMenu() {
		
	}
	
	public boolean iniciarControladorMenu(Scanner sc){
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		boolean salir = false;
				
		do {
			System.out.println(Menu.mostrarMenu());		
					
			switch (MetodosAdicionales.solicitarOpcion(sc,3, 0, MP)) {
			
			case 1:
				LectorFichero lecFichero = new LectorFichero(libros);

				System.out.println(Menu.mostrarSubmenu(LEER));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, SUB_L)) {
				
				case 1: 
				
					FICHERO_ENTRADA = new File(FDS + File.separator + "libros.txt");
					lecFichero.leerFicheroTxt(FICHERO_ENTRADA);
					break;
					
				case 2:
					FICHERO_ENTRADA = new File(FDS + File.separator + "libros.dat");
					lecFichero.leerFicheroDat(FICHERO_ENTRADA);
					break;
					
				case 3:
					FICHERO_ENTRADA = new File(FDS + File.separator + "libros.xml");
					lecFichero.leerFicheroXml(FICHERO_ENTRADA);
					break;
					
				case 4:
					FICHERO_ENTRADA = new File(FDS + File.separator + "libros.csv");
					lecFichero.leerFicheroCsv(FICHERO_ENTRADA);
					break;
				}
				
				libros = lecFichero.getLibros();
				
			
//////////////////////////////////////////////////////////////////////////
//				DESCOMENTAR PARA MOSTRAR LOS LIBROS QUE HAY EN LA MEMORIA DESPUES DE REALIZAR UNA LECTURA DE FICHERO
//				
//				
//				for(Libro libro : libros) {
//					System.out.println(libro.toString());
//				}
//				System.out.println("\nNum libros en memoria: " + libros.size());
//////////////////////////////////////////////////////////////////////////				
				
				break;

			case 2:
				
				EscritorFichero escFichero = new EscritorFichero(libros);
				
				System.out.println(Menu.mostrarSubmenu(ESCR));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, SUB_E)) {
				
				case 1: 
				
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".txt");
					escFichero.escribirFicheroTxt(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(sc, FICHERO_SALIDA));
					break;
					
				case 2:
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".dat");
					escFichero.escribirFicheroDat(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(sc, FICHERO_SALIDA));
					break;
					
				case 3:
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".xml");
					escFichero.escribirFicheroXml(FICHERO_SALIDA);
					break;
					
				case 4:
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".csv");
					escFichero.escribirFicheroCsv(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(sc, FICHERO_SALIDA));
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
