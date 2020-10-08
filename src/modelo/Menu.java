package modelo;

import java.util.Scanner;

import controlador.ExcepcionIntervalo;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	
	public static int crearMenu(){
		int opcion = 0;
		boolean error = false;
		
		do {
			mostrarIntro();
			System.out.println("\n  --MENU PRINCIPAL--\n");
			System.out.println(" 1) Leer ficheros");
			System.out.println(" 2) Escribir ficheros");
			System.out.println(" 3) Insertar libro");
			System.out.println(" 0) Salir");
			System.out.print("\nEscoja una opcion: ");

			try {
				opcion = sc.nextInt();
				error = true;
				ExcepcionIntervalo.rango(3, 0, opcion);
			}catch(ExcepcionIntervalo ex) {
				System.out.println(ex.getMessage());
				sc.nextLine();
				error = false;
				
			}catch(Exception e) {
				System.out.println("\nERROR!\nDebe escribir un numero de los indicados en las opciones");
				sc.nextLine();
				error = false;
			}
			
		}while(!error);
		
		
		return opcion;
	}
	
	public static int crearSubmenuEscribirFichero(String categoria) {
		
		int opcion = 0;
		boolean error = false;
		do {
			mostrarIntro();
			System.out.println("\n  --ESCRIBIR FICHEROS--");
			System.out.println("\nEn que formato desea guardar los datos:\n");
			System.out.println(" 1) "+ categoria +" ficheros .txt");
			System.out.println(" 2) "+ categoria +" ficheros .dat");
			System.out.println(" 3) "+ categoria +" ficheros .xml");
			System.out.println(" 0) Cancelar");
			System.out.print("\nEscoja una opcion: ");
			
			try {
				opcion = sc.nextInt();
				error = true;
				ExcepcionIntervalo.rango(3, 0, opcion);
			}catch(ExcepcionIntervalo ex) {
				System.out.println(ex.getMessage());
				sc.nextLine();
				error = false; 
				
			}catch(Exception e) {
				System.out.println("\nERROR!\nDebe escribir un numero de los indicados en las opciones");
				sc.nextLine();
				error = false;
			}
			
		}while(!error);
		
		
		return opcion;
		

	}
	
	public static void mostrarIntro() {
		System.out.println("\n\n********************************\n*          BIBLIOTECA          *\n*                              *\n*                              *\n* Grupo 1                v1.0  *\n********************************\n");
	}

}
