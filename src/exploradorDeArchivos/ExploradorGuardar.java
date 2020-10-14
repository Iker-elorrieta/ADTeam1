package exploradorDeArchivos;

import javax.swing.JFileChooser;


public class ExploradorGuardar implements Runnable{
	
	private String rutaFichero;
	
	@Override
	public void run() {
		
		JFileChooser fc = new JFileChooser("D:\\Descargas");
		fc.setDialogTitle("Specify a file to save");   
	     
	    int seleccionUsuario = fc.showSaveDialog(null);
	     
	    if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
		      rutaFichero = fc.getSelectedFile().getAbsolutePath();
	    }
	    
	    if (seleccionUsuario == JFileChooser.CANCEL_OPTION) {
	        System.out.println("Cancelar");
	    }
		
	}

	public String getRutaFichero() {
		return rutaFichero;
	}
	
	
}
