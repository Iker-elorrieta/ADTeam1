package controlador;

import java.util.Scanner;

import excepciones.ExcepcionCampoVacio;
import excepciones.ExcepcionIntervalo;
import modelo.Menu;

public class MetodosAdicionales {
	

	public static int solicitarOpcion(Scanner sc, int maxOpcion, int minOpcion, String tipoMenu) {
		
		boolean error = true;
		int opcion = 0;
		
		do {
				
			try {
				opcion = Integer.parseInt(verificarInsercionDatos(sc,"\nIntroduzca una opcion: "));	
				ExcepcionIntervalo.rango(opcion, maxOpcion, minOpcion);
				error = false;
				break;
				
			}catch(ExcepcionIntervalo ex) {
				System.out.println(ex.getMessage());

				error = true;
				
			}catch(Exception e) {
				System.out.println("\n\n--------\n ERROR! \n--------\nDebe escribir un numero de los indicados en las opciones");

				error = true;
			}
			
			if (tipoMenu.equalsIgnoreCase("menuPrincipal")) {
				System.out.println(Menu.mostrarMenu());
			}
			else if (tipoMenu.equalsIgnoreCase("submenuLeer")) {
				System.out.println(Menu.mostrarSubmenu("leer"));
			}
			
		}while(error);
		
		return opcion;
	
	}
	
	
	public static String verificarInsercionDatos(Scanner sc, String pMensaje){;
		
		boolean error = true;
		String str = null;
		do {
			System.out.print(pMensaje);
			try {
				str = sc.nextLine();
				ExcepcionCampoVacio.comprobarCampoVacio(str);
				error = false;
			} catch (ExcepcionCampoVacio exCV) {
				System.out.println(exCV.getMessage());
			}
			
		}while(error);
		
		return str;
	}
	
	public static String comprobarOS() {
		
		String sOS = System.getProperty("os.name");
		
		return sOS;
	}
}
