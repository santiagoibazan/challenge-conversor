
public enum EnumMonedas {
	PESOS_ARGENTINOS("1.0"),DOLAR("202.10"),REAL("38.47"),LIBRA_ESTERLINA("245.55"),EURO("216.90"),YEN("1.50"),WON("0.16"),RUBLOS("2.67");

	private String valor;
	
	private EnumMonedas(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}

}
