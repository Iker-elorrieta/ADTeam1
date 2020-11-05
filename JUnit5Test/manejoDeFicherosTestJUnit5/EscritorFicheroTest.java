package manejoDeFicherosTestJUnit5;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import main.Main;
import manejoDeFicheros.EscritorFichero;
import modelo.Libro;

class EscritorFicheroTest {

	Libro libro = new Libro("1", "1", 1, 1, "1", "1", "1");
	ArrayList<Libro> pLibros = new ArrayList<Libro>();
	EscritorFichero escFichero = new EscritorFichero(pLibros);
	
	@Test
	void test() {		

		assertTrue(escFichero.escribirFicheroTxt(new File("ficherosTestEscritor" + File.separator + "libros.txt"),true));
		pLibros.add(libro);
		assertTrue(escFichero.escribirFicheroTxt(new File("ficherosTestEscritor" + File.separator + "libros.txt"),true));

	}
	
	
	@Test
	void test2() {
		assertTrue(escFichero.escribirFicheroDat(new File("ficherosTestEscritor" + File.separator + "libros.dat"), true));
		pLibros.add(libro);
		assertTrue(escFichero.escribirFicheroDat(new File("ficherosTestEscritor" + File.separator + "libros.dat"), true));
	}
	
	
	@Test
	void test3() {
		pLibros.add(libro);

		assertTrue(escFichero.escribirFicheroXml(new File("ficherosTestEscritor" + File.separator + "libros.xml")));
	}

	@Test
	void test4() {
		assertTrue(escFichero.escribirFicheroCsv(new File("ficherosTestEscritor" + File.separator + "libros.csv"), true));

		pLibros.add(libro);

		assertTrue(escFichero.escribirFicheroCsv(new File("ficherosTestEscritor" + File.separator + "libros.csv"), true));
	}

	@Test
	void test5() {			
		String input = "1\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertFalse(EscritorFichero.aniadirDatosFicheroExistente(new File("ficherosTestEscritor" + File.separator + "libros.txt")));
	}	
	
	@Test
	void test6() {			
		String input = "2\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(EscritorFichero.aniadirDatosFicheroExistente(new File("ficherosTestEscritor" + File.separator + "libros.txt")));
	}
	
	@Test
	void test7() {			
		String input = "2\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(EscritorFichero.aniadirDatosFicheroExistente(new File("ficherosTestEscritor" + File.separator + "noExiste.txt")));
	}
}
