import java.math.BigDecimal;

/*        Scanner sc = new Scanner(System.in);
BigDecimal farenheit = new BigDecimal("32");
BigDecimal celcius = new BigDecimal(sc.nextLine()); 
BigDecimal nueve = new BigDecimal("9");
BigDecimal cinco = new BigDecimal("5");
celcius = celcius.multiply(nueve);
celcius = celcius.divide(cinco, 3, RoundingMode.UP);   

System.out.println(farenheit.add(celcius));
System.out.println();
*/


public enum EnumTemperaturas {
	CELCIUS(new BigDecimal("1.0")),FARENHEIT(new BigDecimal("32.0")),KELVIN(new BigDecimal("1000.0"));
	
	private BigDecimal valor;
	
	private EnumTemperaturas(BigDecimal valor){
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
}
