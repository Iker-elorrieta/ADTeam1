package PruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class PruebasElegirOpcionTest {

	@org.junit.jupiter.api.Test
	void testElegirOpcion() {
		//instanciar la vlase
		PruebasElegirOpcion elegir = new PruebasElegirOpcion();
		
		
		String input = "9 \n 1 \n 5  \n 2";
		int maxOpcion = 5;
		int minOpcion = 0;
		String tipoMenu = "menuPrincipal";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		
		assertEquals(1,  elegir.solicitarOpcion(sc, maxOpcion, minOpcion, tipoMenu));
	}

}
