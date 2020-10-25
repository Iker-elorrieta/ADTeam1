package excepcionesTestJUnit5;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionRespuesta;

class ExcepcionRespuestaTest {

	@Test
	void test() {
		ExcepcionRespuesta exception = new ExcepcionRespuesta("fallo");
	}

}
