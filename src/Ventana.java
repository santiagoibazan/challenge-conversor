import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JPanel panelTitulo = new JPanel();
	JPanel panelSeleccion = new JPanel();
	JLabel titulo = new JLabel();
	
	JPanel panelCentral = new PanelCentral();
	
	JButton monedaBoton = new JButton("Moneda");
	JButton tempBoton = new JButton("Temperatura");
	JButton distanciaBoton = new JButton("Distancia");
	
	JPanel panelMoneda = new PanelMoneda();

	private Ventana() {
		super("Super Conversor 3000");
	}	
	
	public void ejecutarVentana() {

		titulo.setText("Super Conversor 3000");
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panelTitulo.add(titulo);

		monedaBoton.addActionListener(this);
		tempBoton.addActionListener(this);
		distanciaBoton.addActionListener(this);
		panelSeleccion.add(monedaBoton);
		panelSeleccion.add(tempBoton);
		panelSeleccion.add(distanciaBoton);
		panelSeleccion.setLayout(new GridLayout(3,1));
		
		
		getContentPane().add(panelSeleccion, BorderLayout.WEST);
		getContentPane().add(panelTitulo, BorderLayout.NORTH);
		getContentPane().add(panelCentral, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
				
		switch (e.getActionCommand()) {
			case "Moneda": {
				ocultarPaneles();
				habilitarBotones();
				monedaBoton.setEnabled(false);
				mostrarPanel(panelMoneda);
				break;
			}
			case "Temperatura": {
				habilitarBotones();
				tempBoton.setEnabled(false);
				ocultarPaneles();
				break;
			}
			case "Distancia": {
				habilitarBotones();
				distanciaBoton.setEnabled(false);
				ocultarPaneles();
				break;
			}
			default: {
				System.out.println("Algo no funcionó :(");
			}
		}

		

		
	}
	
	private void habilitarBotones() {
		monedaBoton.setEnabled(true);
		tempBoton.setEnabled(true);
		distanciaBoton.setEnabled(true);
	}
	
	private void mostrarPanel(JPanel panel) {
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setVisible(true);
	}
	private void ocultarPaneles() {
		panelCentral.setVisible(false);
		panelMoneda.setVisible(false);

	}
	
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
	        @Override
	        public void run() {
	            new Ventana().ejecutarVentana();
	        }
	    });
	}
}

