package modelo;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	
	public static int crearMenu() {
		int opcion = 0;
		boolean error = false;
		do {
			System.out.println("Escoja una opcion: ");
			System.out.println("0- Salir");
			System.out.println("1- Leer ficheros");
			System.out.println("2- Mostrar Datos");
			try {
				opcion = sc.nextInt();
				error = true;
			}catch(Exception e) {
				System.out.println("Debe escribir un numero de los indicados en las opciones");
				sc.nextLine();
			}
			
		}while(error = false || opcion < 0 || opcion > 2);
		
		
		return opcion;
	}
}
