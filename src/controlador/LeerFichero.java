package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import modelo.Libro;

public class LeerFichero {

	
	public static ArrayList<Libro> leerFichero(ArrayList<Libro> pLibros) throws ParseException {
		
		ArrayList<Libro> libros = pLibros;
		
		try{
			int contadorEntradas = 0;
			
			String sFichero = "libros.txt";
			File fichero = new File(sFichero);
			BufferedReader brFichero = new BufferedReader(new FileReader(fichero));
			String linea;
			while((linea = brFichero.readLine())!=null) {
				contadorEntradas++;
				
				StringTokenizer st = new StringTokenizer(linea, ";");
				
				Libro libro = new Libro();	

				while(st.hasMoreTokens()) {
					
					libro.setTitulo(st.nextToken());
					libro.setEditorial(st.nextToken());
					libro.setPaginas(Integer.parseInt(st.nextToken()));
					libro.setAltura(Double.parseDouble(st.nextToken()));
					libro.setNotas(st.nextToken());
					libro.setIsbn(st.nextToken());
					libro.setMaterias(st.nextToken());
				}
								
				System.out.println(linea);
				libros.add(libro);
			}
			brFichero.close();
			if (libros.isEmpty()){
				JOptionPane.showMessageDialog(null, "No se ha cargado ningun mensaje ", "Warning", JOptionPane.WARNING_MESSAGE);

			}
			else {
				JOptionPane.showMessageDialog(null, "Se han cargado en memoria " + contadorEntradas + " mensajes", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		catch (FileNotFoundException fn ){
			JOptionPane.showMessageDialog(null, "No se encuentra el fichero de carga", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.out.println("No se encuentra el fichero");}
		catch (IOException io) {
			System.out.println("Error de E/S ");}

		return libros;
		
	}
}