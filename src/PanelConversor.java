import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.*;

public abstract class PanelConversor extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	

	private JLabel labelDe = new JLabel("De: ");
	private JLabel labelA = new JLabel("A: ");
	private JLabel labelCantidad = new JLabel("Cantidad:");
	protected JTextField valor = new JTextField();
	public JButton convertir = new JButton("Convertir");
	@SuppressWarnings("rawtypes")
	protected JComboBox listaEnumDe;
	@SuppressWarnings("rawtypes")
	protected JComboBox listaEnumA;
	protected JLabel resultadoLabel;
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
		listaEnumDe.setBounds(170, 100, 200, 50);
		labelCantidad.setBounds(60, 200, 100, 50);
		valor.setBounds(170, 200, 200, 50);
		labelA.setBounds(60, 300, 100, 50);
		listaEnumA.setBounds(170, 300, 200, 50);
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
		System.out.println(new BigDecimal("1").multiply(new BigDecimal("0.001")));
		
		if (verificarValor(valor.getText())) {
			if (!primerResultado) {
				
				mostrarResultado();
				primerResultado = true;
			} else {
				resultadoConversion.setText(setResultado());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Valor no valido");
		}
		
		setVisible(false);
		setVisible(true);
	}
	
	private boolean verificarValor(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	private void mostrarResultado() {
		resultadoLabel = new JLabel("Resultado");
		resultadoLabel.setBounds(450, 150, 200, 50);
		add(resultadoLabel);
		resultadoConversion = new JLabel(setResultado());
		resultadoConversion.setBounds(450, 250, 200, 50);
		add(resultadoConversion);
	}

	public String setResultado() {
		int numA = 99, numDe = 99;
		for (EnumTemperaturas temp: EnumTemperaturas.values()) {
			if (listaEnumA.getSelectedIndex() == temp.ordinal()) {
				numA = listaEnumA.getSelectedIndex();
			}
			if (listaEnumDe.getSelectedIndex() == temp.ordinal()) {
				numDe = listaEnumDe.getSelectedIndex();
			}
		}
		return conversion(numDe, numA, valor.getText());
	}
	public abstract String conversion(int de, int a, String valor);
}
