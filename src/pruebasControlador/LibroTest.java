package pruebasControlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Libro;

class LibroTest {

	@Test
	void test() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("Quijote;marca;800;7.0;Libro gordo;96325874101234;historia;", plibro.toString());
	}

	@Test
	void test2() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("Quijote;marca;800;7.0;Libro gordo;96325874101234;historia;", plibro.toString());
	}
	
	
	@Test
	void test3() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("Quijote", plibro.getTitulo());
	}
	
	@Test
	void test4() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("marca", plibro.getEditorial());
	}
	
	@Test
	void test5() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals(7.0, plibro.getAltura());
	}

	@Test
	void test6() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals(800, plibro.getPaginas());
	}
	
	@Test
	void test7() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("Libro gordo", plibro.getNotas());
	}
	
	@Test
	void test8() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "Libro gordo", "historia");
		assertEquals("Libro gordo", plibro.getIsbn());
	}
	
	@Test
	void test9() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("historia", plibro.getMaterias());
	}
	
	@Test
	void test10() {
		Libro pLibro = new Libro();
		pLibro.setTitulo("Quijote2");
		assertEquals("Quijote2",pLibro.getTitulo());
	}
	
	@Test
	void test11() {
		Libro pLibro = new Libro();
		pLibro.setEditorial("marca2");
		assertEquals("marca2",pLibro.getEditorial());
	}
	
	@Test
	void test12() {
		Libro pLibro = new Libro();
		pLibro.setAltura(8.0);
		assertEquals(8.0,pLibro.getAltura());
	}

	@Test
	void test13() {
		Libro pLibro = new Libro();
		pLibro.setPaginas(1200);
		assertEquals(1200,pLibro.getPaginas());
	}
	
	@Test
	void test14() {
		Libro pLibro = new Libro();
		pLibro.setNotas("notas2");
		assertEquals("notas2",pLibro.getNotas());
	}
	
	@Test
	void test15() {
		Libro pLibro = new Libro();
		pLibro.setIsbn("4512364");
		assertEquals("4512364",pLibro.getIsbn());
	}
	
	@Test
	void test16() {
		Libro pLibro = new Libro();
		pLibro.setMaterias("materias2");
		assertEquals("materias2",pLibro.getMaterias());
	}
	
	@Test
	void test17() {
		Libro plibro = new  Libro( "Quijote", "marca", 800, 7, "Libro gordo", "96325874101234", "historia");
		assertEquals("\n" + 
				" Titulo: Quijote || Editorial: marca || Paginas: 800 || Altura: 7.0 || Notas: Libro gordo || ISBN: 96325874101234 || Materias: historia", plibro.toStringFormateado());
	}
}
