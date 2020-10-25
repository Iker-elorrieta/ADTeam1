package controladorTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import controlador.LectorFichero;
import modelo.Libro;

class LectorFicheroTest {

	ArrayList<Libro> pLibros = new ArrayList<Libro>();
	LectorFichero lecFichero = new LectorFichero(pLibros);
	@Test
	void test() {		
		assertTrue(lecFichero.leerFicheroTxt(new File("libros.txt")));
		assertFalse(lecFichero.leerFicheroTxt(new File("noExiste.txt")));
	}
	
	
	@Test
	void test2() {
		assertTrue(lecFichero.leerFicheroDat(new File("libros.dat")));
		assertFalse(lecFichero.leerFicheroDat(new File("noExiste.dat")));
	}
	
	@Test
	void test3() {
		assertTrue(lecFichero.leerFicheroXml(new File("libros.xml")));
	}

	@Test
	void test4() {
		assertTrue(lecFichero.leerFicheroCsv(new File("libros.csv")));
		assertFalse(lecFichero.leerFicheroCsv(new File("noExiste.csv")));
	}
}
