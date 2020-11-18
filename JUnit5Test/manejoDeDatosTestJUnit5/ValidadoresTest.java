package manejoDeDatosTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import manejoDeDatos.Validadores;

class ValidadoresTest {

	@Test
	void test() {
		@SuppressWarnings("unused")
		Validadores validador = new Validadores();
		String pDatoAValidar = "+";
		String pPatron = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20";
		assertEquals(false, Validadores.validador(pDatoAValidar, pPatron));
	}
	
	@Test
	void test2() {
		String pDatoAValidar = "hola";
		String pPatron = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20";
		assertEquals(true, Validadores.validador(pDatoAValidar, pPatron));
	}
	
	@Test
	void test3() {
		@SuppressWarnings("unused")
		Validadores validador = new Validadores();
		String pDatoAValidar = "";
		String pPatron = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20";
		assertEquals(false, Validadores.validador(pDatoAValidar, pPatron));
	}
	
	@Test
	void testisbnCorrecto() {
		String datos="978-84-473-5602-7";
		assertEquals(true, Validadores.validador(datos));
	}
	@Test
	void testFallonummerosini() {
		String datos="778-84-473-5602-7";
		assertEquals(false, Validadores.validador(datos));
	}
	@Test
	void testFalloguionminimo() {
		String datos="9788447356027";
		assertEquals(false, Validadores.validador(datos));
	}
	@Test
	void testFalloguionmaximo() {
		String datos="978-84-4-7-3-5602-7";
		assertEquals(false, Validadores.validador(datos));
	}
	@Test
	void testFalloguionprimero() {
		String datos="97884-473-5602-7";
		assertEquals(false, Validadores.validador(datos));
	}
	
	@Test
	void testFallodigicontrol() {
		String datos="978-84-473-5602-8";
		assertEquals(false, Validadores.validador(datos));
	}
	
	@Test
	void testFallodigiincorrectos() {
		String datos="978-84-473-5666666602-8";
		assertEquals(false, Validadores.validador(datos));
	}
	
}
