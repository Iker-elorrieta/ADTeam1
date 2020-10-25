package controladorTestJUnit5;

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
		String input = " 1\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}
	

}
