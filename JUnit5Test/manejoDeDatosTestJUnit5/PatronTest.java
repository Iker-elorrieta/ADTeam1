package manejoDeDatosTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import manejoDeDatos.Patron;

class PatronTest {

	@Test
	void test() {
		
		assertEquals("ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20",Patron.devolverPatron("nombreFichero"));
	}
	
	@Test
	void test2() {
		@SuppressWarnings("unused")
		Patron pat = new Patron();
		assertEquals("ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20",Patron.devolverPatron("nomfich"));
	}

}
