import java.math.BigDecimal;
import java.math.RoundingMode;

public class Monedas {
	private String nombre;
	private BigDecimal valor;
	
	public Monedas(String nombre, BigDecimal valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public BigDecimal conversionA(BigDecimal a) {
		return a.multiply(this.getValor());
	}
	
	public BigDecimal conversionDe(BigDecimal a) {
		return a.divide(this.getValor(), 3, RoundingMode.UP);
	}
}
