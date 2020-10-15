package PruebasControlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import modelo.Libro;

public class PruebaleerTxt {
	

	public  ArrayList<Libro> leerFicheroTxt(ArrayList<Libro> pLibros,BufferedReader brFichero ) throws ParseException, InterruptedException {
		
		ArrayList<Libro> libros = pLibros;
		
		try{
			
			int contadorEntradas = 0;
			String sFichero = "libros";
			
			File fichero = new File(sFichero);
			brFichero= new BufferedReader(new FileReader(fichero));
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
					contadorEntradas++;
				}
								
				//System.out.println(linea);
				libros.add(libro);
			}
			brFichero.close();
			if (libros.isEmpty()){
				System.out.println("\nNo se ha cargado ningun libro ");

			}
			else {
				System.out.println("\nSe ha(n) cargado en memoria " + contadorEntradas + " libro(s)");
			}
		}catch (FileNotFoundException fn ){
			System.out.println("\nNo se encuentra el fichero de carga");
		
		}catch (IOException io) {
			System.out.println("\nError de E/S ");}
		

		return libros;
	}
}
