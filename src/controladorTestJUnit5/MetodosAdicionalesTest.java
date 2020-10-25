package controladorTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import controlador.MetodosAdicionales;
import modelo.Libro;

class MetodosAdicionalesTest {

	ArrayList<Libro> pLibros = new ArrayList<Libro>();
	MetodosAdicionales mA = new MetodosAdicionales();

	@Test
	void test() {
		String input = "prueba\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);

		assertEquals("prueba",MetodosAdicionales.verificarInsercionDatos(sc,"escriba dato"));
	}

	@Test
	void test2() {
		String input = "1\n1\n.\n1\n.\n1\n1\n\1\n1\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);

		assertEquals(pLibros, MetodosAdicionales.insertarLibro(sc, pLibros));
	}
	
	
	
	

}
