package pruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Menu;

class MenuTest {

	@Test
	void test() {
		assertEquals("\n  --MENU PRINCIPAL--\n\n 1) Leer ficheros\n 0) Salir", Menu.mostrarMenu());
	}
	
	@Test
	void test2() {
		String resultado = Menu.mostrarSubmenu("leer");
		assertEquals(resultado, Menu.mostrarSubmenu("leer"));
	}

	@Test
	void test3() {
		String resultado = Menu.mostrarSubmenu("escribir");
		assertEquals(resultado, Menu.mostrarSubmenu("escribir"));
	}
	
	
	@Test
	void test4() {
		String resultado = Menu.mostrarSubmenuSobreescribir();
		assertEquals(resultado, Menu.mostrarSubmenuSobreescribir());
	}
}
