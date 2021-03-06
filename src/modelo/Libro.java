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
	
	public String toString() {
		
		return (this.titulo + ";" + this.editorial + ";" + this.paginas + ";" + this.altura + ";" + this.notas + ";" + this.isbn + ";" + this.materias + ";");
	}
	
	public String toStringFormateado() {
		
		return ("\n" + " Titulo: " + this.getTitulo() + " || Editorial: " + this.getEditorial() + " || Paginas: " + this.getPaginas() + " || Altura: " + this.getAltura() + " || Notas: " + this.getNotas() + " || ISBN: " + this.getIsbn() + " || Materias: " + this.getMaterias());
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
