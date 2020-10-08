package controlador;

@SuppressWarnings("serial")
public class ExcepcionIntervalo extends Exception{

	public ExcepcionIntervalo(String msg) {
		super(msg);
	}
	
	public static void rango(int max, int min, int num) throws ExcepcionIntervalo, InterruptedException {

		if (num < min || num > max) {
			
			throw new ExcepcionIntervalo("\nERROR!\nLa opcion seleccionada no es correcta");
			
		}
	}
}
