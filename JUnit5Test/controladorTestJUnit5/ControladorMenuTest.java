package controladorTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controlador.ControladorMenu;
import main.Main;

class ControladorMenuTest {


	@Test
	void testControladorMenu() {
		ControladorMenu cM = new ControladorMenu();

		String input = "\n1\na\n1\n3\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());

	}	
	
	@Test
	void testControladorMenu2() {
		ControladorMenu cM = new ControladorMenu();

		String input = "1\n2\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());

	}	
	
	@Test
	void testControladorMenu3() {
		ControladorMenu cM = new ControladorMenu();

		String input = "1\n3\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());

	}	
	
	@Test
	void testControladorMenu4() {
		ControladorMenu cM = new ControladorMenu();

		String input = "1\n4\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());

	}
	
	@Test
	@DisplayName("--testControladorMenu2--")
	void testControladorMenu5() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\n1\n1\nlibros\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
	
	@Test
	void testControladorMenu6() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\na\n2\n1\n*\nlibros\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
	
	
	@Test
	void testControladorMenu7() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\n3\n1\nlibros\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}	
	
	@Test
	void testControladorMenu8() {
		ControladorMenu cM = new ControladorMenu();

		String input = "2\n4\n1\nlibros\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
	
	@Test
	void testControladorMenu9() {
		ControladorMenu cM = new ControladorMenu();

		String input = "3\n1\n1\n1\n1\n1\n1\n1\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
	
	@Test
	void testControladorMenu10() {
		ControladorMenu cM = new ControladorMenu();

		String input = "4\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
	
	@Test
	void testControladorMenu11() {
		ControladorMenu cM = new ControladorMenu();
	
		String input = "5\nñ\nS\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
	
	@Test
	void testControladorMenu12() {
		ControladorMenu cM = new ControladorMenu();
	
		String input = "5\nN\n0\n";
		
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertTrue(cM.iniciarControladorMenu());
	}
}