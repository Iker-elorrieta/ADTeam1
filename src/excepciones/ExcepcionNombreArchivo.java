package excepciones;

import manejoDeDatos.Patron;
import manejoDeDatos.Validadores;

@SuppressWarnings("serial")
public class ExcepcionNombreArchivo extends Exception{
	/**
	 * Se crea la excepcion con un mensaje personalizado
	 * @param mensaje
	 */
	public ExcepcionNombreArchivo(String msg) {
		super(msg);
	}
	
	/**
	 * Comprueba si el nombre del fichero esta bien escrito 
	 * @param nombre fichero
	 * @return true si se ha ejecutado bien
	 * @throws ExcepcionNombreArchivo
	 */
	public static boolean comprobarNombreFichero(String pNombreFichero) throws ExcepcionNombreArchivo{

		if (!Validadores.validador(pNombreFichero, Patron.devolverPatron("nombreFichero"))){
			throw new ExcepcionNombreArchivo("\n\n--------\n ERROR! \n--------\nDebe escribir un nombre valido. (Caracteres admitidos: Letras minusculas/mayusculas, numeros o guion bajo)");
		}
		return true;
	}
}