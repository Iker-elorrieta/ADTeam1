package manejoDeDatosTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import manejoDeDatos.Validadores;

class ValidadoresTest {

	@Test
	void test() {
		Validadores validador = new Validadores();
		String pDatoAValidar = "";
		String pPatron = "12345";
		assertEquals(false, Validadores.validador(pDatoAValidar, pPatron));
	}
	
	@Test
	void test2() {
		String pDatoAValidar = "hola";
		String pPatron = "[A-Za-z_0-9]{1,20}";
		assertEquals(true, Validadores.validador(pDatoAValidar, pPatron));
	}

}
