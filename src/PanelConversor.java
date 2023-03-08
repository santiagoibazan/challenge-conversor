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
	
	public PanelConversor(String nombre) {
		JLabel tituloConversor = new JLabel("Conversor de " + nombre);
		setLayout(null);
		tituloConversor.setBounds(50, 50, 600, 25);
		tituloConversor.setFont(new Font("Arial", Font.BOLD, 18));
		labelDe.setBounds(100, 100, 100, 50);
		//listaMonedasDe.setBounds(210, 100, 200, 50);
		labelCantidad.setBounds(100, 200, 100, 50);
		valor.setBounds(210, 200, 200, 50);
		labelA.setBounds(100, 300, 100, 50);
		//listaMonedasA.setBounds(210, 300, 200, 50);
		convertir.setBounds(210, 400, 200, 50);
		
		convertir.addActionListener(this);
		
		add(labelDe);
		add(labelA);
		add(labelCantidad);
		add(tituloConversor);
		//add(listaMonedasDe);
		add(valor);
		//add(listaMonedasA);
		add(convertir);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(valor.getText());		
	}
	


}
