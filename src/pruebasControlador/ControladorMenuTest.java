package pruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import controlador.ControladorMenu;

class ControladorMenuTest {

	@Test
	void testControladorMenu() {
		
		ControladorMenu cM = new ControladorMenu();
		String input = " \n\n1\na\n1\n1\n1\n2\n1\n3\n1\n4\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}

}
