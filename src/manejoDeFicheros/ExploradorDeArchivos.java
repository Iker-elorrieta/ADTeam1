package manejoDeFicheros;

import java.awt.Dimension;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import controlador.MetodosAdicionales;

public class ExploradorDeArchivos extends Thread{
	
	private static final String RUTA_LINUX = "";
//	private static final String RUTA_WINDOWS = "C:" + File.separator + "users" + File.separator 
//													+ System.getProperty("user.name") + File.separator + "desktop";
	private static final String RUTA_WINDOWS ="ficherosDeSalida";
	private String rutaFichero;
	JFileChooser fc;
	FileNameExtensionFilter filter;
	private int seleccionUsuario;
	private int tipo;

	public ExploradorDeArchivos(int pTipo, String pExtension) {
		
		this.tipo = pTipo;
		
		directorioDeInicio();
		
		switch (pExtension) {
		case ".txt":
			this.filter = new FileNameExtensionFilter(".txt Files", "txt");
		    this.fc.setFileFilter(this.filter);
			break;
		case ".dat":
			this.filter = new FileNameExtensionFilter(".dat Files", "dat");
		    this.fc.setFileFilter(this.filter);
			break;
		case ".xml":
			this.filter = new FileNameExtensionFilter(".xml Files", "xml");
		    this.fc.setFileFilter(this.filter);
			break;
		case ".csv":
			this.filter = new FileNameExtensionFilter(".csv Files", "csv");
		    this.fc.setFileFilter(this.filter);
			break;
		}

		fc.setPreferredSize(new Dimension(800,500));

	}
	
	public String iniciarHilo(){
		
		this.start();
		return this.rutaFichero;
	}
	
	private boolean directorioDeInicio() {
		if(MetodosAdicionales.comprobarOS().equals("Linux")) {
			this.fc = new JFileChooser(RUTA_LINUX);
		}
		else if(MetodosAdicionales.comprobarOS().contains("Windows")){
			this.fc = new JFileChooser(RUTA_WINDOWS);
		}
		return true;
	}
	
	public File generarFichero() {
		File fichero = new File(this.rutaFichero);
		return fichero;
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    
	    switch (this.tipo) {
		case 1:
			
		    this.seleccionUsuario = fc.showOpenDialog(null);
			break;
		case 2:
		    this.seleccionUsuario = fc.showSaveDialog(null);
			break;
		}
	    if(this.seleccionUsuario == JFileChooser.APPROVE_OPTION) {
	      this.rutaFichero = fc.getSelectedFile().getAbsolutePath();
	      //System.out.println(this.rutaFichero);
	    }
	    
	    if (this.seleccionUsuario == JFileChooser.CANCEL_OPTION) {
	        System.out.println("Cancelar");
	    }	
	}

	//GETTERTS & SETTERS

	public int getSeleccionUsuario() {
		return seleccionUsuario;
	}
}
