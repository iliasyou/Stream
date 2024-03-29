import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOefenning5 {
    public static void main(String[] args) {
        List<String> Cities = new ArrayList<>();
        Cities.add(0, "Brussel");
        Cities.add(1, "Antwerpen");
        Cities.add(2, "Gent");
        Cities.add(3, "Limburg");
        System.out.println("Cities from belgium");
        String result = Cities.stream()
                .filter(c -> c.length() > 3)
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(","));
        System.out.println(result);


    }
}






//Schrijf een methode die een lijst van Strings als parameter verwacht
// en een lijst van Strings teruggeeft waarbij alle Strings die beginnen met een ‘a’ zijn
// en de lengte van de String groter is dan 3.de String.
// De Strings moeten ook in omgekeerde volgorde zijn
// en de Strings moeten worden samengevoegd tot een String met een komma als scheidingsteken.
//public String filterA(List strings) { return null; }
