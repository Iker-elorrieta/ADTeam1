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
}
