package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

	static Scanner sc = new Scanner(System.in);
	
	private String titulo;
	private String editorial;
	private int paginas;
	private double altura;
	private String notas;
	private String isbn;
	private String materias;
	
	
	public Libro() {
		
	}
	
	public Libro( String pTitulo, String pEditorial, int pPaginas, double pAltura, String pNotas, String pIsbn, String pMaterias) {
		
		this.titulo = pTitulo;
		this.editorial = pEditorial;
		this.paginas = pPaginas;
		this.altura = pAltura;
		this.notas = pNotas;
		this.isbn = pIsbn;
		this.materias = pMaterias;
	}
	
	
	public static void insertarLibro() {
		

		public static ArrayList<Libro> insertarLibro(ArrayList<Libro> pLibros) {
			
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

	// GETTERs & SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	
}
