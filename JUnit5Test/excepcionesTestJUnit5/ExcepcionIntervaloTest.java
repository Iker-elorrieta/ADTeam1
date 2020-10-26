package excepcionesTestJUnit5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionIntervalo;

class ExcepcionIntervaloTest {

	@Test
	void test() {
		ExcepcionIntervalo exception = new ExcepcionIntervalo("fallo");
	}

}
