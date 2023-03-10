
public enum EnumLongitud {
	METROS("1.0"),CENTIMETROS("100.0"),MILIMETROS("1000.0"),
	KILOMETROS("0.001"),YARDAS("1.094"),PULGADAS("39.37"),
	MILLAS("0.000621371");

	private String valorConversion;
	
	
	private EnumLongitud(String valor) {
		this.valorConversion = valor;
	}
	
	public String getValorA() {
		return this.valorConversion;
	}


}
