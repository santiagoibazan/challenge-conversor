import java.math.BigDecimal;
import java.math.RoundingMode;

public class PanelTemperatura extends PanelConversor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelTemperatura() {
		super("Temperatura", EnumTemperaturas.values());
		setVisible(true);
	}
	
	public String conversion(int de, int a, String valor) {
		BigDecimal valorAux = new BigDecimal(valor);
		BigDecimal aux;
		
		if (de == 0 && a == de) {
			return valor;
		} else if (de == 0 && a == 1) {
			return valorAux.multiply(new BigDecimal("9")).divide(new BigDecimal("5")).add(new BigDecimal("32")).toString();
		} else if(de == 0 && a == 2) {
			return valorAux.add(new BigDecimal("273.15")).toString();
		} 
		
		if (de == 1 && a == de) {
			return valor;
		} else if (de == 1) {
			valorAux = valorAux.subtract(new BigDecimal("32"));
			aux = new BigDecimal("5").divide(new BigDecimal("9"), 3, RoundingMode.UP);
			valorAux = valorAux.multiply(aux);
			if (a == 0) {
				return valorAux.toString();
			}
			if (a == 2) {
				return valorAux.add(new BigDecimal("273.15")).toString();
			}
		}
			
		if (de == 2 && a == de) {
			return valor;
		} else if (de == 2) {
			valorAux = valorAux.subtract(new BigDecimal("273.15"));
			if (a == 0) {
				return valorAux.toString();
			}
			if (a == 1) {
				return valorAux.multiply(new BigDecimal("9")).divide(new BigDecimal("5")).add(new BigDecimal("32")).toString();
			}
		}
		return "Algo salio mal xD";
	}
	

}
