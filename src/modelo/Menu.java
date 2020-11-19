package modelo;

import java.util.Scanner;

import controlador.MetodosAdicionales;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	/**
	 * metodo que genera el menu principal
	 * @return String con el menu principal
	 */
	public static String mostrarMenu(){
		
		System.out.println(mostrarIntro());
		
		return "\n  --MENU PRINCIPAL--\n\n "
				+ "1) Leer ficheros\n "
				+ "2) Escribir ficheros\n "
				+ "3) Insertar libro\n "
				+ "4) Mostrar libros en memoria\n "
				+ "5) Borrar memoria\n "
				+ "6) Buscar libro\n "
				+ "7) Mover ficheros\n "
				+ "8) Modificar permisos\n\n "
				+ "0) Salir";
	}
	
	/**
	 * metodo que muestra el submenu depenciendo de si se va a leer o escribir
	 * @param categoria
	 * @return String con el submenu
	 */
	public static String mostrarSubmenu(String categoria) {
			
		String cabecera = "";
		System.out.println(mostrarIntro());
		switch(categoria) {
		
		case "leer":			
			cabecera = "\n  --LEER FICHEROS--\n";
			break;
		
		case "escribir":
			cabecera = "\n  --ESCRIBIR FICHEROS--\n";
			break;
		}
		
		return (cabecera + "\nEn que formato desea " + categoria.toLowerCase() + " los datos:\n\n"
				+ " 1) " + categoria + " ficheros .txt\n"
				+ " 2) " + categoria + " ficheros .dat\n"
				+ " 3) " + categoria + " ficheros .xml\n"
				+ " 4) " + categoria + " ficheros .csv\n"
				+ " 0) Cancelar");
	}
	
	/**
	 * metodo que devuelve el submenu cuando queremos saber si va a sobreescribir
	 * @return String con el submenu
	 */
	public static String mostrarSubmenuSobreescribir() {
		return "\nEl nombre del fichero introducido ya existe.\n"
				+ " Que desea realizar?\n\n"
				+ " 1) Sobreescribir datos\n"
				+ " 2) Añadir datos\n";

	}
	
	/**
	 * metodo que devuelve el submenu cuando queremos saber si va a modificar
	 * @return String con el submenu
	 */
	public static String mostrarSubmenuFicheros() {
				
		return "\nSe va a proceder a realizar modificaciones de ficheros.\n"
				+ " Que desea utilizar?\n\n"
				+ " 1) Ficheros de prueba\n"
				+ " 2) Seleccionar fichero con el explorador de archivos\n";

	}
	
	/**
	 * metodo que devuelve el submenu cuando cambiamos los permisos en Windows
	 * @return String con el submenu
	 */
	public static String mostrarSubmenuPermisosW() {
		
		return "\nSe va a proceder a modificar los permisos del usuario actual respecto al fichero seleccionado.\n"
				+ " Que permisos desea asignarle?\n\n"
				+ " 1) Asignar todos los permisos\n"
				+ " 2) Asignar permisos de solo lectura\n"
				+ " 3) Denegar todos los permisos\n\n";

	}
	
	/**
	 * metodo que devuelve el submenu cuando cambiamos los permisos en Linux
	 * @return String con el submenu
	 */
	public static String mostrarSubmenuPermisosL() {
		
		return " Que permisos desea asignarle?\n\n"
				+ " 0) Ningun permiso\n"
				+ " 1) Ejecucion\n"
				+ " 2) Escritura\n"
				+ " 3) Escritura y ejecucion\n"
				+ " 4) Lectura\n"
				+ " 5) Lectura y ejecucion\n"
				+ " 6) Lectura y escritura\n"
				+ " 7) Lectura, esritura y ejecucion\n\n";

		

	}
	/**
	 * metodo que devuelve la intro del programa
	 * @return String con la intro del programa
	 */
	public static String mostrarIntro() {
		
		String sOS = MetodosAdicionales.comprobarOS();
		
		
//		DESCOMENTAR EN EQUIPOS LINUX PARA UN FORMATEO CORRECTO DE LA INTRO 
//
//		if(sOS.equalsIgnoreCase("Linux")) {			
//			sOS = "  " + sOS + "   ";
//		}
		
		return "\n\n********************************\n*          BIBLIOTECA          *\n*          " + sOS + "          *\n*                              *\n*                              *\n* Grupo 1                v5.2  *\n********************************\n";
	}

}
