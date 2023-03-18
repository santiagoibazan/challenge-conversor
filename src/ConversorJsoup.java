
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ConversorJsoup {
	  public static void main(String[] args) {
		  String[] valoresMonedas = new String[EnumMonedas.values().length];
		    Document doc = null;
		    for	(EnumMonedas d: EnumMonedas.values()) {
		    	if (d.ordinal() == 0 ) {
		    		valoresMonedas[d.ordinal()] = "1.0";
		    		continue;
		    	}
		    	try {
					doc = Jsoup.connect("https://www.google.com/finance/quote/" + d.getCodigo() + "-ARS").get();
					Elements elements = doc.select("div[class=YMlKec fxKbKc]");
					Element element = elements.get(0);
					String result = element.text();
					valoresMonedas[d.ordinal()] = result;
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
			for (String a: valoresMonedas) {
				System.out.println(a);
			}
		  
		  }
}
