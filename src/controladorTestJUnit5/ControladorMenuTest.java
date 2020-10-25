package controladorTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import controlador.ControladorMenu;

class ControladorMenuTest {

	ControladorMenu cM = new ControladorMenu();

	@Test
	void testControladorMenu() {
		
		String input = "\n1\na\n1\n1\n2\n1\n3\n1\n4\n2\na\n2\n*\nlibros\n2\n3\nlibros\n2\n4\nlibros\n0\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}
}
