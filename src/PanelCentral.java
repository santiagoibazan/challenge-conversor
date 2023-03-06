import java.awt.Color;

import javax.swing.*;

public class PanelCentral extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JLabel opcionesLabel = new JLabel("Elija una de las opciones");
	private JLabel monedaLabel = new JLabel("Moneda: convertir el valor de una moneda a otra");
	private JLabel tempLabel = new JLabel("Temperatura : convertir a temperaturas celcius, farenheit o kelvin");
	private JLabel longitudLabel = new JLabel("Longitudes: convertir metros, centimetros, yardas, etc");	
	
	public PanelCentral() {
		setLayout(null);
		
		opcionesLabel.setBounds(300, 5, 500, 50);
		monedaLabel.setBounds(25, 60, 500, 50);
		tempLabel.setBounds(25, 230, 500, 50);
		longitudLabel.setBounds(25, 397, 500, 50);
		
		add(opcionesLabel);
		add(monedaLabel);
		add(tempLabel);
		add(longitudLabel);
		
		setBackground(Color.WHITE);
	}
	

}
