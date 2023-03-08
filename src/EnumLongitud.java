
public enum EnumLongitud {
	METROS("Longitud","1.0","1.0"),CENTIMETROS("Longitud","100.0","0.01"),MILIMETROS("Longitud","1000.0","0.001"),
	KILOMETROS("Longitud","0.001","1000"),YARDAS("Longitud","1.094","0.9144"),PULGADAS("Longitud","39.37","0.0254"),
	MILLAS("Longitud","0.000621371","1609.34");

	private String tipo;
	private String valorConversionA;
	private String valorConversionDe;
	
	
	private EnumLongitud(String tipo,String valorA, String valorDe) {
		this.tipo = tipo;
		this.valorConversionA = valorA;
		this.valorConversionDe = valorDe;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public String getValorA() {
		return this.valorConversionA;
	}
	public String getValorDe(){
		return this.valorConversionDe;
	}

}
