package excepcionesTestJUnit5;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionNombreArchivo;

class ExcepcionNombreArchivoTest {

	@Test
	void test() {
		@SuppressWarnings("unused")
		ExcepcionNombreArchivo exception = new ExcepcionNombreArchivo("fallo");
	}

}
