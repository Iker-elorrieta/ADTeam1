package excepciones;

import java.util.Scanner;

import manejoDeDatos.Patron;
import manejoDeDatos.Validadores;

@SuppressWarnings("serial")
public class ExcepcionNombreArchivo extends Exception{

	public ExcepcionNombreArchivo(String msg) {
		super(msg);
	}
	
	public static void comprobarNombreFichero(String pNombreFichero) throws ExcepcionNombreArchivo{

		if (!Validadores.validador(pNombreFichero, Patron.devolverPatron("nombreFichero"))){
			throw new ExcepcionNombreArchivo("\n\n--------\n ERROR! \n--------\nDebe escribir un nombre valido. (Caracteres admitidos: Letras minusculas/mayusculas, numeros o guion bajo)");
		}
	}
}