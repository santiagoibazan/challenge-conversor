import java.awt.Font;

import javax.swing.*;


public class PanelMoneda extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel seleccion = new JLabel("Elija la moneda e ingrese la cantidad de dinero que desee convertir");
	private JTextField valor = new JTextField();
	private JComboBox<EnumMonedas> monedas = new JComboBox<EnumMonedas>();
	
	public PanelMoneda() {
		
		setLayout(null);
		
		seleccion.setBounds(50, 50, 600, 25);
		seleccion.setFont(new Font("Arial", Font.BOLD, 18));
				
		for (EnumMonedas a: EnumMonedas.values()) {
			monedas.addItem(a);
		}
		
		monedas.setBounds(100, 100, 200, 50);
		valor.setBounds(320, 100, 200, 50);
		
		add(seleccion);
		add(monedas);
		add(valor);

		setVisible(true);
	}
	
}
