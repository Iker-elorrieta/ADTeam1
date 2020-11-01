package modeloTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Menu;

class MenuTest {
	private static final String LEER = "leer";
	private static final String ESCR = "escribir";
	@Test
	void test() {
		@SuppressWarnings("unused")
		Menu menu = new Menu();
		assertEquals("\n  --MENU PRINCIPAL--\n\n 1) Leer ficheros\n 2) Escribir ficheros\n 3) Insertar libro\n\n 0) Salir", Menu.mostrarMenu());
	}
	
	@Test
	void test2() {
		String resultado = Menu.mostrarSubmenu(LEER);
		assertEquals(resultado, Menu.mostrarSubmenu(LEER));
	}

	@Test
	void test3() {
		String resultado = Menu.mostrarSubmenu(ESCR);
		assertEquals(resultado, Menu.mostrarSubmenu(ESCR));
	}
	
	
	@Test
	void test4() {
		String resultado = Menu.mostrarSubmenuSobreescribir();
		assertEquals(resultado, Menu.mostrarSubmenuSobreescribir());
	}
}
