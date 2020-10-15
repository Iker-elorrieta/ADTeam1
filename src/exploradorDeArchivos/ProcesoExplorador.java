package exploradorDeArchivos;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ProcesoExplorador {

	private static String rutaFichero;
	
	public static void Main(String[]args) {
		System.out.println("Explorador");
		JFileChooser fc = new JFileChooser("D:\\Descargas");
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
	    fc.setFileFilter(filter);
	    
	    int seleccionUsuario = fc.showOpenDialog(null);
	   
	    if(seleccionUsuario == JFileChooser.APPROVE_OPTION) {
	      rutaFichero = fc.getSelectedFile().getAbsolutePath();
	      System.out.println(rutaFichero);
	    }
	    
	    if (seleccionUsuario == JFileChooser.CANCEL_OPTION) {
	        System.out.println("Cancelar");
	    }	
	    System.out.println("Final");
	}
	
	public String getRutaFichero() {
		return rutaFichero;
	}
	
}
