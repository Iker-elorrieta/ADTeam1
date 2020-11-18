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
	
	
	
	/**
	 * Esta Funcion valida isbn de 13 numeros recibiendo el isbn con guiones y devolviendo true o false
	 * @param ISBN
	 * @return si el ISBN es correcto devuelve true si no devuelve false
	 */
	public static boolean validador(String ISBN) {
		
		int contador_numeros = 0;
		int contador_Palos = 0;
		int producto=0;
		int contador=1;
		
		for(int x = 0; x < ISBN.length() ; x++) {
			
			if(Character.isDigit(ISBN.charAt(x))) {
				contador_numeros++;
			}
			
			if(ISBN.charAt(x) == '-') {
				contador_Palos++;
			}
			
		}
		
		if(contador_numeros!=13 || contador_Palos ==0 || contador_Palos > 4) {
			return false;
		}
		
		if(ISBN.charAt(3)!='-') {
			return false;
		}
		
		String cad_ini= ISBN.substring(0,4);
		if(!cad_ini.equals("978-")) {			
			return false;
		}
		
		for(int x=0; x<=ISBN.length()-2; x++) {
			if(Character.isDigit(ISBN.charAt(x))) {
				if(contador == 1) {
					producto += ((1)*Integer.parseInt(String.valueOf(""+ISBN.charAt(x))));
				}
				if (contador == 2) {
					producto += ((3)*Integer.parseInt(String.valueOf(""+ISBN.charAt(x))));
				}
				
				contador++;
				if(contador>2) {
					contador=1;
				}
			}
		}
		
		if(10-producto%10!=Integer.parseInt(String.valueOf(""+ISBN.charAt(ISBN.length()-1)))) {
			return false;
		}
		return true;	
	}

}
