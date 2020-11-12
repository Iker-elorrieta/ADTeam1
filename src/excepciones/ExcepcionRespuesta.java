  
package excepciones;

@SuppressWarnings("serial")
public class ExcepcionRespuesta extends Exception{
	/**
	 * Se crea la excepcion con un mensaje personalizado
	 * @param mensaje
	 */
	public ExcepcionRespuesta(String msg) {
		super(msg);
	}
	
	/**
	 * Comprueba si la opcion es correcta
	 * @param respusta dada
	 * @throws ExcepcionRespuesta
	 */
	public static void comprobarRespuesta(String pRespuesta) throws ExcepcionRespuesta{

		if (!pRespuesta.equalsIgnoreCase("S") && !pRespuesta.equalsIgnoreCase("N")) {
			
			throw new ExcepcionRespuesta("\n\n--------\n ERROR! \n--------\nLa opcion seleccionada no es correcta");
			
		}
	}
}