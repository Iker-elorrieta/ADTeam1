package exploradorDeArchivos;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class HiloExplorador extends JPanel implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rutaFichero;
	
	
	@Override
	public void run() {
		
		JFileChooser fc = new JFileChooser("D:\\Descargas");
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
	    fc.setFileFilter(filter);
	    
	    int seleccionUsuario = fc.showOpenDialog(HiloExplorador.this);
	   System.out.println("3");
	    if(seleccionUsuario == JFileChooser.APPROVE_OPTION) {
	      rutaFichero = fc.getSelectedFile().getAbsolutePath();
	      System.out.println(rutaFichero);
	    }
	    
	    if (seleccionUsuario == JFileChooser.CANCEL_OPTION) {
	        System.out.println("Cancelar");
	    }	
		/*
		JFileChooser fc = new JFileChooser("D:\\Descargas");
		fc.setDialogTitle("Specify a file to save");   
	     
	    int seleccionUsuario = fc.showSaveDialog(null);
	     
	    if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
		      rutaFichero = fc.getSelectedFile().getAbsolutePath();
	    }
	    
	    if (seleccionUsuario == JFileChooser.CANCEL_OPTION) {
	        System.out.println("Cancelar");
	    }
		*/
	}

	public String getRutaFichero() {
		return rutaFichero;
	}
	
	
}
