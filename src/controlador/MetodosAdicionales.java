package controlador;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import excepciones.ExcepcionCampoVacio;
import excepciones.ExcepcionIntervalo;
import excepciones.ExcepcionRespuesta;
import main.Main;
import manejoDeFicheros.GestorDeArchivos;
import modelo.Libro;
import modelo.Menu;

public class MetodosAdicionales {
	
	
	final static String LINUX = "Linux";
	final static String WINDOWS = "Windows 10";
	/**
	 * se carga un libro en el arraylist de libros
	 * @param el ArrayList de libros para añadirlo 
	 * @return el ArrayList con el libro
	 */
	public static ArrayList<Libro> insertarLibro(ArrayList<Libro> pLibros){
	
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
		//se añade el nuevo libro al array
		libros.add(libro);
		//se muestra la informacion del libro añadido
		System.out.println(libro.toStringFormateado());
		System.out.println("\nLIBRO AÑADIDO A LA MEMORIA CON EXITO");
		//Devuelve el array con los libros
		return libros;
	}
	
	
	/**
	 * Se encarga de pedir la opcion y de controlar que este dentro de las posibilidades
	 * @param Opcion maxima
	 * @param Opcion minima
	 * @param Tipo de menu
	 * @return opcion seleccionada
	 */
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
			else if (tipoMenu.equalsIgnoreCase("submenuEscribir")) {
				System.out.println(Menu.mostrarSubmenu("escribir"));
			}
			else if (tipoMenu.equalsIgnoreCase("submenuFicheros")) {
				System.out.println(Menu.mostrarSubmenuFicheros());
			}
			
		}while(error);
		
		return opcion;
	
	}
	
	/**
	 * Verifica los espacion vacios a la hora de meter las opciones, en caso de que haya espacios vacios lo pide otra ve<
	 * @param mensaje a comprobar
	 * @return frase 
	 */
	public static String verificarInsercionDatos(String pMensaje){;
		
		boolean error = true;
		String str = null;
		do {
			System.out.print(pMensaje);
			try {
				str = Main.sc.nextLine();
				ExcepcionCampoVacio.comprobarCampoVacio(str);
				error = false;
			} catch (ExcepcionCampoVacio exCV) {
				System.out.println(exCV.getMessage());
			}
			
		}while(error);
		
		return str;
	}
	
	/**
	 * muestra los libros que estan cargados en la memoria de la aplicacion es ese momento
	 * @param ArrayList con los libros cargados
	 * @return true si se ejecuta bien
	 */
	public static boolean mostrarLibrosMemoria(ArrayList<Libro> pLibros) {
		
		for(Libro libro : pLibros) {
			System.out.println(libro.toStringFormateado());
		}
		System.out.println("\nNum libros en memoria: " + pLibros.size());
		return true;
	}
	
	/**
	 * elimina todos los libros cargados de la memoria
	 * @param ArrayList de los libros que se quieren eliminar
	 * @return el ArrayList vacio
	 */
	public static ArrayList<Libro> borrarMemoria(ArrayList<Libro> pLibros){
		
		ArrayList<Libro> libros = pLibros;
		
		boolean error = true;
		String respuesta = null;
		
		do {
		
			System.out.print("\nEsta seguro de que desea borrar la memoria? (S/N): ");
			try{
				respuesta = Main.sc.nextLine();
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
			System.out.println("\nOperacion cancelada\n\nVolviendo al menu principal...");
		}
		
		return libros;
		
	}
	
	
	public static boolean modificarUbicacionFicheros() {
        JOptionPane.showMessageDialog(null, "Seleccione el fichero que desea mover");

		GestorDeArchivos exp = new GestorDeArchivos(3, null);
		exp.start();
		try {
			exp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(exp.getRutaFichero() != null) {

			File fichero = new File(exp.getRutaFichero());
			String rutaOrigen = fichero.getAbsolutePath();
			

	        JOptionPane.showMessageDialog(null, "Seleccione el directorio al que desea mover el fichero");
	        
			exp = new GestorDeArchivos(4, null);
			exp.start();

			try {
				exp.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(exp.getRutaFichero() != null) {
				String rutaDestino = exp.getRutaFichero() + File.separator + fichero.getName();
				
				exp.modificarUbicacionFichero(rutaOrigen, rutaDestino, fichero);
				System.out.println("\nFICHERO MOVIDO CON EXITO\n");
			}
		}
		return true;
	}
	
	public static boolean modificarPermisos() {
		
        JOptionPane.showMessageDialog(null, "Seleccione el fichero al que desea modificarle los permisos");

		GestorDeArchivos exp = new GestorDeArchivos(3, null);
		exp.start();
		try {
			exp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(exp.getRutaFichero() != null) {
			switch(comprobarOS()) {
			case LINUX:
				String chmod;
				System.out.println("\n - USUARIO -\n\n");
				
				System.out.println(Menu.mostrarSubmenuPermisosL());
				chmod = String.valueOf(MetodosAdicionales.solicitarOpcion(7, 0, Menu.mostrarSubmenuPermisosL()));
				System.out.println("\n - GRUPOS -\n\n");
				
				System.out.println(Menu.mostrarSubmenuPermisosL());
				chmod = chmod + String.valueOf(MetodosAdicionales.solicitarOpcion(7, 0, Menu.mostrarSubmenuPermisosL()));
				System.out.println("\n - OTROS -\n\n");
				
				System.out.println(Menu.mostrarSubmenuPermisosL());
				chmod = chmod + String.valueOf(MetodosAdicionales.solicitarOpcion(7, 0, Menu.mostrarSubmenuPermisosL()));
				
				System.out.println(chmod);
				
				try {
					Runtime.getRuntime().exec("chmod " + chmod + " " + exp.getRutaFichero());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				break;
				
			case WINDOWS:
				System.out.println(Menu.mostrarSubmenuPermisosW());
				ProcessBuilder pb;
				switch(MetodosAdicionales.solicitarOpcion(3, 1, Menu.mostrarSubmenuPermisosW())) {
				
				case 1:
					pb = new ProcessBuilder("CMD", "/C", "ICACLS \"" + exp.getRutaFichero() + "\" /grant " + System.getProperty("user.name") + ":(F)");
					try {
						
					
						Process p = pb.start();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					break;
				case 2:
				
					pb = new ProcessBuilder("CMD", "/C", "ICACLS \"" + exp.getRutaFichero() + "\" /deny " + System.getProperty("user.name") + ":(W)");
					try {
						Process p = pb.start();
	
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case 3:
					
					pb = new ProcessBuilder("CMD", "/C", "ICACLS \"" + exp.getRutaFichero() + "\" /deny " + System.getProperty("user.name") + ":(F)");
					try {
						File file = new File("C:\\Users\\Jon\\Desktop\\CarpetaPrueba\\Prueba2\\log.txt");
						pb.redirectError(file);
						Process p = pb.start();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Permisos denegados");
					break;
				}
				break;
			}
			
		}
		else {
			
		}
		
		return true;
	}
	
	/**
	 * Comprueba el nombre del sistema operativo
	 * @return el sistema operativo
	 */
	public static String comprobarOS() {
		
		String sOS = System.getProperty("os.name");
		
		return sOS;
	}
}
