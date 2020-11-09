package manejoDeDatos;

import java.util.ArrayList;
import java.util.Scanner;

import main.Main;
import modelo.Libro;


public class Buscador {
	
	ArrayList<Libro> resultados = new ArrayList<Libro>();
	ArrayList<Libro> libros;
	
	
	public Buscador(ArrayList<Libro> pLibros) {
		this.libros = pLibros;
	}
	
	public void busca_guiado() {
		
		boolean error= true;
		
		int tipo = 0;
		int atributo = 0;
		String cadena = "";
		boolean sensible = false;
		String patron = "";
		
		while(error) {
			System.out.println(" 1) Empieza por: \n 2) Contiene \n 3) Termina por:");
			try {
				tipo = Main.sc.nextInt() ;
				if(tipo == 1 || tipo == 2 || tipo == 3) {
					error = false;
				}else {
					System.out.println("valor fuera de rango intentelo de nuevo");
				}
				
			}catch(Exception e){
				System.out.println("Valores introducidos no validos, vuelve a intertarlo");
				Main.sc.nextLine() ;
			}
		}
		
		error = true;
		

		Main.sc.nextLine() ;
		System.out.println("Que quieres buscar?");
		cadena = Main.sc.nextLine() ;
		
		
		while(error) {
			try {
				System.out.println("Donde quieres buscar?"
					+ "\n 1) Titulo"
					+ "\n 2) editorial"
					+ "\n 3) Paginas"
					+ "\n 4) Altura"
					+ "\n 5) Notas"
					+ "\n 6) ISBN"
					+ "\n 7) Materias"
					+ "\n 8) Todos");
				atributo = Main.sc.nextInt() ;
				
				if(atributo == 1 || atributo == 2 || atributo == 3 || atributo == 4 || atributo == 5 || atributo == 6 || atributo == 7 || atributo == 8) {
					error = false;
				}else {
					System.out.println("valor fuera de rango intentelo de nuevo");
				}
			}
			catch(Exception e) {
				System.out.println("Valores introducidos no validos, vuelve a intertarlo");
				Main.sc.nextLine() ;
			}
		}
		
		error = true;
		
		
		while(error) {
				System.out.println("Quieres que sea sensible a las mayusculas y a las minusculas S/N");
				char mayus = Main.sc.next().charAt(0);
				
				if(mayus =='N' || mayus =='S' || mayus =='n' || mayus =='s') {
					if(mayus == 'S' || mayus == 's') {
						sensible = true;
					}else {
						sensible = false;
					}
					error = false;
				}else {
					System.out.println("valor no valido intentelo de nuevo");
				}
				
			
		}
		
		switch(tipo) {
		  case 1:
		    patron += cadena + "*;";
		    break;
		  case 2:
			patron += "*" + cadena + "*;";
		    break;
		  case 3:
			patron += "*"+ cadena + ";";
			break;
		}
		
		switch(atributo) {
		case 1:
			patron += "Titulo;";
			break;
		case 2:
			patron += "Editorial;";
			break;
		case 3:
			patron += "Paginas;";
			break;
		case 4:
			patron += "Altura;";
			break;
		case 5:
			patron += "Notas;";
			break;
		case 6:
			patron += "ISBN;";
			break;
		case 7:
			patron += "Materias;";
			break;
		case 8:
			patron += "Todos;";
			break;
		
		}
		
		if(sensible) {
			patron += "true";
		}else {
			patron += "false";
		}
	
		buscar(patron);
		
	}
	
	
	 
	public void busca_libre() {
		Main.sc.nextLine();
		System.out.println("Introduce patron: ");
		String patron = Main.sc.nextLine();
		buscar(patron);
			
	}
	
	public boolean como_buscar() {
		
		boolean error = true;
		int modo = 0;
		while(error) {
			try {
				System.out.println("Como quieres buscar? ");
				System.out.println("1 ) Busqueda libre ");
				System.out.println("2 ) Busqueda guiada ");
				
				modo = Main.sc.nextInt(); 
				
				if (modo == 1 || modo == 2) {
					error = false;
				}else {
					System.out.println("valores introducidos fuera de rango intentelo otra vez");
				}
				
			}catch(Exception e){
				System.out.println("valores introducidos no validos intentelo otra vez");
				Main.sc.nextLine() ;
			}	
		}
		
		if(modo == 1) {
			busca_libre();
		}else {
			busca_guiado();
		}
		
		return true;
	}
	
	
	public void imprimir_resultados() {
		for(Libro libro: resultados ) {
			System.out.println(libro.toStringFormateado());
		}
	}
	
	public void buscar(String patron) {
		
		String[] params =patron.split(";");
		String parametro1 = params[0];
		String parametro2 = params[1];
		String parametro3 = params[2];
		
		String cadena = "";
		
		boolean empieza = false;
		boolean termina = false;
		
		if ( parametro1.charAt(0)=='*') {
			termina = true;
			cadena = parametro1.substring(1);
		}
		
		if ( parametro1.charAt(parametro1.length()-1) == '*') {
			empieza = true;
			cadena = parametro1.substring(0, parametro1.length()-1);
		}
		
		if(empieza && termina) {
			cadena = parametro1.substring(1, parametro1.length()-1);
		}
		
		boolean agregar_resultado = false;
		
		for(Libro libro: libros ) {
			agregar_resultado = false;
			//comienza por cadena
			if(empieza && !termina) {
				
				switch(parametro2) {
				case "Titulo":
					String title = libro.getTitulo();
					if (parametro3.equals("true")) {
						if (title.contains(cadena)) {
							if (title.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}else {
						title= title.toLowerCase();
						cadena = cadena.toLowerCase();
						if (title.contains(cadena)) {
							if (title.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}
					
					break;
					
				case "Editorial":
					
					String editor = libro.getEditorial();
					if (parametro3.equals("true")) {
						if (editor.contains(cadena)) {
							if (editor.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}else {
						editor= editor.toLowerCase();
						cadena = cadena.toLowerCase();
						if (editor.contains(cadena)) {
							if (editor.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}
					
					break;
					
				case "Paginas":
					
					String pag = "" + libro.getPaginas();
						if (pag.contains(cadena)) {
							if (pag.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					
					
					break;
					
				case "Altura":
					
					String alt = "" + libro.getAltura();
						if (alt.contains(cadena)) {
							if (alt.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
		
					break;
								
				case "Notas":
					
					String note = libro.getNotas();
					if (parametro3.equals("true")) {
						if (note.contains(cadena)) {
							if (note.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}else {
						note= note.toLowerCase();
						cadena = cadena.toLowerCase();
						if (note.contains(cadena)) {
							if (note.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}
					
					break;
					
				case "ISBN":
					
					String isb = libro.getIsbn();
					if (parametro3.equals("true")) {
						if (isb.contains(cadena)) {
							if (isb.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}else {
						isb= isb.toLowerCase();
						cadena = cadena.toLowerCase();
						if (isb.contains(cadena)) {
							if (isb.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}
					
					
					break;
					
				case "Materias":
					
					String mater = libro.getMaterias();
					if (parametro3.equals("true")) {
						if (mater.contains(cadena)) {
							if (mater.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}else {
						mater= mater.toLowerCase();
						cadena = cadena.toLowerCase();
						if (mater.contains(cadena)) {
							if (mater.indexOf(cadena) == 0) {
								resultados.add(libro);
							}
						}
					}
					
					break;
				case "Todos":
					
					title = libro.getTitulo();
					if (parametro3.equals("true")) {
						if (title.contains(cadena)) {
							if (title.indexOf(cadena) == 0) {
								agregar_resultado = true;
							}
						}
					}else {
						title= title.toLowerCase();
						cadena = cadena.toLowerCase();
						if (title.contains(cadena)) {
							if (title.indexOf(cadena) == 0) {
								agregar_resultado = true;
							}
						}
					}
					
					editor = libro.getEditorial();
					if (parametro3.equals("true")) {
						if (editor.contains(cadena)) {
							if (editor.indexOf(cadena) == 0) {
								agregar_resultado = true;
							}
						}
					}else {
						editor= editor.toLowerCase();
						cadena = cadena.toLowerCase();
						if (editor.contains(cadena)) {
							if (editor.indexOf(cadena) == 0) {
								agregar_resultado = true;
							}
						}
					}
					
					 pag = "" + libro.getPaginas();
						if (pag.contains(cadena)) {
							if (pag.indexOf(cadena) == 0) {
								agregar_resultado = true;
							}
						}
						
					alt = "" + libro.getAltura();
					if (alt.contains(cadena)) {
						if (alt.indexOf(cadena) == 0) {
							agregar_resultado = true;
						}
					}
					
					 note = libro.getNotas();
						if (parametro3.equals("true")) {
							if (note.contains(cadena)) {
								if (note.indexOf(cadena) == 0) {
									agregar_resultado = true;
								}
							}
						}else {
							note= note.toLowerCase();
							cadena = cadena.toLowerCase();
							if (note.contains(cadena)) {
								if (note.indexOf(cadena) == 0) {
									agregar_resultado = true;
								}
							}
						}
						
						isb = libro.getIsbn();
						if (parametro3.equals("true")) {
							if (isb.contains(cadena)) {
								if (isb.indexOf(cadena) == 0) {
									agregar_resultado = true;
								}
							}
						}else {
							isb= isb.toLowerCase();
							cadena = cadena.toLowerCase();
							if (isb.contains(cadena)) {
								if (isb.indexOf(cadena) == 0) {
									agregar_resultado = true;
								}
							}
						}
						
						mater = libro.getMaterias();
						if (parametro3.equals("true")) {
							if (mater.contains(cadena)) {
								if (mater.indexOf(cadena) == 0) {
									agregar_resultado = true;
								}
							}
						}else {
							mater= mater.toLowerCase();
							cadena = cadena.toLowerCase();
							if (mater.contains(cadena)) {
								if (mater.indexOf(cadena) == 0) {
									agregar_resultado = true;
								}
							}
						}
						
						if(agregar_resultado) {
							resultados.add(libro);
						}
					
					
					break;
				
				}
			}
			
			
			//termina por cadena
			if(!empieza && termina) {
				
				switch(parametro2) {
				case "Titulo":
					String title = libro.getTitulo();
					if(title.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (title.contains(cadena)) {
								if (title.substring((title.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}else {
							title= title.toLowerCase();
							cadena = cadena.toLowerCase();
							if (title.contains(cadena)) {
								if (title.substring((title.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}
					}
					
					
					break;
					
				case "Editorial":
					
					String editor = libro.getEditorial();
					if(editor.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (editor.contains(cadena)) {
								if (editor.substring((editor.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}else {
							editor= editor.toLowerCase();
							cadena = cadena.toLowerCase();
							if (editor.contains(cadena)) {
								if (editor.substring((editor.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}
					}
					
					
					break;
					
				case "Paginas":
					
					String pag = "" + libro.getPaginas();
					if(pag.length()>=cadena.length()) {
						if (pag.contains(cadena)) {
							if (pag.substring((pag.length()-1)-(cadena.length()-1)).equals(cadena)) {
								resultados.add(libro);
							}
						}
					}
											
					break;
					
				case "Altura":
					
					String alt = "" + libro.getAltura();
					if(alt.length()>=cadena.length()) {
						if (alt.contains(cadena)) {
							if (alt.substring((alt.length()-1)-(cadena.length()-1)).equals(cadena)) {
								resultados.add(libro);
							}
						}
					}

					break;
								
				case "Notas":
					
					String note = libro.getNotas();
					if(note.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (note.contains(cadena)) {
								if (note.substring((note.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}else {
							note= note.toLowerCase();
							cadena = cadena.toLowerCase();
							if (note.contains(cadena)) {
								if (note.substring((note.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}
					}

					break;
					
				case "ISBN":
					
					String isb = libro.getIsbn();
					if(isb.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (isb.contains(cadena)) {
								if (isb.substring((isb.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}else {
							isb= isb.toLowerCase();
							cadena = cadena.toLowerCase();
							if (isb.contains(cadena)) {
								if (isb.substring((isb.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}
					}

					break;
					
				case "Materias":
					
					String mater = libro.getMaterias();
					if(mater.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (mater.contains(cadena)) {
								if (mater.substring((mater.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}else {
							mater= mater.toLowerCase();
							cadena = cadena.toLowerCase();
							if (mater.contains(cadena)) {
								if (mater.substring((mater.length()-1)-(cadena.length()-1)).equals(cadena)) {
									resultados.add(libro);
								}
							}
						}
					}
					
					break;
				case "Todos":
					
					title = libro.getTitulo();
					if(title.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (title.contains(cadena)) {
								if (title.substring((title.length()-1)-(cadena.length()-1)).equals(cadena)) {
									agregar_resultado = true;
								}
							}
						}else {
							title= title.toLowerCase();
							cadena = cadena.toLowerCase();
							if (title.contains(cadena)) {
								if (title.substring((title.length()-1)-(cadena.length()-1)).equals(cadena)) {
									agregar_resultado = true;
								}
							}
						}
					}

					
					editor = libro.getEditorial();
					if(editor.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (editor.contains(cadena)) {
								if (title.substring((title.length()-1)-(cadena.length()-1)).equals(cadena)) {
									agregar_resultado = true;
								}
							}
						}else {
							editor= editor.toLowerCase();
							cadena = cadena.toLowerCase();
							if (editor.contains(cadena)) {
								if (editor.substring((editor.length()-1)-(cadena.length()-1)).equals(cadena)) {
									agregar_resultado = true;
								}
							}
						}
					}

					
					 pag = "" + libro.getPaginas();
					 if(pag.length()>=cadena.length()) {
							if (pag.contains(cadena)) {
								if (pag.substring((pag.length()-1)-(cadena.length()-1)).equals(cadena)) {
									agregar_resultado = true;
								}
							}
					 }

						
					alt = "" + libro.getAltura();
					 if(pag.length()>=cadena.length()) {
							if (alt.contains(cadena)) {
								if (alt.substring((alt.length()-1)-(cadena.length()-1)).equals(cadena)) {
									agregar_resultado = true;
								}
							}
					 }

					
					 note = libro.getNotas();
					 if(note.length()>=cadena.length()) {
							if (parametro3.equals("true")) {
								if (note.contains(cadena)) {
									if (note.substring((note.length()-1)-(cadena.length()-1)).equals(cadena)) {
										agregar_resultado = true;
									}
								}
							}else {
								note= note.toLowerCase();
								cadena = cadena.toLowerCase();
								if (note.contains(cadena)) {
									if (note.substring((note.length()-1)-(cadena.length()-1)).equals(cadena)) {
										agregar_resultado = true;
									}
								}
							}
					 }

						
						isb = libro.getIsbn();
						if(isb.length()>=cadena.length()) {
							if (parametro3.equals("true")) {
								if (isb.contains(cadena)) {
									if (isb.substring((isb.length()-1)-(cadena.length()-1)).equals(cadena)) {
										agregar_resultado = true;
									}
								}
							}else {
								isb= isb.toLowerCase();
								cadena = cadena.toLowerCase();
								if (isb.contains(cadena)) {
									if (isb.substring((isb.length()-1)-(cadena.length()-1)).equals(cadena)) {
										agregar_resultado = true;
									}
								}
							}
						}

						
						mater = libro.getMaterias();
						if(mater.length()>=cadena.length()) {
							if (parametro3.equals("true")) {
								if (mater.contains(cadena)) {
									if (mater.substring((mater.length()-1)-(cadena.length()-1)).equals(cadena)) {
										agregar_resultado = true;
									}
								}
							}else {
								mater= mater.toLowerCase();
								cadena = cadena.toLowerCase();
								if (mater.contains(cadena)) {
									if (mater.substring((mater.length()-1)-(cadena.length()-1)).equals(cadena)) {
										agregar_resultado = true;
									}
								}
							}
						}

						
						if(agregar_resultado) {
							resultados.add(libro);
						}
					
					
					break;
				
				}
				
			}
			
			//contiene cadena
			if(empieza && termina) {
				switch(parametro2) {
				case "Titulo":
					String title = libro.getTitulo();
					if(title.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (title.indexOf(cadena) > -1) {
								
									resultados.add(libro);
								
							}
						}else {
							title= title.toLowerCase();
							cadena = cadena.toLowerCase();
							if (title.contains(cadena)) {
								
									resultados.add(libro);
								
							}
						}
					}
					
					
					break;
					
				case "Editorial":
					
					String editor = libro.getEditorial();
					if(editor.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (editor.indexOf(cadena) > -1) {
								
									resultados.add(libro);
								
							}
						}else {
							editor= editor.toLowerCase();
							cadena = cadena.toLowerCase();
							if (editor.contains(cadena)) {
								
									resultados.add(libro);
								
							}
						}
					}
					
					
					break;
					
				case "Paginas":
					
					String pag = "" + libro.getPaginas();
					if(pag.length()>=cadena.length()) {
						if (pag.indexOf(cadena) > -1) {
							
								resultados.add(libro);
							
						}
					}
											
					break;
					
				case "Altura":
					
					String alt = "" + libro.getAltura();
					if(alt.length()>=cadena.length()) {
						if (alt.indexOf(cadena) > -1) {
							
								resultados.add(libro);
							
						}
					}

					break;
								
				case "Notas":
					
					String note = libro.getNotas();
					if(note.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (note.indexOf(cadena) > -1) {
								
									resultados.add(libro);
								
							}
						}else {
							note= note.toLowerCase();
							cadena = cadena.toLowerCase();
							if (note.contains(cadena)) {
								
									resultados.add(libro);
								
							}
						}
					}

					break;
					
				case "ISBN":
					
					String isb = libro.getIsbn();
					if(isb.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (isb.indexOf(cadena) > -1) {
								
									resultados.add(libro);
								
							}
						}else {
							isb= isb.toLowerCase();
							cadena = cadena.toLowerCase();
							if (isb.contains(cadena)) {
								
									resultados.add(libro);
								
							}
						}
					}

					break;
					
				case "Materias":
					
					String mater = libro.getMaterias();
					if(mater.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (mater.indexOf(cadena) > -1) {
								
									resultados.add(libro);
								
							}
						}else {
							mater= mater.toLowerCase();
							cadena = cadena.toLowerCase();
							if (mater.contains(cadena)) {
								
									resultados.add(libro);
								
							}
						}
					}
					
					break;
				case "Todos":
					
					title = libro.getTitulo();
					if(title.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (title.indexOf(cadena) > -1) {
								
									agregar_resultado = true;
								
							}
						}else {
							title= title.toLowerCase();
							cadena = cadena.toLowerCase();
							if (title.contains(cadena)) {
								
									agregar_resultado = true;
								
							}
						}
					}

					
					editor = libro.getEditorial();
					if(editor.length()>=cadena.length()) {
						if (parametro3.equals("true")) {
							if (editor.indexOf(cadena) > -1) {
								
									agregar_resultado = true;
								
							}
						}else {
							editor= editor.toLowerCase();
							cadena = cadena.toLowerCase();
							if (editor.contains(cadena)) {
								
									agregar_resultado = true;
								
							}
						}
					}

					
					 pag = "" + libro.getPaginas();
					 if(pag.length()>=cadena.length()) {
							if (pag.indexOf(cadena) > -1) {
								
									agregar_resultado = true;
								
							}
					 }

						
					alt = "" + libro.getAltura();
					 if(alt.length()>=cadena.length()) {
							if (alt.indexOf(cadena) > -1) {
								
									agregar_resultado = true;
								
							}
					 }

					
					 note = libro.getNotas();
					 if(note.length()>=cadena.length()) {
							if (parametro3.equals("true")) {
								if (note.indexOf(cadena) > -1) {
									
										agregar_resultado = true;
									
								}
							}else {
								note= note.toLowerCase();
								cadena = cadena.toLowerCase();
								if (note.contains(cadena)) {
									
										agregar_resultado = true;
									
								}
							}
					 }

						
						isb = libro.getIsbn();
						if(isb.length()>=cadena.length()) {
							if (parametro3.equals("true")) {
								if (isb.indexOf(cadena) > -1) {
									
										agregar_resultado = true;
									
								}
							}else {
								isb= isb.toLowerCase();
								cadena = cadena.toLowerCase();
								if (isb.contains(cadena)) {
									
										agregar_resultado = true;
									
								}
							}
						}

						
						mater = libro.getMaterias();
						if(mater.length()>=cadena.length()) {
							if (parametro3.equals("true")) {
								if (mater.indexOf(cadena) > -1) {
									
										agregar_resultado = true;
									
								}
							}else {
								mater= mater.toLowerCase();
								cadena = cadena.toLowerCase();
								if (mater.contains(cadena)) {
									
										agregar_resultado = true;
									
								}
							}
						}

						
						if(agregar_resultado) {
							resultados.add(libro);
						}
					
					
					break;
			}
		}
		
		
		
		
		
		
		
		
	}
		imprimir_resultados();
		
	}
}
