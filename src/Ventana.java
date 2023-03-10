import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JPanel panelTitulo = new JPanel();
	JLabel titulo = new JLabel();
		
	JPanel panelSeleccion = new JPanel();
	JButton monedaBoton = new JButton("Moneda");
	JButton tempBoton = new JButton("Temperatura");
	JButton longitudBoton = new JButton("Longitud");
	
	JPanel panelCentral = new PanelCentral();
	JPanel panelMoneda = new PanelMoneda();
	JPanel panelTemperatura = new PanelTemperatura();
	JPanel panelLongitud = new PanelLongitud();

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
		longitudBoton.addActionListener(this);
		agregarImagen(monedaBoton, "images/exchange.png");
		agregarImagen(tempBoton, "images/thermometer.png");
		agregarImagen(longitudBoton, "images/ruler.png");
		panelSeleccion.add(monedaBoton);
		panelSeleccion.add(tempBoton);
		panelSeleccion.add(longitudBoton);
		panelSeleccion.setLayout(new GridLayout(3,1));
		
		
		getContentPane().add(panelSeleccion, BorderLayout.WEST);
		getContentPane().add(panelTitulo, BorderLayout.NORTH);
		getContentPane().add(panelCentral, BorderLayout.CENTER);
		
		setSize(875, 600);
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
				mostrarPanel(panelTemperatura);
				break;
			}
			case "Longitud": {
				ocultarPaneles();
				mostrarPanel(panelLongitud);
				habilitarBotones();
				longitudBoton.setEnabled(false);
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
		longitudBoton.setEnabled(true);
	}
	
	private void mostrarPanel(JPanel panel) {
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setVisible(true);
	}
	private void ocultarPaneles() {
		panelCentral.setVisible(false);
		panelMoneda.setVisible(false);
		panelLongitud.setVisible(false);
		panelTemperatura.setVisible(false);

	}
	
	private void agregarImagen(JButton boton, String ruta) {
		try {
			Image img = ImageIO.read(getClass().getResource(ruta));
			boton.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
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

