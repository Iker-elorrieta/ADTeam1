package main;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


import modelo.Libro;


public class Main {
	
	public static void main(String[] args) {
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
				try {
					controlador.EscribirFichero.escribirFicheraDat(libros);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
