package main;

import java.util.Scanner;

import controlador.ControladorMenu;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		ControladorMenu cM = new ControladorMenu();
		cM.iniciarControladorMenu(sc);
	}
		
		

}
