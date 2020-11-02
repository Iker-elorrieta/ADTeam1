package controladorTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controlador.ControladorMenu;

class ControladorMenuTest {


	@Test
	@DisplayName("--testControladorMenu--")
	void testControladorMenu() {
		ControladorMenu cM = new ControladorMenu();

		String input = "\n1\na\n1\n1\n2\n1\n3\n1\n4\n0\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}	
	
	@Test
	@DisplayName("--testControladorMenu2--")
	void testControladorMenu2() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\n1\n\nlibros\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}
	
	@Test
	void testControladorMenu3() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\na\n2\n*\nlibros\n\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}
	
	@Test
	void testControladorMenu4() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\n3\nlibros\n2\n4\nlibros\n1\n0\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}	
	
	@Test
	void testControladorMenu5() {
		ControladorMenu cM = new ControladorMenu();

		String input = "3\n1\n1\n1\n1\n1\n1\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu(sc));
	}
}