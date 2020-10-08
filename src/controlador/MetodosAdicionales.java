package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Libro;

public class MetodosAdicionales {

	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Libro> insertarLibro(ArrayList<Libro> pLibros){
		
		ArrayList<Libro> libros = pLibros;
		
		String tituloNuevoLibro;
		String editorialNuevoLibro;
		int paginasNuevoLibro;
		double alturaNuevoLibro;
		String notasNuevoLibro;
		String isbnNuevoLibro;
		String materiasNuevoLibro;
		 
		System.out.print("Escriba el nombre del libro: ");
		tituloNuevoLibro = sc.nextLine();
		
		System.out.print("Escriba la editorial del libro: ");
		editorialNuevoLibro = sc.nextLine();
		
		System.out.print("Escriba el numero de paginas que tiene el libro: ");
		paginasNuevoLibro = sc.nextInt();
		
		System.out.print("Escriba la altura del libro: ");
		alturaNuevoLibro = sc .nextDouble();
		
		System.out.print("Escriba alguna anotacion para el libro: ");
		notasNuevoLibro = sc.nextLine();
		
		System.out.print("Escriba el ISBN del libro: ");
		isbnNuevoLibro = sc.nextLine();
		
		System.out.print("Escriba la materia para la que fue creado el libro: ");
		materiasNuevoLibro = sc.nextLine();
		
		Libro libro = new Libro(tituloNuevoLibro, editorialNuevoLibro, paginasNuevoLibro, alturaNuevoLibro,notasNuevoLibro,isbnNuevoLibro,materiasNuevoLibro );
		libros.add(libro);
		return libros;
	}

}
