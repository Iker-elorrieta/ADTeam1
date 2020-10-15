package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import modelo.Libro;

class PruebaInsertarLibroTest {


	@org.junit.jupiter.api.Test
	void testInsertarLibro() {
		//instanciar la clase
		PruebaInsertarLibro fdsafa = new PruebaInsertarLibro();
		
		ArrayList<Libro> libro= new ArrayList<Libro>();
		String input = "Quijote \n mundo \n fallo \n 8 \n pepe \n 7 \n nota1 \n 93939393939393 \n historia";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertEquals(true,  fdsafa.insertarLibro(sc));
	}
	

}
