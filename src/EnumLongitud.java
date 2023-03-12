
public enum EnumLongitud {
	METROS("1"),CENTIMETROS("100"),MILIMETROS("1000"),KILOMETROS("0.001"),YARDAS("1.094"),PULGADAS("39.37"),MILLAS("0.000621371");

	private String valorConversion;
	
	
	private EnumLongitud(String valor) {
		this.valorConversion = valor;
	}
	
	public String getValor() {
		return this.valorConversion;
	}


}
