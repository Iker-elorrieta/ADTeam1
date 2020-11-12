package excepciones;

@SuppressWarnings("serial")
public class ExcepcionIntervalo extends Exception{

	/**
	 * Se crea la excepcion con un mensaje personalizado
	 * @param mensaje
	 */
	public ExcepcionIntervalo(String msg) {
		super(msg);
	}
	
	/**
	 * Comprueba que la opcion esta entre los limites
	 * @param numero elegido
	 * @param numero maximo disponible
	 * @param numero minimo disponible
	 * @throws ExcepcionIntervalo
	 * @throws InterruptedException
	 */
	public static void rango(int num, int max, int min) throws ExcepcionIntervalo, InterruptedException {

		if (num < min || num > max) {
			
			throw new ExcepcionIntervalo("\n\n--------\n ERROR! \n--------\nLa opcion seleccionada no es correcta");
			
		}
	}
}
