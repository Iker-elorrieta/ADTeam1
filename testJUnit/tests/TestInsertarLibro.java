package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Libro;
class TestInsertarLibro {

	@Test
	void testInsertarLibro() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		assertEquals(libros, controlador.MetodosAdicionales.insertarLibro(libros));
	}
	@Test
	void testInsertarLibroError1() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		assertEquals("ERROR: No introduzca caracteres no numericos a la hora de  indicar el numero de paginas del libro", controlador.MetodosAdicionales.insertarLibro(libros));
	}
	@Test
	void testInsertarLibroError2() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		assertEquals("ERROR: No introduzca caracteres no numericos a la hora de indicar la altura del libro", controlador.MetodosAdicionales.insertarLibro(libros));
	}
}
