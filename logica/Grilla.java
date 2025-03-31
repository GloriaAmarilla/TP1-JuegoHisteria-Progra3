package logica;

import java.awt.Color;

public class Grilla {
	
	private Casilla [][] grilla;
	private int cantFilas;
	private int cantColumnas;
	
	public Grilla () {
		cantFilas = 5;
		cantColumnas = 5;
		grilla = new Casilla [cantFilas][cantColumnas];

		for (int f=0; f<cantFilas; f++) {
			for (int c=0; c<cantColumnas; c++) {
				grilla[f][c] = new Casilla ();
			}
		}
	}
	
	public boolean todasCasillasEnColorOriginal () {
		boolean todasEnColorOriginal = true;
		for (int f=0; f<cantFilas; f++) {
			for (int c=0; c<cantColumnas; c++) {
				todasEnColorOriginal &= !grilla[f][c].consultaSiPintado();
			}
		}
		return todasEnColorOriginal;
	}
	
	public Color consultarColorDeCasilla (int fila, int columna) {
		if (!filasYColumnasAptas(fila, columna))
			new RuntimeException ("Fila o columna no pertenece a grilla.");
		return grilla[fila][columna].consultarColor();
	}
	
	public boolean filasYColumnasAptas (int fila, int columna) {
		if (fila<0 || fila >cantFilas || columna<0 || columna>cantColumnas)
			return false;
		return true;
	}
}
