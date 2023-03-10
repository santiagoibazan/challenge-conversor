import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelConversor extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	

	private JLabel labelDe = new JLabel("De: ");
	private JLabel labelA = new JLabel("A: ");
	private JLabel labelCantidad = new JLabel("Cantidad:");
	protected JTextField valor = new JTextField();
	public JButton convertir = new JButton("Convertir");
	@SuppressWarnings("rawtypes")
	private JComboBox listaEnumDe;
	@SuppressWarnings("rawtypes")
	private JComboBox listaEnumA;
	private JLabel resultadoLabel;
	private JLabel resultadoConversion;
	private boolean primerResultado = false;
	
	@SuppressWarnings("unchecked")
	public <E extends Enum<E>> PanelConversor(String nombre, E[] tipoEnum) {
		

		JLabel tituloConversor = new JLabel("Conversor de " + nombre);
		listaEnumDe = new JComboBox<E>();
		listaEnumA = new JComboBox<E>();
		
		setLayout(null);
		
		for (E a: tipoEnum) {
			listaEnumDe.addItem(a);
			listaEnumA.addItem(a);
		}
		
		tituloConversor.setBounds(50, 50, 600, 25);
		tituloConversor.setFont(new Font("Arial", Font.BOLD, 18));
		labelDe.setBounds(60, 100, 100, 50);
		listaEnumA.setBounds(170, 100, 200, 50);
		labelCantidad.setBounds(60, 200, 100, 50);
		valor.setBounds(170, 200, 200, 50);
		labelA.setBounds(60, 300, 100, 50);
		listaEnumDe.setBounds(170, 300, 200, 50);
		convertir.setBounds(170, 400, 200, 50);
		
		convertir.addActionListener(this);
		
		add(labelDe);
		add(labelA);
		add(labelCantidad);
		add(tituloConversor);
		add(listaEnumDe);
		add(valor);
		add(listaEnumA);
		add(convertir);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(valor.getText());
		System.out.println(listaEnumA.getSelectedIndex());
		System.out.println(listaEnumDe.getSelectedIndex());
		
		if (!primerResultado) {
			mostrarResultado();
			primerResultado = true;
		} else {
			resultadoConversion.setText(valor.getText());
		}
		
		setVisible(false);
		setVisible(true);
		verificarValor(valor.getText());
	}
	
	private boolean verificarValor(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Valor no valido");
			return false;
		}
	}
	
	private void mostrarResultado() {
		resultadoLabel = new JLabel("Resultado");
		resultadoLabel.setBounds(450, 150, 200, 50);
		add(resultadoLabel);
		resultadoConversion = new JLabel(valor.getText());
		resultadoConversion.setBounds(450, 250, 200, 50);
		add(resultadoConversion);
	}


}
