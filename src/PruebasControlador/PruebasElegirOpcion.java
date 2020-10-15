package PruebasControlador;

import java.util.Scanner;

import excepciones.ExcepcionIntervalo;
import modelo.Menu;

public class PruebasElegirOpcion {

	public int solicitarOpcion(Scanner sc, int maxOpcion, int minOpcion, String tipoMenu) {
		
		boolean error = true;
		int opcion = 0;
		
		do {
			
			System.out.print("\nEscoja una opcion: ");
	
			try {
				opcion = sc.nextInt();	
				sc.nextLine();
				ExcepcionIntervalo.rango(opcion, maxOpcion, minOpcion);
				error = false;
				break;
				
			}catch(ExcepcionIntervalo ex) {
				System.out.println(ex.getMessage());
				error = true;
				sc.nextLine();
				
			}catch(Exception e) {
				System.out.println("\n\n--------\n ERROR! \n--------\nDebe escribir un numero de los indicados en las opciones");
				error = true;
				sc.nextLine();
			}
			
			if (tipoMenu.equalsIgnoreCase("menuPrincipal")) {
				Menu.mostrarMenu();
			}
			else if (tipoMenu.equalsIgnoreCase("submenuLeer")) {
				Menu.mostrarSubmenu("leer");
			}
			else if (tipoMenu.equalsIgnoreCase("submenuEscribir")) {
				Menu.mostrarSubmenu("escribir");
			}
		}while(error);
		
		return opcion;
		
	}
}
