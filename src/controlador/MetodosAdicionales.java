package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import excepciones.ExcepcionCampoVacio;
import excepciones.ExcepcionIntervalo;
import excepciones.ExcepcionRespuesta;
import modelo.Libro;
import modelo.Menu;

public class MetodosAdicionales {

	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Libro> insertarLibro(ArrayList<Libro> pLibros) throws InterruptedException{
		
		//Recoger ArrayList de la memoria
		ArrayList<Libro> libros = pLibros;
		
		//Inicializar las variables para la creacion del libro
		String tituloNuevoLibro;
		String editorialNuevoLibro;
		int paginasNuevoLibro = 0;
		double alturaNuevoLibro = 0;
		String notasNuevoLibro;
		String isbnNuevoLibro;
		String materiasNuevoLibro;
		//Inicializar la variable para las comprobaciones
		boolean error = true;
		 
		Menu.mostrarIntro();

		System.out.println("\n  --INSERTAR LIBRO--");

		//Pedir nombre del libro
		tituloNuevoLibro = verificarInsercionDatos("\nEscriba el nombre del libro: ");
		
		
		//pedir editorial del libro
		editorialNuevoLibro = verificarInsercionDatos("\nEscriba la editorial del libro: ");
		
		
		do {
			//Pedir numero de paginas del libro
			try{
				//Recoger las paginas
				paginasNuevoLibro = Integer.parseInt(verificarInsercionDatos("\nEscriba el numero de paginas que tiene el libro: "));
				//En caso de que no sea un int va al catch sino sigue
				//si es un int error cambia a false 
				error = false;
			}catch(Exception e) {
				//Se muestra el mensaje indicando el error
				System.out.println("\nERROR: No introduzca caracteres no numericos a la hora de indicar el numero de paginas del libro");
				//Se limpia el buffer del scanner para no entrar en un bucle infinito
			}
					
			//se hacen comprobaciones y si alguna se cumple lo pide otra vez
		}while(paginasNuevoLibro <= 0 || error == true);
		
		//se reinicia la variable de error
		error = true;
		
		do {
			
			//Se pide la altura del libro y se compruba igual que las paginas
			try{
				alturaNuevoLibro = Integer.parseInt(verificarInsercionDatos("\nEscriba la altura del libro: "));
				error = false;
			}catch(Exception w) {
				System.out.println("\nERROR: No introduzca caracteres no numericos a la hora de indicar la altura del libro");
			}
			
		}while(alturaNuevoLibro == 0 || error== true);

		//Se piden anotaciones del libro
		notasNuevoLibro = verificarInsercionDatos("\nEscriba alguna anotacion para el libro: ");
		
		//Se pide el ISBN del libro
		isbnNuevoLibro = verificarInsercionDatos("\nEscriba el ISBN del libro: ");
		
		//Se pide la materia del libro
		materiasNuevoLibro = verificarInsercionDatos("\nEscriba la materia para la que fue creado el libro: ");
		
		//Se crea el nuevo libro
		Libro libro = new Libro(tituloNuevoLibro, editorialNuevoLibro, paginasNuevoLibro, alturaNuevoLibro,notasNuevoLibro,isbnNuevoLibro,materiasNuevoLibro );
		//se a�ade el nuevo libro al array
		libros.add(libro);
		//se muestra la informacion del libro a�adido
		System.out.println(libro.toStringFormateado());
		System.out.println("\nLIBRO AÑADIDO A LA MEMORIA CON EXITO");
		//Devuelve el array con los libros
		return libros;
	}
	
	public static void mostrarLibros(ArrayList<Libro> pLibros) {
		
		ArrayList<Libro> libros = pLibros;
		
		if (libros.isEmpty()) {
			System.out.println("\nNO SE HA ENCONTRADO NINGUN LIBRO QUE MOSTRAR\n");
		}
		else {
			for(Libro libro : libros) {
				
				System.out.println(libro.toStringFormateado());	
			}
			System.out.println("\n Numero de total de libros: " + libros.size());
		}
	}
	
	public static int solicitarOpcion(int maxOpcion, int minOpcion, String tipoMenu) {
		
		boolean error = true;
		int opcion = 0;
		
		do {
				
			try {
				opcion = Integer.parseInt(verificarInsercionDatos("\nIntroduzca una opcion: "));	
				ExcepcionIntervalo.rango(opcion, maxOpcion, minOpcion);
				error = false;
				break;
				
			}catch(ExcepcionIntervalo ex) {
				System.out.println(ex.getMessage());
				
			}catch(Exception e) {
				System.out.println("\n\n--------\n ERROR! \n--------\nDebe escribir un numero de los indicados en las opciones");
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
			else if (tipoMenu.equalsIgnoreCase("submenuSobreescribir")) {
				Menu.mostrarSubmenuSobreescribir();
			}
		}while(error);
		
		return opcion;
		
	}
	
	
	public static ArrayList<Libro> borrarMemoria(ArrayList<Libro> pLibros) throws InterruptedException{
		
		ArrayList<Libro> libros = pLibros;
		
		boolean error = true;
		String respuesta = null;
		
		do {
		
			System.out.print("\nEsta seguro de que desea borrar la memoria? (S/N): ");
			try{
				respuesta = sc.nextLine();
				ExcepcionRespuesta.comprobarRespuesta(respuesta);
				error = false;
						
			}
			catch(ExcepcionRespuesta exR) {
				
				System.out.println(exR.getMessage());
			}
		} while(error);
		
		if (respuesta.equalsIgnoreCase("S")) {
			libros.clear();
			
			System.out.println("\nMEMORIA BORRADA");
			
		}
		else {
			System.out.println("\nOperacion cancelada\nVolviendo al menu principal...");
		}
		
		return libros;
		
	}
	
	public static String verificarInsercionDatos(String pMensaje) throws InterruptedException {;
		
		boolean error = true;
		String str = "";
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
