package excepcionesTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionCampoVacio;

class ExcepcionCampoVacioTest {

	@Test()
	void test() {
		ExcepcionCampoVacio excepcion = new ExcepcionCampoVacio("fallo");
		
	}

}
