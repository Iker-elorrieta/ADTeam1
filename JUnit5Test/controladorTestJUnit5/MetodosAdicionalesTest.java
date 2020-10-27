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
	
	@Test
	void testElegirOpcion() {
		
		String input = "9\n1\n1\n1";
		int maxOpcion = 5;
		int minOpcion = 0;
		String tipoMenu = "menuPrincipal";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
	
		assertEquals(1,  MetodosAdicionales.solicitarOpcion(sc, maxOpcion, minOpcion, tipoMenu));
	}
	
	

}
