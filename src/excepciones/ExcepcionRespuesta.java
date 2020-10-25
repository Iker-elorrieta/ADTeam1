package excepciones;

@SuppressWarnings("serial")
public class ExcepcionRespuesta extends Exception{

	public ExcepcionRespuesta(String msg) {
		super(msg);
	}
	
	public static void comprobarRespuesta(String pRespuesta) throws ExcepcionRespuesta, InterruptedException {

		if (!pRespuesta.equalsIgnoreCase("S") && !pRespuesta.equalsIgnoreCase("N")) {
			
			throw new ExcepcionRespuesta("\n\n--------\n ERROR! \n--------\nLa opcion seleccionada no es correcta");
			
		}
	}
}