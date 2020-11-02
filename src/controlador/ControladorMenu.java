package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

import manejoDeFicheros.EscritorFichero;
import manejoDeFicheros.ExploradorDeArchivos;
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

	public JFileChooser jfc = new JFileChooser();
	Scanner sc = new Scanner(System.in);
	
	public ControladorMenu() {
		
	}
	
	public boolean iniciarControladorMenu(){
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();

		
		boolean salir = false;
				
		do {
			System.out.println(Menu.mostrarMenu());		
					
			switch (MetodosAdicionales.solicitarOpcion(3, 0, MP)) {
			
			case 1:
				LectorFichero lecFichero = new LectorFichero(libros);
				ExploradorDeArchivos exp = null;

				System.out.println(Menu.mostrarSubmenu(LEER));
					
				int opcionSubMenu = MetodosAdicionales.solicitarOpcion(4, 0, SUB_L);
				switch(opcionSubMenu) {
				
				
				case 1: 
				
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".txt");
					
					break;
				
				case 2: 
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".dat");
					
					break;
				case 3:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".xml");
					
					break;
				case 4:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".csv");
					
					break;
				}
			
				if(exp != null) {
					//Creamos el fichero a leer y lo leemos, solo si el usuario ha seleccionado un archivo
					if(exp.getSeleccionUsuario() == JFileChooser.APPROVE_OPTION) {
						exp.iniciarHilo();
						
						//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
						try {
							exp.join();
						} catch (InterruptedException e) {
							System.out.println("Interrupted Exception");
						}
						
						switch(opcionSubMenu) {
						
						case 1: 
							lecFichero.leerFicheroTxt(exp.generarFichero());
							break;
						case 2: 
							lecFichero.leerFicheroDat(exp.generarFichero());
							break;
						case 3: 
							lecFichero.leerFicheroXml(exp.generarFichero());
							break;
						case 4: 
							lecFichero.leerFicheroCsv(exp.generarFichero());
							break;
							
						}
	
					}
				}
				
				libros = lecFichero.getLibros();
				
			
//////////////////////////////////////////////////////////////////////////
//				DESCOMENTAR PARA MOSTRAR LOS LIBROS QUE HAY EN LA MEMORIA DESPUES DE REALIZAR UNA LECTURA DE FICHERO
//				
//				
				for(Libro libro : libros) {
					System.out.println(libro.toString());
				}
				System.out.println("\nNum libros en memoria: " + libros.size());
//////////////////////////////////////////////////////////////////////////				
				
				break;

			case 2:
				
				EscritorFichero escFichero = new EscritorFichero(libros);
				
				System.out.println(Menu.mostrarSubmenu(ESCR));
								
				switch(MetodosAdicionales.solicitarOpcion(4, 0, SUB_E)) {
				
				case 1: 
				
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero() + ".txt");
					escFichero.escribirFicheroTxt(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(FICHERO_SALIDA));
					break;
					
				case 2:
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero() + ".dat");
					escFichero.escribirFicheroDat(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(FICHERO_SALIDA));
					break;
					
				case 3:
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero() + ".xml");
					escFichero.escribirFicheroXml(FICHERO_SALIDA);
					break;
					
				case 4:
					FICHERO_SALIDA = new File(FDS + File.separator + EscritorFichero.solicitarNombreFichero() + ".csv");
					escFichero.escribirFicheroCsv(FICHERO_SALIDA, EscritorFichero.aniadirDatosFicheroExistente(FICHERO_SALIDA));
					break;
				}
				
				break;
			case 3:
				MetodosAdicionales.insertarLibro(libros);
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