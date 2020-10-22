package modelo;

import java.util.Scanner;

import controlador.MetodosAdicionales;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	
	public static String mostrarMenu(){
		
		System.out.println(mostrarIntro());
		
		return "\n  --MENU PRINCIPAL--\n\n 1) Leer ficheros\n 2) Escribir ficheros\n 3) Insertar libro\n 0) Salir";
	}
	
	public static String mostrarSubmenu(String categoria) {
			
		String cabecera = "";
		System.out.println(mostrarIntro());
		if (categoria.equalsIgnoreCase("leer")) {
			
			cabecera = "\n  --LEER FICHEROS--\n";
		}
		else if(categoria.equalsIgnoreCase("escribir")) {
			
			cabecera = "\n  --ESCRIBIR FICHEROS--\n";
		}
		
		return (cabecera + "\nEn que formato desea " + categoria.toLowerCase() + " los datos:\n\n"
				+ " 1) " + categoria + " ficheros .txt\n"
				+ " 2) " + categoria + " ficheros .dat\n"
				+ " 3) " + categoria + " ficheros .xml\n"
				+ " 4) " + categoria + " ficheros .csv\n"
				+ " 0) Cancelar");
	}
	
	public static String mostrarSubmenuSobreescribir() {
		return "\nEl nombre del fichero introducido ya existe.\n"
				+ " Que desea realizar?\n\n"
				+ " 1) Sobreescribir datos\n"
				+ " 2) Añadir datos\n";

	}
	
	public static String mostrarIntro() {
		
		String sOS = MetodosAdicionales.comprobarOS();
		
		if(System.getProperty("os.name").equalsIgnoreCase("Linux")) {
			sOS = "  " + System.getProperty("os.name") + "   ";
		}
		
		return "\n\n********************************\n*          BIBLIOTECA          *\n*          " + sOS + "          *\n*                              *\n*                              *\n* Grupo 1                v1.0  *\n********************************\n";
	}

}
