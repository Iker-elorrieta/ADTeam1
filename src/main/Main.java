package main;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import controlador.MetodosAdicionales;
import modelo.Libro;
import modelo.Menu;


public class Main {
	
	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {

		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		boolean salir = false;
		
		int opcion = 0;
		
		do {
			
			opcion = modelo.Menu.crearMenu();
			
			switch (opcion) {
			
			case 1:
				System.out.println("\n --LEER FICHEROS--");
				try {
					controlador.LeerFichero.leerFichero(libros);
				} catch (ParseException e) {

					e.printStackTrace();
				}
				break;
			case 2:
				
				switch(modelo.Menu.crearSubmenuEscribirFichero("Escribir")) {
				
				case 1: 
					controlador.EscribirFichero.escribirFicheroTxt(libros);
					break;
				case 2:
					controlador.EscribirFichero.escribirFicheroDat(libros);
					break;
				case 3:
					controlador.EscribirFichero.escribirFicheroXml(libros);
					break;
				}
				
				break;
				
			case 3: 
				Menu.mostrarIntro();
				System.out.println("\n--INSERTAR LIBRO--");
				libros = controlador.MetodosAdicionales.insertarLibro(libros);
				
				break;
				
			case 4:
				MetodosAdicionales.mostrarLibros(libros);
				
				break;
				
			case 0:
				System.out.println("Saliendo del programa...");
				
				salir = true;
				break;
			
			}
			
		}while (!salir);

	}
		
		

}
