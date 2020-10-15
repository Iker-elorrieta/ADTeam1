package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Libro;

class PruebaleerTxtTest {

	@Test
	void test() throws ParseException, InterruptedException {
		PruebaleerTxt leertxt = new PruebaleerTxt();
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		BufferedReader prueba = null;
		assertEquals(pLibros,  leertxt.leerFicheroTxt(pLibros, prueba));
	}
	
	@Test
	void test2() throws ParseException, InterruptedException, ClassNotFoundException, IOException {
		PruebaleerTxt leerdat = new PruebaleerTxt();
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		assertEquals(pLibros,  leerdat.leerFicheroDat(pLibros));
	}
	
	@Test
	void test3() throws ParseException, InterruptedException, ClassNotFoundException, IOException {
		PruebaleerTxt leerXml = new PruebaleerTxt();
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		assertEquals(pLibros,  leerXml.leerFicheroXml(pLibros));
	}

}
