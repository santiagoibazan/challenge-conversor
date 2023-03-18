import java.math.BigDecimal;
import java.math.RoundingMode;

//import javax.swing.JLabel;

public class PanelMoneda extends PanelConversor{

	private static final long serialVersionUID = 1L;	
	//private JLabel opcionValores = new JLabel("Elija los valores a utilizar en la conversion");
	
	public PanelMoneda() {
		super("Monedas", EnumMonedas.values());
		setVisible(true);
	}
	

	@Override
	public String conversion(int de, int a, String valorObtenido) {
		String valorMonedaA = "";
		String valorMonedaDe  = "";
		for (EnumMonedas index: EnumMonedas.values()) {
			if (index.ordinal() == a) {

				valorMonedaA = index.getValor();
			}
			if(index.ordinal() == de) {
				valorMonedaDe = index.getValor();
			}
		}
		if (de != 0 && a != 0) {
			return convertirDePesos(valorMonedaA, convertirAPesos(valorMonedaDe, valorObtenido).toString()).toString();
		}
		
		
		if (de == 0) {
			return convertirDePesos(valorMonedaA, valorObtenido).toString();
		}
		if (a == 0) {
			return convertirAPesos(valorMonedaDe, valorObtenido).toString();
		}
		return "Algo Salio Mal ...";
	}
	
	private BigDecimal convertirDePesos(String valorMoneda, String valor) {
		return new BigDecimal(valor).divide(new BigDecimal(valorMoneda), 2, RoundingMode.HALF_EVEN);
	}
	private BigDecimal convertirAPesos(String valorMoneda, String valor) {
		return new BigDecimal(valor).multiply(new BigDecimal(valorMoneda));
	}


	@Override
	public String setResultado() {
		{
			int numA = 99, numDe = 99;
			String monedaA = "";
			for (EnumMonedas array: EnumMonedas.values()) {
				if (listaEnumA.getSelectedIndex() == array.ordinal()) {
					numA = listaEnumA.getSelectedIndex();
					monedaA = array.getCodigo();
				}
				if (listaEnumDe.getSelectedIndex() == array.ordinal()) {
					numDe = listaEnumDe.getSelectedIndex();
				}
			}
			return conversion(numDe, numA, valor.getText()) + " "  + monedaA;
		}
		
	}
}
	
