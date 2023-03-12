import java.math.BigDecimal;

public enum EnumTemperaturas {
	CELCIUS(new BigDecimal("1.0")),FARENHEIT(new BigDecimal("33.8")),KELVIN(new BigDecimal("274.15"));
	
	private BigDecimal valor;
	
	private EnumTemperaturas(BigDecimal valor){
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
}
