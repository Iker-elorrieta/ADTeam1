package manejoDeDatos;

public class Patron {
	
	private static String patronADevolver;

	public static String devolverPatron(String pPatron) {
		
		if (pPatron.equalsIgnoreCase("nombreFichero")) {
			
			patronADevolver = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789_;1;20";
		}
		
		return patronADevolver;
	}
}
