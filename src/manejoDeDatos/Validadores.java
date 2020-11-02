package manejoDeDatos;


public class Validadores {
		
	/***
	 * esta funcion valida un nombre de archivo en funcion del patron de datos recibido, caracteres validos, longitud minima, longitud maxima
	 * @param pDatoAValidar
	 * @param pPatron
	 * @return boolean
	 */
	
	public static boolean validador(String pDatoAValidar, String pPatron) {

		String[] lista= pPatron.split(";");
		String Patron = lista[0];
		int longitudmin = Integer.parseInt(lista[1]) ;
		int longitudmax = Integer.parseInt(lista[2]) ;
		
		boolean valido = false;
		
		if(pDatoAValidar.length()>longitudmax || pDatoAValidar.length() < longitudmin ) {
			return false;
		}
		
		for (int x = 0 ; x<= pDatoAValidar.length()-1; x++) {
			char letra= pDatoAValidar.charAt(x);
			
			for (int y = 0 ; y<= Patron.length()-1; y++) {
				if(letra == Patron.charAt(y)) {
					valido = true;
				}
			}
			if(!valido) {
				return false;
			}
			valido = false;
		}	
		return true;	
	}

}
