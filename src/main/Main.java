package main;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import modelo.Libro;


public class Main {
	
	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub
		ArrayList<Libro> libros = new ArrayList<Libro>();
		int opcion = 0;
		do {
			
			opcion = modelo.Menu.crearMenu();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Leer ficheros");
				try {
					controlador.LeerFichero.leerFichero(libros);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				
				System.out.println("Escribir ficheros");
				switch(modelo.Menu.crearSubmenu("Escribir")) {
				
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
				System.out.println("Insertar libro");
				libros = controlador.MetodosAdicionales.insertarLibro(libros);
				
			case 0:
				System.out.println("Saliendo al menu...");
				break;
			
			}
			
		}while (opcion != 0);

	}
		
		

}
