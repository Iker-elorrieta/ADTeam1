package PruebasControlador;

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
		//BufferedReader prueba = null;
		try {
			assertEquals(pLibros,  LeerFichero.leerFicheroTxt(pLibros));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	void test2() {
		
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		try {
			assertEquals(pLibros,  LeerFichero.leerFicheroDat(pLibros));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test3() {
		
		ArrayList<Libro> pLibros = new ArrayList<Libro>();
		try {
			assertEquals(pLibros,  LeerFichero.leerFicheroXml(pLibros));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void test4() {
		ArrayList<Libro> pLibros = new ArrayList<Libro>();

		try {
			assertEquals(pLibros, LeerFichero.leerFicheroCsv(pLibros));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
