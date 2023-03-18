
public enum EnumMonedas {
	PESOS_ARGENTINOS("1.0", "ARS"),DOLAR("202.10", "USD"),REAL("38.47", "BRL"),LIBRA_ESTERLINA("245.55", "GBP"),EURO("216.90", "EUR"),YEN("1.50", "JPY"),WON("0.16", "KRW"),RUBLOS("2.67", "RUB");

	private String valor;
	private String codigo;
	
	private EnumMonedas(String valor, String codigo) {
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	public String getCodigo() {
		return this.codigo;
	}

}
