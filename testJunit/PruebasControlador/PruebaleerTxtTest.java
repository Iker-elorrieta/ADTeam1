package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
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

}
