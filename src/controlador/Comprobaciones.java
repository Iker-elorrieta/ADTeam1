package controlador;
/*
import vista.VentanaAniadirLibros;

public class Comprobaciones {

	public static boolean comprabarCampos(VentanaAniadirLibros pventanaAniadirMensajes) {
		
		VentanaAniadirLibros ventanaAniadirMensajes = pventanaAniadirMensajes;
		
		if(ventanaAniadirMensajes.getTfDia().getText().equals("") 
			|| ventanaAniadirMensajes.getCmbBxMes().getSelectedIndex() == 0
				|| ventanaAniadirMensajes.getCmbBxAnio().getSelectedIndex() == 0
					|| ventanaAniadirMensajes.getCmbBxHoras().getSelectedIndex() == 0
						|| ventanaAniadirMensajes.getCmbBxMinutos().getSelectedIndex() == 0
							|| ventanaAniadirMensajes.getTfRemitente().getText().equals("")
								|| ventanaAniadirMensajes.getTfDestinatario().getText().equals("")
									|| ventanaAniadirMensajes.getTfAsunto().getText().equals("")
										|| ventanaAniadirMensajes.getTfContenido().getText().equals("")) {
			
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean comprobarFecha(VentanaAniadirLibros pventanaAniadirMensajes) {
		
		VentanaAniadirLibros ventanaAniadirMensajes = pventanaAniadirMensajes;
		
		boolean fechaValida = true;
		
		int dia = 0;
		try{
			dia = Integer.parseInt(ventanaAniadirMensajes.getTfDia().getText());
		}
		catch(Exception e){
        	fechaValida = false;

		}
		int mes = ventanaAniadirMensajes.getCmbBxMes().getSelectedIndex();
		int anio = ventanaAniadirMensajes.getCmbBxAnio().getSelectedIndex() + 1999;
		
		
		if (dia < 1) {
			fechaValida = false;
		}
		else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
        	
        	fechaValida = false;
        }
        else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
        	
        	fechaValida = false;
        }
        else if(mes == 2) {
        	
        	if((anio % 4== 0 && anio % 100 != 0) || anio % 400 == 0){
        		if (dia > 29) {
                	fechaValida = false;

        		}
        	}
        	else {
        		
        		if (dia > 28) {
                	
        			fechaValida = false;
        		}
        	}
        }
	
        return fechaValida;
	}
}
*/