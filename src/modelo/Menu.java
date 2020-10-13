package modelo;

import java.util.Scanner;

import controlador.MetodosAdicionales;
import excepciones.ExcepcionIntervalo;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	
	public static void mostrarMenu(){
		
		mostrarIntro();
		System.out.println("\n  --MENU PRINCIPAL--\n");
		System.out.println(" 1) Leer ficheros");
		System.out.println(" 2) Escribir ficheros");
		System.out.println(" 3) Insertar libro");
		System.out.println(" 4) Mostrar libros");
		System.out.println(" 5) Borrar memoria");
		System.out.println(" 0) Salir");

	}
	
	public static void mostrarSubmenu(String categoria) {
			
		mostrarIntro();
		if (categoria.equalsIgnoreCase("leer")) {
			
			System.out.println("\n  --LEER FICHEROS--");
		}
		else if(categoria.equalsIgnoreCase("escribir")) {
			
			System.out.println("\n  --ESCRIBIR FICHEROS--");
		}
		
		System.out.println("\nEn que formato desea " + categoria.toLowerCase() + " los datos:\n");
		System.out.println(" 1) "+ categoria +" ficheros .txt");
		System.out.println(" 2) "+ categoria +" ficheros .dat");
		System.out.println(" 3) "+ categoria +" ficheros .xml");
		System.out.println(" 0) Cancelar");		

	}
	
	public static void mostrarIntro() {
		System.out.println("\n\n********************************\n*          BIBLIOTECA          *\n*          " + MetodosAdicionales.comprobarOS() + "          *\n*                              *\n*                              *\n* Grupo 1                v1.0  *\n********************************\n");
	}

}
