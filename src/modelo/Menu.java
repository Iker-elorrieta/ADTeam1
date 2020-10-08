package modelo;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	
	public static int crearMenu() {
		int opcion = 0;
		boolean error = false;
		do {
			System.out.println("Escoja una opcion: ");
			System.out.println("0) Salir");
			System.out.println("1) Leer ficheros");
			System.out.println("2) Escribir ficheros");
			System.out.println("3) Insertar libro");
			try {
				opcion = sc.nextInt();
				error = true;
			}catch(Exception e) {
				System.out.println("Debe escribir un numero de los indicados en las opciones");
				sc.nextLine();
			}
			
		}while(error = false || opcion < 0 || opcion > 3);
		
		
		return opcion;
	}
	
	public static int crearSubmenu(String categoria) {
		
		int opcion = 0;
		boolean error = false;
		do {
			System.out.println("Que quiere " + categoria + ": ");
			System.out.println("1) "+ categoria +" ficheros .txt");
			System.out.println("2) "+ categoria +" ficheros .dat");
			System.out.println("3) "+ categoria +" ficheros .xml");
			try {
				opcion = sc.nextInt();
				error = true;
			}catch(Exception e) {
				System.out.println("Debe escribir un numero de los indicados en las opciones");
				sc.nextLine();
			}
			
		}while(error = false || opcion < 1 || opcion > 3);
		
		
		return opcion;
		

	}
}
