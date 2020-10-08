package controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Libro;

public class EscribirFichero {
	
	public static void escribirFicheroTxt(ArrayList<Libro> pLibros) throws IOException {

		ArrayList<Libro> libros = pLibros;

		try{
			String sFichero = "libros.txt";
			File fichero = new File(sFichero);
			
			if (fichero.exists()) {
				System.out.println("El fichero " + sFichero + " existe");
			}
			else {
				System.out.println("Se ha creado el archivo " + sFichero);
			}
			
			BufferedWriter bwFichero = new BufferedWriter(new FileWriter(sFichero, true));
			
			for (int i=0; i<libros.size(); i++){
				Libro libro = libros.get(i);
				bwFichero.write(libro.toString()); 
				bwFichero.newLine(); 
			}
			bwFichero.close();
			
			JOptionPane.showMessageDialog(null, "Se han guardado " + libros.size() + " libros en el fichero " + sFichero, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
		catch (FileNotFoundException fn ){
			 System.out.println("No se encuentra el fichero");}
		catch (IOException io) {
			 System.out.println("Error de E/S ");}
	}
		

	 public static void escribirFicheraDat(ArrayList<Libro> pLibros) throws IOException {

		 ArrayList<Libro> libros = pLibros;
		 
		 Libro libro;

		 File fichero = new File("libros.dat");//declara el fichero
		 FileOutputStream fileout = new FileOutputStream(fichero,true); //crea el flujo de salida
		 //conecta el flujo de bytes al flujo de datos
		 ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		
		 for (int i=0;i<libros.size(); i++){ //recorro los arrays
			 libro = libros.get(i);
			 dataOS.writeObject(libro); //escribo la persona en el fichero
		 
			 System.out.println("GRABO LOS DATOS DE LIBRO.");
		 }
		 dataOS.close(); //cerrar stream de salida
		 
	}

}
