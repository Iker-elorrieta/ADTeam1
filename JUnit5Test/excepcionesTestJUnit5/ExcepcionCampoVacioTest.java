package excepcionesTestJUnit5;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionCampoVacio;

class ExcepcionCampoVacioTest {

	@Test()
	void test() {
		@SuppressWarnings("unused")
		ExcepcionCampoVacio excepcion = new ExcepcionCampoVacio("fallo");
		
	}

}
