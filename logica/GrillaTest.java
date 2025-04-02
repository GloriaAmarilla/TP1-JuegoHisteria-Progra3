package logica;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class GrillaTest {

	Grilla grilla;
	int filaBien, columnaBien, filaMal, columnaMal, filaBien2, columnaBien2;
	Casilla cuadroPrueba;
	
	@Before
	public void setUp () throws Exception{
		grilla = new Grilla(5);
		filaBien = 4;
		columnaBien = 2;
		filaMal = 8;
		columnaMal = -3;
		cuadroPrueba = new Casilla();
		filaBien2 = 3;
		columnaBien2 = 3;
	}
	
	@Test
	
	public void laGrillaEstaEnInicioTest () {
		assertTrue (grilla.todasCasillasEnColorOriginal());
	}
	
	@Test
	public void indiceDeFilaOColumnaNoAptoTest () {
		assertFalse (grilla.existeCasilla(filaMal, columnaBien));
		assertFalse (grilla.existeCasilla(filaBien, columnaMal));
	}
	
	@Test
	public void colorDeCiertaCasillaEnColorOriginalTest () {
		assertTrue (grilla.consultarColorDeCasilla(filaBien, columnaBien).equals(cuadroPrueba.consultarColor()));
	}
	
	@Test 
	public void dosCasillasConColorIgualTest() {
		Color color1= grilla.consultarColorDeCasilla(filaBien, columnaBien);
		Color color2 = grilla.consultarColorDeCasilla(filaBien2, columnaBien2);
		assertEquals(color1,color2);
	}
}
