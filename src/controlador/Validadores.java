package controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validadores {
		
	public static boolean validador(String pDatoAValidar, String pPatron) {
		
	    Pattern pat = Pattern.compile(pPatron);
	
	    Matcher mat = pat.matcher(pDatoAValidar);
	
	    if(!mat.matches()){
			
			return false;
	    }		
	    else {
	    	return true;
	    }

	}
}
