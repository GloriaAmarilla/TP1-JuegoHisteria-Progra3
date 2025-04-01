package visual;

import javax.swing.JButton;
import javax.swing.JFrame;

import logica.Grilla;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class View {

	public static void main(String[] args) {
		Grilla grilla=new Grilla(5);
        JFrame frame = new JFrame("Ventana con 25 Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        // Usar GridLayout para distribuir 5 filas x 5 columnas
        
        int columnas = 5;
        frame.setLayout(new GridLayout(5, 5)); // Esto crea 25 celdas

        // Crear 25 botones
        for (int i = 0; i < 25; i++) {
            JButton button = new JButton();

            button.setBackground(Color.GRAY);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	int index = getButtonIndex(frame, button);  // Obtener el índice del botón
                    int fila = index / columnas;  // Calcular la fila
                    int col = index % columnas; // Calcular la columna
                    button.setBackground(grilla.cambiarColorA(fila, col));
                    

                    // Mostrar la fila y la columna
//                    System.out.println(index+"Botón presionado en fila " + fila + ", columna " + col);
                    ArrayList<int[]> pucho = new ArrayList<>();
                    pucho=listaDeCordenas(fila,col);
                    
                    for (int[] elem : pucho) {
                    	int ban=0;
                    	for(int num:elem ) {
                    		if(ban==0)
                    			System.out.println(num+" fila");
                    		
                    		else {
                    			System.out.println(num+" columna");
                    		}
                    		ban++;
                    	}
                    }
                }
            });

            frame.add(button);
        }

        frame.setVisible(true);
    }

    
 // Método para obtener el índice del botón en el contenedor
    private static int getButtonIndex(JFrame frame, JButton button) {
        Component[] components = frame.getContentPane().getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] == button) {
                return i;  // Devolver el índice del botón
            }
        }
        return -1;  // Si no se encuentra el botón, devolver -1
    }
    
    private static ArrayList listaDeCordenas(int fila,int col) {
    	ArrayList<int[]> listaDeCord= new ArrayList<>();
    	listaDeCord.add(new int[]{fila,col-1});
    	listaDeCord.add(new int[]{fila+1,col});
    	listaDeCord.add(new int[]{fila,col+1});
    	listaDeCord.add(new int[]{fila-1,col});
    	
    	return listaDeCord;
    }

}
