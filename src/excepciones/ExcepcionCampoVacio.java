package excepciones;

@SuppressWarnings("serial")
public class ExcepcionCampoVacio extends Exception{

	/**
	 * Se crea la excepcion con un mensaje personalizado
	 * @param mensaje
	 */
	public ExcepcionCampoVacio(String msg) {
		super(msg);
	}
	
	/**
	 * comprueba si la frase esta en blanco
	 * @param frase a comprobar
	 * @throws ExcepcionCampoVacio
	 */
	public static void comprobarCampoVacio(String pStr) throws ExcepcionCampoVacio{

		if (pStr.equals("")){
			throw new ExcepcionCampoVacio("\n\n--------\n ERROR! \n--------\nDebe rellenar el campo");
		}
	}
}