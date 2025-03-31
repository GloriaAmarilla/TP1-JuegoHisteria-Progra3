package logica;

import java.awt.Color;
import java.util.ArrayList;
import java.util.random.*;

public class Casilla {

	private boolean pintado;
	private Color colorActual;
	private ArrayList<Color> posiblesColoresDeCambio;
	private Color grisOriginal = new Color (127,127,127);
	private Color rojo = new Color(255,0,0);
	private Color azul = new Color(0,0,255);
	private Color verde = new Color(0,128,0);
	private Color rosa = new Color(255,102,204);
	private Color anaranjado = new Color(100,64,0);
	private Color celeste = new Color(135,206,235);
	
	public Casilla () {
		pintado = false;
		colorActual = grisOriginal;
		posiblesColoresDeCambio = new ArrayList <Color>();
		posiblesColoresDeCambio.add(rojo);
		posiblesColoresDeCambio.add(azul);
		posiblesColoresDeCambio.add(verde);
		posiblesColoresDeCambio.add(rosa);
		posiblesColoresDeCambio.add(anaranjado);
		posiblesColoresDeCambio.add(celeste);
	}
	
	public Color consultarColor() {
		return colorActual;
	}
	
	public boolean consultaSiPintado () {
		return pintado;
	}
	
	public void cambiarColor() {
		int posicion = (int) (Math.random() * 6) ;
		//System.out.println(posicion);
		colorActual = posiblesColoresDeCambio.get(posicion);
		pintado = true;
	}
	
	public void volverOriginal () {
		colorActual = grisOriginal;
		pintado = false;
	}
}
