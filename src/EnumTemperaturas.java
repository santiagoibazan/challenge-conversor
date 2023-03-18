import java.math.BigDecimal;

public enum EnumTemperaturas {
	CELCIUS(new BigDecimal("1.0"), "C°"),FARENHEIT(new BigDecimal("33.8"), "F°"),KELVIN(new BigDecimal("274.15"), "K°");
	
	private BigDecimal valor;
	private String letra;
	
	private EnumTemperaturas(BigDecimal valor, String letra){
		this.valor = valor;
		this.letra = letra;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public String getLetra() {
		return this.letra;
	}
}
