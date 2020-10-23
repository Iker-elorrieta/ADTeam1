package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controlador.Patron;

class PatronTest {

	@Test
	void test() {
		
		assertEquals("[A-Za-z_0-9]{1,20}",Patron.devolverPatron("nombreFichero"));
	}
	
	@Test
	void test2() {
		Patron pat = new Patron();
		assertEquals("[A-Za-z_0-9]{1,20}",Patron.devolverPatron("nomfich"));
	}

}
