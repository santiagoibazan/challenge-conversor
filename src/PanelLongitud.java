import java.math.BigDecimal;
import java.math.RoundingMode;

public class PanelLongitud extends PanelConversor {

	private static final long serialVersionUID = 1L;

	public PanelLongitud() {
		super("Longitud", EnumLongitud.values());
		setVisible(true);
	}

	@Override
	public String conversion(int de, int a, String valor) {
		String valorLongA = "";
		String valorLongDe  = "";
		for (EnumLongitud index: EnumLongitud.values()) {
			if (index.ordinal() == a) {

				valorLongA = index.getValor();
			}
			if(index.ordinal() == de) {
				valorLongDe = index.getValor();
			}
		}
		if (de != 0 && a != 0) {
			return convertirDeMetro(valorLongA, convertirAMetro(valorLongDe, valor).toString()).toString();
		}
		
		
		if (de == 0) {
			return convertirDeMetro(valorLongA, valor).toString();
		}
		if (a == 0) {
			return convertirAMetro(valorLongDe, valor).toString();
		}
		return "Algo Salio Mal ...";
	}
	
	private BigDecimal convertirDeMetro(String valorLong, String valor) {
		return new BigDecimal(valorLong).multiply(new BigDecimal(valor));
	}
	
	private BigDecimal convertirAMetro(String valorLong, String valor) {
		return new BigDecimal(valor).divide(new BigDecimal(valorLong), 3, RoundingMode.UP);
	}

	@Override
	public String setResultado() {
		int numA = 99, numDe = 99;
		String nombre = "";
		for (EnumLongitud array: EnumLongitud.values()) {
			if (listaEnumA.getSelectedIndex() == array.ordinal()) {
				numA = listaEnumA.getSelectedIndex();
				nombre = array.name();
			}
			if (listaEnumDe.getSelectedIndex() == array.ordinal()) {
				numDe = listaEnumDe.getSelectedIndex();
			}
		}
		return conversion(numDe, numA, valor.getText()) + " " + nombre;
	}
		

}
