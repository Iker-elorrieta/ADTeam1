package controlador;

public class Patron {
	
	private static String patronADevolver;

	public static String devolverPatron(String pPatron) {
		
		if (pPatron.equalsIgnoreCase("dni")) {
			
			patronADevolver = "[0-9]{7,8}[A-Za-z]";
		}
		
		else if (pPatron.equalsIgnoreCase("nombre")) {
			
			patronADevolver = "[A-Z a-z]{1,20}";
		}
		
		else if (pPatron.equalsIgnoreCase("apellido")) {
			
			patronADevolver = "[A-Z a-z]{1,30}";
		}
		
		else if (pPatron.equalsIgnoreCase("telefono")) {
			
			patronADevolver = "[0-9]{9}";
		}
		
		else if (pPatron.equalsIgnoreCase("numerico")) {
		
			patronADevolver = "[0-9]{2}";
		}
		
		return patronADevolver;
	}
}
