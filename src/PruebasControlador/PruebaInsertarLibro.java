package PruebasControlador;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Libro;
import modelo.Menu;

public class PruebaInsertarLibro {
	
	public boolean insertarLibro(Scanner sc){
		
		
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

		System.out.println("\n--INSERTAR LIBRO--");

		//Pedir nombre del libro
		System.out.print("\nEscriba el nombre del libro: ");
		tituloNuevoLibro = sc.nextLine();
		
		//pedir editorial del libro
		System.out.print("Escriba la editorial del libro: ");
		editorialNuevoLibro = sc.nextLine();
		
		
		do {
			//Pedir numero de paginas del libro
			System.out.print("Escriba el numero de paginas que tiene el libro: ");
			try{
				//Recoger las paginas
				paginasNuevoLibro = sc.nextInt();
				//En caso de que no sea un int va al catch sino sigue
				//si es un int error cambia a false 
				error = false;
			}catch(Exception e) {
				//Se muestra el mensaje indicando el error
				System.out.println("ERROR: No introduzca caracteres no numericos a la hora de indicar el numero de paginas del libro");
				paginasNuevoLibro = 1;
				//Se limpia el buffer del scanner para no entrar en un bucle infinito
				sc.nextLine();
			}
					
			//se hacen comprobaciones y si alguna se cumple lo pide otra vez
		}while(paginasNuevoLibro == 0 || error == true);
		
		//se reinicia la variable de error
		error = true;
		
		do {
			
			//Se pide la altura del libro y se compruba igual que las paginas
			System.out.print("Escriba la altura del libro: ");
			try{
				alturaNuevoLibro = sc .nextDouble();
				error = false;
			}catch(Exception w) {
				System.out.println("ERROR: No introduzca caracteres no numericos a la hora de indicar la altura del libro");
				alturaNuevoLibro=1;
				sc.nextLine();
			}
			
		}while(alturaNuevoLibro == 0 || error== true);

		sc.nextLine();
		//Se piden anotaciones del libro
		System.out.print("Escriba alguna anotacion para el libro: ");
		notasNuevoLibro = sc.nextLine();
		
		//Se pide el ISBN del libro
		System.out.print("Escriba el ISBN del libro: ");
		isbnNuevoLibro = sc.nextLine();
		
		//Se pide la materia del libro
		System.out.print("Escriba la materia para la que fue creado el libro: ");
		materiasNuevoLibro = sc.nextLine();
		

		//Devuelve el array con los libros
		return true;
	}
}
