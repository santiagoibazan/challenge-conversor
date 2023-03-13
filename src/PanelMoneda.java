import java.math.BigDecimal;

public class PanelMoneda extends PanelConversor{

	private static final long serialVersionUID = 1L;	
	
	public PanelMoneda() {
		super("Monedas", EnumMonedas.values());
		setVisible(true);
	}
	

	@Override
	public String conversion(int de, int a, String valor) {
		
		return convertirDePesos().toString();
	}
	
	private BigDecimal convertirDePesos() {
		return new BigDecimal("1").multiply(new BigDecimal(valor.getText()));
	}
	private BigDecimal convertirAPesos() {
		return new BigDecimal(valor.getText()).divide(new BigDecimal("2"));
	}


	@Override
	public String setResultado() {
		{
			int numA = 99, numDe = 99;
			for (EnumMonedas array: EnumMonedas.values()) {
				if (listaEnumA.getSelectedIndex() == array.ordinal()) {
					numA = listaEnumA.getSelectedIndex();
				}
				if (listaEnumDe.getSelectedIndex() == array.ordinal()) {
					numDe = listaEnumDe.getSelectedIndex();
				}
			}
			return conversion(numDe, numA, valor.getText());
		}
		
	}
}
	
