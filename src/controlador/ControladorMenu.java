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
	
	Scanner sc = new Scanner(System.in);
	JFileChooser fc = new JFileChooser();
	
	public ControladorMenu() {
		
	}
	
	public boolean iniciarControladorMenu(Scanner sc){
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		ExploradorDeArchivos exp;
		
		boolean salir = false;
				
		do {
			System.out.println(Menu.mostrarMenu());		
					
			switch (MetodosAdicionales.solicitarOpcion(sc,3, 0, "menuPrincipal")) {
			
			case 1:
				LectorFichero lecFichero = new LectorFichero(libros);

				System.out.println(Menu.mostrarSubmenu("Leer"));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, "submenuLeer")) {
				
				case 1: 
					
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".txt");
					exp.iniciarHilo();
					
					//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
					try {
						exp.join();
					} catch (InterruptedException e) {
						System.out.println("Interrupted Exception");
					}
					
					//Creamos el fichero a leer y lo leemos, solo si el usuario ha seleccionado un archivo
					if(exp.getSeleccionUsuario() == JFileChooser.APPROVE_OPTION) {
						lecFichero.leerFicheroTxt(exp.generarFichero());
					}
					
					break;
					
				case 2:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".dat");
					exp.start();
					
					//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
					try {
						exp.join();
					} catch (InterruptedException e) {
						System.out.println("Interrupted Exception");
					}
					
					//Creamos el fichero a leer y lo leemos, solo si el usuario ha seleccionado un archivo
					if(exp.getSeleccionUsuario() == JFileChooser.APPROVE_OPTION) {
						lecFichero.leerFicheroDat(exp.generarFichero());
					}
					
					break;
					
				case 3:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".xml");
					exp.start();
					//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
					try {
						exp.join();
					} catch (InterruptedException e) {
						System.out.println("Interrupted Exception");
					}
					//Creamos el fichero a leer y lo leemos, solo si el usuario ha seleccionado un archivo
					if(exp.getSeleccionUsuario() == JFileChooser.APPROVE_OPTION) {
						lecFichero.leerFicheroXml(exp.generarFichero());
					}
					
					break;
					
				case 4:
					//Creamos el explorador de archivos y lanzamos su ejecucion
					exp = new ExploradorDeArchivos(1, ".csv");
					exp.start();
					//Paramos el hilo principal hasta que el usuario seleccione un archivo o cancele la operacion
					try {
						exp.join();
					} catch (InterruptedException e) {
						System.out.println("Interrupted Exception");
					}
					if(exp.getSeleccionUsuario() == JFileChooser.APPROVE_OPTION) {
						lecFichero.leerFicheroCsv(exp.generarFichero());
					}
					
					break;
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
				
				System.out.println(Menu.mostrarSubmenu("Escribir"));
								
				switch(MetodosAdicionales.solicitarOpcion(sc, 4, 0, "submenuEscribir")) {
				
				case 1: 
				
					File ficheroTxt = new File("ficherosDeSalida" + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".txt");
					boolean sobreescribir = EscritorFichero.aniadirDatosFicheroExistente(sc, ficheroTxt);
					escFichero.escribirFicheroTxt(ficheroTxt, sobreescribir);
					break;
					
				case 2:
					File ficheroDat = new File("ficherosDeSalida" + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".dat");
					escFichero.escribirFicheroDat(ficheroDat);
					break;
					
				case 3:
					File ficheroXml = new File("ficherosDeSalida" + File.separator + EscritorFichero.solicitarNombreFichero(sc) + ".xml");
					escFichero.escribirFicheroXml(ficheroXml);
					break;
					
				case 4:
					File ficheroCsv = new File("ficherosDeSalida" + File.separator +  EscritorFichero.solicitarNombreFichero(sc) + ".csv");
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
