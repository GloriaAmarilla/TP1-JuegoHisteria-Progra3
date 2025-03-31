package logica;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class CasillaTest {
	//Variables a usar:
	Casilla cuadrito;
	Color gris;
	//Dar valores a variables prueba
	@Before 
	public void setUp() throws Exception{
		cuadrito = new Casilla ();
		gris = new Color (127,127,127);
	}
	//Los tests
	
	@Test
	public void saberSiColorGrisInicial () {
//		System.out.println(cuadrito.consultarColor());
		assertEquals (cuadrito.consultarColor(), gris);
	}
	
	@Test
	public void logroCambiarElColor() {
		cuadrito.cambiarColor();
//		System.out.println(cuadrito.consultarColor());
		assertTrue (cuadrito.consultaSiPintado());
		assertFalse(cuadrito.consultarColor().equals(gris));
	}
	
	@Test
	public void logroVolverAlColorOriginal () {
		cuadrito.cambiarColor();
//		System.out.println(cuadrito.consultarColor());
		cuadrito.volverOriginal();
//		System.out.println(cuadrito.consultarColor());
		assertFalse(cuadrito.consultaSiPintado());
		assertEquals (cuadrito.consultarColor(), gris);
	}

}
