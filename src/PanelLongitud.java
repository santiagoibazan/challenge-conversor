import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class PanelLongitud extends PanelConversor {

	private static final long serialVersionUID = 1L;
	private JComboBox<EnumLongitud> listaLongitudDe = new JComboBox<EnumLongitud>();
	private JComboBox<EnumLongitud> listaLongitudA = new JComboBox<EnumLongitud>();

	public PanelLongitud() {
		super("Longitud");
		
		for (EnumLongitud a: EnumLongitud.values()) {
			listaLongitudA.addItem(a);
			listaLongitudDe.addItem(a);
		}
		listaLongitudDe.setBounds(210, 100, 200, 50);
		listaLongitudA.setBounds(210, 300, 200, 50);
		add(listaLongitudDe);
		add(listaLongitudA);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(valor.getText());
		System.out.println("ListaLongitudDe: "  + listaLongitudDe.getSelectedIndex());
		System.out.println("ListaLongitudA: "  + listaLongitudA.getSelectedIndex());
		}

}
