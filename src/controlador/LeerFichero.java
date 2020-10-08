package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import modelo.Libro;

public class LeerFichero {

	
	public static ArrayList<Libro> leerFichero(ArrayList<Libro> pLibros) throws ParseException {
		
		ArrayList<Libro> libros = pLibros;
		
		try{
			
			String sFichero = "libros.txt";
			File fichero = new File(sFichero);
			BufferedReader brFichero = new BufferedReader(new FileReader(fichero));
			String linea;
			while((linea = brFichero.readLine())!=null) {
				
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
				System.out.println("No se ha cargado ningun libro ");

			}
			else {
				System.out.println("Se han cargado en memoria " + libros.size() + " libros");
			}
		}
		catch (FileNotFoundException fn ){
			System.out.println("No se encuentra el fichero de carga");}
		catch (IOException io) {
			System.out.println("Error de E/S ");}

		return libros;
		
	}
}