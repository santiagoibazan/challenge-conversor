import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSeleccion extends JPanel {

	JButton monedaBoton = new JButton("Moneda");
	JButton tempBoton = new JButton("Temperatura");
	JButton longitudBoton = new JButton("Longitud");
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelSeleccion() {
		add(monedaBoton);
		add(tempBoton);
		add(longitudBoton);
		setLayout(new GridLayout(3,1));
	}

	private void agregarImagen(JButton boton, String ruta) {
		try {
			Image img = ImageIO.read(getClass().getResource(ruta));
			boton.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
