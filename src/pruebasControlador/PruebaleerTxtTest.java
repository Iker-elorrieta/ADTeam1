package pruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import controlador.LeerFichero;
import modelo.Libro;

class PruebaleerTxtTest {

	@Test
	void test() {
		
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		assertEquals(pLibros,  LeerFichero.leerFicheroTxt(pLibros));
	}
	
	
	@Test
	void test2() {
		
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		assertEquals(pLibros,  LeerFichero.leerFicheroDat(pLibros));
	}
	
	@Test
	void test3() {
		
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		assertEquals(pLibros,  LeerFichero.leerFicheroXml(pLibros));
	}

	@Test
	void test4() {
		ArrayList<Libro> pLibros = new ArrayList<Libro>();

		assertEquals(pLibros, LeerFichero.leerFicheroCsv(pLibros));
	}
}
