package logica;

import java.awt.Color;

public class Grilla {
	
	private Casilla [][] grilla;
	private int cantFilas;
	private int cantColumnas;
	
	public Grilla (int cant) {
		cantFilas = cant;
		cantColumnas = cant;
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
		verificarCasilla(fila,columna);
		return grilla[fila][columna].consultarColor();
	}
	
	private void verificarCasilla(int fila, int columna) {
		if (!existeCasilla(fila, columna))
			throw new IllegalArgumentException ("Fila o columna no pertenece a grilla.");
	}
	
	public boolean existeCasilla (int fila, int columna) {
		if (fila<0 || fila >cantFilas || columna<0 || columna>cantColumnas)
			return false;
		return true;
	}
	
	public boolean consultarSiPintado(int fila, int columna) {
		verificarCasilla(fila,columna);	
		return grilla[fila][columna].consultaSiPintado();
	}
	
	public Color cambiarColorA (int fila, int columna) {
		verificarCasilla(fila,columna);
		Color colorActual=grilla[fila][columna].cambiarColor();
		return colorActual;
	}
	
	public boolean estasCasillasColorIgual (int fila1, int columna1, int fila2, int columna2) {
		verificarCasilla (fila1, columna1);
		verificarCasilla (fila2, columna2);
		
		Casilla casilla1 = grilla[fila1][columna1];
		Casilla casilla2 = grilla[fila2][columna2];
		
		return casilla1.consultarColor().equals(casilla2.consultarColor());
	}
}
