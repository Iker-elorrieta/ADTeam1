package manejoDeFIcherosTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import manejoDeFicheros.EscritorFichero;
import modelo.Libro;

class EscritorFicheroTest {

	Libro libro = new Libro("1", "1", 1, 1, "1", "1", "1");
	ArrayList<Libro> pLibros = new ArrayList<Libro>();
	EscritorFichero escFichero = new EscritorFichero(pLibros);
	
	@Test
	void test() {		

		assertTrue(escFichero.escribirFicheroTxt(new File("ficherosTestEscritor\\libros.txt"),true));
		pLibros.add(libro);
		assertTrue(escFichero.escribirFicheroTxt(new File("ficherosTestEscritor\\libros.txt"),true));

	}
	
	
	@Test
	void test2() {
		assertTrue(escFichero.escribirFicheroDat(new File("ficherosTestEscritor\\libros.dat")));
		pLibros.add(libro);
		assertTrue(escFichero.escribirFicheroDat(new File("ficherosTestEscritor\\libros.dat")));
	}
	
	@Test
	void test3() {
		pLibros.add(libro);

		assertTrue(escFichero.escribirFicheroXml(new File("ficherosTestEscritor\\libros.xml")));
	}

	@Test
	void test4() {
		pLibros.add(libro);

		assertTrue(escFichero.escribirFicheroCsv(new File("ficherosTestEscritor\\libros.csv")));
	}
	
	@Test
	void test5() {			
		String input = "1\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertFalse(EscritorFichero.aniadirDatosFicheroExistente(sc, new File("ficherosTestEscritor\\libros.txt")));
	}	
	
	@Test
	void test6() {			
		String input = "2\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(EscritorFichero.aniadirDatosFicheroExistente(sc, new File("ficherosTestEscritor\\libros.txt")));
	}
	
	@Test
	void test7() {			
		String input = "2\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(EscritorFichero.aniadirDatosFicheroExistente(sc, new File("ficherosTestEscritor\\noExiste.txt")));
	}
}
