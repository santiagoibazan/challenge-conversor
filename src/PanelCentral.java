//import java.awt.Color;

import javax.swing.*;

public class PanelCentral extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JLabel opcionesLabel = new JLabel("Elija una de las opciones");
	private JLabel monedaLabel = new JLabel("Conversor de divisas: ARS, USD, JPY, EUR, etc.");
	private JLabel tempLabel = new JLabel("Conversor de temperaturas: Celcius, Farenheit, Kelvin");
	private JLabel longitudLabel = new JLabel("Conversor de Longitud: Metros, Centimetros, Yardas, Millas, etc");	
	
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
		
		//setBackground(Color.WHITE);
	}
	

}
