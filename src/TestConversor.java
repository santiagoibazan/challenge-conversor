import java.math.BigDecimal;

public class TestConversor {
	public static void main(String[] args) {
		Monedas peso = new Monedas("Peso argentino", new BigDecimal("1.0"));
		
		
		BigDecimal conversion = new BigDecimal("420.53");
		System.out.println(peso.conversionA(conversion));
		System.out.println(peso.conversionDe(conversion));
	}

}
