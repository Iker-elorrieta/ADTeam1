package excepciones;

import java.util.Scanner;

@SuppressWarnings("serial")
public class ExcepcionCampoVacio extends Exception{

	public ExcepcionCampoVacio(String msg) {
		super(msg);
	}
	
	public static void comprobarCampoVacio(String pStr) throws ExcepcionCampoVacio{

		if (pStr.equals("")){
			throw new ExcepcionCampoVacio("\n\n--------\n ERROR! \n--------\nDebe rellenar el campo");
		}
	}
}