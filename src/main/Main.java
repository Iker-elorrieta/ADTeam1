package main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import controlador.ControladorMenu;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		ControladorMenu cM = new ControladorMenu();
		cM.iniciarControladorMenu(sc);
	}
		
		

}
