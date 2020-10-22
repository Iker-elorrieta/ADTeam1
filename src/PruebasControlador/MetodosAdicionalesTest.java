package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import controlador.MetodosAdicionales;

class MetodosAdicionalesTest {

	@Test
	void test() {
		String input = "prueba\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);

		try {
			assertEquals("prueba",MetodosAdicionales.verificarInsercionDatos(sc,"escriba dato"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
