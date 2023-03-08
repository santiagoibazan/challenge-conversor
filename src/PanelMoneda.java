//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PanelMoneda extends PanelConversor implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JComboBox<EnumMonedas> listaMonedasDe = new JComboBox<EnumMonedas>();
	private JComboBox<EnumMonedas> listaMonedasA = new JComboBox<EnumMonedas>();
	
	public JButton convertir = new JButton("Convertir");
	
	public PanelMoneda() {
		super("Monedas");
	
		for (EnumMonedas a: EnumMonedas.values()) {
			listaMonedasDe.addItem(a);
			listaMonedasA.addItem(a);
		}

		listaMonedasDe.setBounds(210, 100, 200, 50);
		listaMonedasA.setBounds(210, 300, 200, 50);

		add(listaMonedasDe);
		add(listaMonedasA);


		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(valor.getText());
		System.out.println("ListaMonedasDe: "  + listaMonedasDe.getSelectedIndex());
		System.out.println("ListaMonedasA: "  + listaMonedasA.getSelectedIndex());
		}
	
		
	}
	
