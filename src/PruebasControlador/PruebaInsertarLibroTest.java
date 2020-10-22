package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import controlador.MetodosAdicionales;
import modelo.Libro;

class PruebaInsertarLibroTest {


	@org.junit.jupiter.api.Test
	void testInsertarLibro() {
		//instanciar la clase
		
		ArrayList<Libro> libro= new ArrayList<Libro>();
		String input = "Quijote\n mundo\n8\n7\n nota\n 9393939393939\n historia";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
	assertEquals(libro,  MetodosAdicionales.insertarLibro( libro, sc));
	
	}
	

}
