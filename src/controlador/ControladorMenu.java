package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

import manejoDeFicheros.EscritorFichero;
import manejoDeFicheros.GestorDeArchivos;
import manejoDeFicheros.LectorFichero;
import modelo.Libro;
import modelo.Menu;

public class ControladorMenu {
	
	private static final String MP = "menuPrincipal";
	private static final String SUB_L = "submenuLeer";
	private static final String SUB_E = "submenuEscribir";
	private static final String LEER = "Leer";
	private static final String ESCR = "Escribir";


	
	private static File FICHERO_SALIDA;

	public JFileChooser jfc = new JFileChooser();
	Scanner sc = new Scanner(System.in);
	
	public ControladorMenu() {
		
	}
	
	public boolean iniciarControladorMenu(){
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		GestorDeArchivos exp;
		
		int opcionSubMenu;
		boolean salir = false;
				
		do {
			System.out.println(Menu.mostrarMenu());		
					
			switch (MetodosAdicionales.solicitarOpcion(4, 0, MP)) {
			
			case 1:
				LectorFichero lecFichero = new LectorFichero(libros);
				exp = null;

				System.out.println(Menu.mostrarSubmenu(LEER));
					
				opcionSubMenu = MetodosAdicionales.solicitarOpcion(4, 0, SUB_L);
				switch(opcionSubMenu) {
				
				
				case 1: 
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(1, ".txt");
					
					break;
				case 2: 
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(1, ".dat");
					
					break;
				case 3:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(1, ".xml");
					
					break;
				case 4:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(1, ".csv");
					
					break;
				}
			
				if(exp != null) {
					
					exp.iniciarHilo();
					
					//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
					try {
						exp.join();
					} catch (InterruptedException e) {
						System.out.println("Interrupted Exception");
					}
					if(exp.getRutaFichero() != null) {
						FICHERO_SALIDA = exp.generarFichero();
						switch(opcionSubMenu) {
						
						case 1: 
							lecFichero.leerFicheroTxt(FICHERO_SALIDA);
							break;
						case 2: 
							lecFichero.leerFicheroDat(FICHERO_SALIDA);
							break;
						case 3: 
							lecFichero.leerFicheroXml(FICHERO_SALIDA);
							break;
						case 4: 
							lecFichero.leerFicheroCsv(FICHERO_SALIDA);
							break;
							
						}
					}					
				}
				
				libros = lecFichero.getLibros();		
				
				break;

			case 2:
				
				EscritorFichero escFichero = new EscritorFichero(libros);
				exp = null;

				System.out.println(Menu.mostrarSubmenu(ESCR));
					
				opcionSubMenu = MetodosAdicionales.solicitarOpcion(4, 0, SUB_E);
				
				switch(opcionSubMenu) {
				
				case 1: 
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(2, ".txt");
					
					break;
				case 2: 
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(2, ".dat");
					
					break;
				case 3:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(2, ".xml");
					
					break;
				case 4:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new GestorDeArchivos(2, ".csv");
					
					break;
				}
				
				if(exp != null) {
					
					exp.iniciarHilo();
					
					//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
					try {
						exp.join();
					} catch (InterruptedException e) {
						System.out.println("Interrupted Exception");
					}
					if(exp.getRutaFichero() != null) {
						FICHERO_SALIDA = exp.generarFichero();
						switch(opcionSubMenu) {
						
						case 1: 
							escFichero.escribirFicheroTxt(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(FICHERO_SALIDA));
							break;
							
						case 2:
							escFichero.escribirFicheroDat(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(FICHERO_SALIDA));
							break;
							
						case 3:
							escFichero.escribirFicheroXml(FICHERO_SALIDA);
							break;
							
						case 4:
							escFichero.escribirFicheroCsv(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(FICHERO_SALIDA));
							break;
						}
					}					
				}
				break;
				
				
			case 3:
				MetodosAdicionales.insertarLibro(libros);
				break;
				
			case 4:
				MetodosAdicionales.mostrarLibrosMemoria(libros);
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