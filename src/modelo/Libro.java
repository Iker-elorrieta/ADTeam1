package modelo;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Libro implements Serializable{

	static Scanner sc = new Scanner(System.in);
	
	private String titulo;
	private String editorial;
	private int paginas;
	private double altura;
	private String notas;
	private String isbn;
	private String materias;
	
	
	/**
	 * se instancia un libro sin datos iniciales
	 */
	public Libro() {
		
	}
	
	/**
	 * se instancia un libro con datos iniciales
	 * @param Tituo
	 * @param Editorial
	 * @param Num paginas
	 * @param Altura
	 * @param Notas del libro
	 * @param ISBN
	 * @param Materia
	 */
	public Libro( String pTitulo, String pEditorial, int pPaginas, double pAltura, String pNotas, String pIsbn, String pMaterias) {
		
		this.titulo = pTitulo;
		this.editorial = pEditorial;
		this.paginas = pPaginas;
		this.altura = pAltura;
		this.notas = pNotas;
		this.isbn = pIsbn;
		this.materias = pMaterias;
	}
	
	/**
	 * se devuelven los datos del libro de forma ordenada
	 * @return datos del libro separado por ";"
	 */
	public String toString() {
		
		return (this.titulo + ";" + this.editorial + ";" + this.paginas + ";" + this.altura + ";" + this.notas + ";" + this.isbn + ";" + this.materias + ";");
	}
	
	/**
	 * se devuelven los datos del libro de manera ordenada y facil de leer
	 * @return datos del libro separado por ";"
	 */
	public String toStringFormateado() {
		
		return ("\n" + " Titulo: " + this.getTitulo() + " || Editorial: " + this.getEditorial() + " || Paginas: " + this.getPaginas() + " || Altura: " + this.getAltura() + " || Notas: " + this.getNotas() + " || ISBN: " + this.getIsbn() + " || Materias: " + this.getMaterias());
	}
	

	// GETTERs & SETTERS
	/**
	 * metodo para devolver el titulo del libro
	 * @return titulo 
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * metodo para ponerle titulo al libro
	 * @param titulo a poner
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * metodo para devolver la editorial del libro
	 * @return editorial 
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * metodo para ponerle una editorial al libro
	 * @param editorial a poner
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	/**
	 * metodo para devolver el numero de paginas del libro
	 * @return numero de paginas 
	 */
	public int getPaginas() {
		return paginas;
	}
	/**
	 * metodo para ponerle o cambiar el numero de paginas del libro
	 * @param editorial a poner
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	/**
	 * metodo para devolver la altura del libro
	 * @return altura del libro 
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * metodo para ponerle o cambiar la altura libro
	 * @param editorial a poner
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * metodo para devolver las notas del libro
	 * @return notas del libro 
	 */
	public String getNotas() {
		return notas;
	}
	/**
	 * metodo para ponerle o cambiar las notas libro
	 * @param editorial a poner
	 */
	public void setNotas(String notas) {
		this.notas = notas;
	}
	/**
	 * metodo para devolver el isbn del libro
	 * @return isbn del libro 
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * metodo para ponerle o cambiar el isbn al libro
	 * @param isbn a poner
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * metodo para devolver las materias del libro
	 * @return materias del libro 
	 */
	public String getMaterias() {
		return materias;
	}
	/**
	 * metodo para ponerle o cambiar la materia al libro
	 * @param materia a poner
	 */
	public void setMaterias(String materias) {
		this.materias = materias;
	}	
}
