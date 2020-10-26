package controlador;

public class Patron {
	
	private static String patronADevolver;

	public static String devolverPatron(String pPatron) {
		
		if (pPatron.equalsIgnoreCase("nombreFichero")) {
			
			patronADevolver = "[A-Za-z_0-9]{1,20}";
		}
		
		return patronADevolver;
	}
}
