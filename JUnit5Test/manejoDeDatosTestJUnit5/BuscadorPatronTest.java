package manejoDeDatosTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import main.Main;
import manejoDeDatos.Buscador;
import modelo.Libro;

class BuscadorPatronTest {
	
	

	@Test
	void test() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test1() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n3\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test2() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n1\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test3() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n2\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test4() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n4\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test5() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n5\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test6() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n6\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test7() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n7\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test8() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="8\nx\n1\nDon*;Titulo;true";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test9() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n7\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test10() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nDon\n10\nw\n7\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test18() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test17() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n3\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test16() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n1\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test15() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n2\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test14() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n4\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test13() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n5\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test12() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n6\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test11() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n2\nDon\n10\nw\n7\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	
	@Test
	void test19() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test20() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n50\n10\nw\n3\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test21() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n1\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test22() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nesp\n10\nw\n2\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test48() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n25\n10\nw\n4\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test24() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nnot\n10\nw\n5\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test25() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n54\n10\nw\n6\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test26() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\ncien\n10\nw\n7\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	
	@Test
	void test27() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test28() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n50\n10\nw\n3\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test29() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n1\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test30() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nesp\n10\nw\n2\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test31() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n2\n10\nw\n4\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test32() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nnot\n10\nw\n5\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test33() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n5\n10\nw\n6\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test34() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nCien\n10\nw\n7\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test35() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n50\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test36() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test37() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nesp\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test23() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n25\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test38() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nnot\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test39() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n54\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test40() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\ncien\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	
	@Test
	void test41() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n50\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test42() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nDon\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test43() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nesp\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test44() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n2\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test45() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nnot\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test46() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\n5\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test47() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n1\nCien\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	//AQUI NO SIGUAS CAMBIANDO
	
	@Test
	void test49() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nte\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test50() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n3\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test51() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nte\n10\nw\n1\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test52() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nasa\n10\nw\n2\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test53() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n4\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test54() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\ntas\n10\nw\n5\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test55() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n8\n10\nw\n6\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test56() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nion\n10\nw\n7\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	
	@Test
	void test57() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nte\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test58() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n3\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test59() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nte\n10\nw\n1\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test60() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nasa\n10\nw\n2\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test61() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n4\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test62() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\ntas\n10\nw\n5\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test63() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n6\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test64() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nion\n10\nw\n7\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test65() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test66() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nDon\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test67() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nasa\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test68() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test69() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\ntas\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test70() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test71() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nion\n10\nw\n8\ny\nn";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	
	@Test
	void test72() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	@Test
	void test73() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nte\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test74() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nasa\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test75() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test76() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\ntas\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test77() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\n0\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	@Test
	void test78() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
		Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
		Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
		
		libros.add(quijote);
		libros.add(biblia);
		libros.add(koran);
		
		String datos="2\n8\nz\n3\nion\n10\nw\n8\ny\ns";
		Buscador busca = new Buscador(libros);
		
		InputStream in = new ByteArrayInputStream(datos.getBytes());
		System.setIn(in);
		Main.sc = new Scanner(System.in);
		
		assertEquals(true, busca.como_buscar());
		
	}
	
	//Hasta aqui 2
	
	
		@Test
		void test79() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nte\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test80() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n3\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		@Test
		void test81() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nte\n10\nw\n1\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test82() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nasa\n10\nw\n2\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test83() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n4\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test84() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\ntas\n10\nw\n5\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test85() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n8\n10\nw\n6\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test86() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nion\n10\nw\n7\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		
		@Test
		void test87() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nte\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test88() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n3\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		@Test
		void test89() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nte\n10\nw\n1\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test90() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nasa\n10\nw\n2\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test91() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n4\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test92() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\ntas\n10\nw\n5\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test93() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n6\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test94() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nion\n10\nw\n7\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test95() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		@Test
		void test96() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nDon\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test97() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nasa\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test99() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test100() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\ntas\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test101() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test102() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nion\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		
		@Test
		void test103() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		@Test
		void test104() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nte\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test105() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nasa\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test106() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test107() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\ntas\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test108() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n0\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test109() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\nion\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test110() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n1\n10\nw\n6\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test111() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n1\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test112() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n2\n1\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test113() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n3\n1\n10\nw\n6\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test114() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n3\n1\n10\nw\n6\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test115() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n3\n1\n10\nw\n8\ny\nn";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test116() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n3\n1\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
		
		@Test
		void test117() {
			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro quijote = new Libro("Don Quijote", "espasa", 500, 250, "notas", "5468451", "Locura"); 
			Libro biblia = new Libro("La biblia", "espasa", 500, 500, "notas", "5468468", "Ciencia ficcion");
			Libro koran = new Libro("El koran", "espasa", 500, 750, "notas", "8879465", "Ciencia ficcion");  
			
			libros.add(quijote);
			libros.add(biblia);
			libros.add(koran);
			
			String datos="2\n8\nz\n3\nasa\n10\nw\n8\ny\ns";
			Buscador busca = new Buscador(libros);
			
			InputStream in = new ByteArrayInputStream(datos.getBytes());
			System.setIn(in);
			Main.sc = new Scanner(System.in);
			
			assertEquals(true, busca.como_buscar());
			
		}
	
}
