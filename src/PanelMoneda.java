//import java.awt.Font;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PanelMoneda extends PanelConversor implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public JButton convertir = new JButton("Convertir");
	
	public PanelMoneda() {
		super("Monedas", EnumMonedas.values());
		setVisible(true);
	}
}
	
