package logica;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GrillaTest {

	Grilla grilla;
	int filaBien;
	int columnaBien;
	int filaMal;
	int columnaMal;
	Casilla cuadroPrueba;
	
	@Before
	public void setUp () throws Exception{
		grilla = new Grilla();
		filaBien = 4;
		columnaBien = 2;
		filaMal = 8;
		columnaMal = -3;
		cuadroPrueba = new Casilla();
		
	}
	
	@Test
	
	public void laGrillaEstaEnInicio () {
		assertTrue (grilla.todasCasillasEnColorOriginal());
	}
	
	@Test
	public void indiceDeFilaOColumnaNoApto () {
		assertFalse (grilla.filasYColumnasAptas(filaMal, columnaBien));
		assertFalse (grilla.filasYColumnasAptas(filaBien, columnaMal));
	}
	
	@Test
	public void colorDeCiertaCasillaEnColorOriginal () {
		assertTrue (grilla.consultarColorDeCasilla(filaBien, columnaBien).equals(cuadroPrueba.consultarColor()));
	}
}
