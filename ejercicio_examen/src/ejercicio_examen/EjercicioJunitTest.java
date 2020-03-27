package ejercicio_examen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EjercicioJunitTest extends EjercicioJunit {
		
	static int a;
	static int b;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		a = 100;
		b = 20;
		System.out.println("Comienzan los test...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizan los test...");
	}

	@Test
	void testSumar() {
		EjercicioJunitTest EjercicioJunitTest = new EjercicioJunitTest();
		int resultado = EjercicioJunitTest.sumar(a,b);
		
		int esperado = 120;
		
		assertEquals(esperado, resultado);
	}
	

	@Test
	void testRestar() {
		EjercicioJunitTest EjercicioJunitTest = new EjercicioJunitTest();
		int resultado = EjercicioJunitTest.restar(a,b);
		
		int esperado = 80;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplicar() {
		EjercicioJunitTest EjercicioJunitTest = new EjercicioJunitTest();
		int resultado = EjercicioJunitTest.sumar(a,b);
		
		int esperado = 1600;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDividir() {
		EjercicioJunitTest EjercicioJunitTest = new EjercicioJunitTest();
		int resultado = EjercicioJunitTest.sumar(a,b);
		
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

}
