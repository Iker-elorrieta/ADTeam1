package manejoDeFicherosTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import manejoDeFicheros.LectorFichero;
import modelo.Libro;

class LectorFicheroTest {

	ArrayList<Libro> pLibros = new ArrayList<Libro>();
	@Test
	void test() {		
		
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertTrue(lecFichero.leerFicheroTxt(new File("ficherosTestLector" + File.separator + "libros.txt")));
		assertFalse(lecFichero.leerFicheroTxt(new File("noExiste.txt")));
	}
	
	@Test
	void test2() {
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertTrue(lecFichero.leerFicheroDat(new File("ficherosTestLector" + File.separator + "libros.dat")));
		assertFalse(lecFichero.leerFicheroDat(new File("noExiste.dat")));
	}
	
	@Test
	void test3() {
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertTrue(lecFichero.leerFicheroXml(new File("ficherosTestLector" + File.separator + "libros.xml")));
		//assertFalse(lecFichero.leerFicheroXml(new File("noExiste.xml")));

	}

	@Test
	void test4() {		
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertTrue(lecFichero.leerFicheroCsv(new File("ficherosTestLector" + File.separator + "libros.csv")));
		assertFalse(lecFichero.leerFicheroCsv(new File("noExiste.csv")));
	}
	
	@Test
	void test5() {
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertFalse(lecFichero.leerFicheroTxt(new File("ficherosTestLector" + File.separator + "librosVacio.txt")));

	}
	@Test
	void test6() {
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertFalse(lecFichero.leerFicheroDat(new File("ficherosTestLector" + File.separator + "librosVacio.dat")));
	}
	
	@Test
	void test7() {
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertFalse(lecFichero.leerFicheroXml(new File("ficherosTestLector" + File.separator + "librosVacio.xml")));
	}	
	
	@Test
	void test8() {
		LectorFichero lecFichero = new LectorFichero(pLibros);
		assertFalse(lecFichero.leerFicheroCsv(new File("ficherosTestLector" + File.separator + "librosVacio.csv")));
	}
}
