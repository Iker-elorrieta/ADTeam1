package excepcionesTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionNombreArchivo;

class ExcepcionNombreArchivoTest {

	@Test
	void test() {
		ExcepcionNombreArchivo exception = new ExcepcionNombreArchivo("fallo");
	}

}
