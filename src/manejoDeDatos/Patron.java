package manejoDeDatos;

public class Patron {
	
	private static String patronADevolver;

	/**
	 * Devuelve un patron si lo que se le pasa el nombre del fichero
	 * @param nombre del fichero
	 * @return el patron 
	 */
	public static String devolverPatron(String pPatron) {
		
		if (pPatron.equalsIgnoreCase("nombreFichero")) {
			
			patronADevolver = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20";
		}
		
		return patronADevolver;
	}
}
