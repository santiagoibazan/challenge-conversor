

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;

public class Menu {
	public static void main(String[] args) {
/*		JFrame frame = new JFrame("Conversor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel principalPanel = new JPanel();
		JLabel titulo = new JLabel();
		JButton boton = new JButton("Convertir");
		
				
		titulo.setText("Super Conversor 3000");
		boton.setBounds(10, 20, 50, 50);
		frame.getContentPane().add(titulo);
		frame.getContentPane().add(boton);
		frame.setSize(800, 600);
		
		frame.setVisible(true);
*/
		JFrame ventana = new JFrame("BoxLayout Manager");
		JPanel panel = new JPanel();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JLabel labe = new JLabel("pito");
		Container contenedor = ventana.getContentPane();
		panel.setLayout(null);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(labe);
		labe.setBounds(5, 5, 100, 100);
		b1.setBounds(5, 106, 50, 50);
		contenedor.add(new JLabel("Hola"), BorderLayout.NORTH);
		contenedor.add(b4, BorderLayout.WEST);
		contenedor.add(panel, BorderLayout.CENTER);
		
		
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}
}
