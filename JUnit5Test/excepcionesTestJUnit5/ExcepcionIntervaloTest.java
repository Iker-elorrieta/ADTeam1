package excepcionesTestJUnit5;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionIntervalo;

class ExcepcionIntervaloTest {

	@Test
	void test() {
		@SuppressWarnings("unused")
		ExcepcionIntervalo exception = new ExcepcionIntervalo("fallo");
	}

}
