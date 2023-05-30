import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream8_1 {
    public static void main(String[] args) {
        List<String> Cities = new ArrayList<>();
        Cities.add(0, "Brussel");
        Cities.add(1, "Antwerpen");
        Cities.add(2, "Gent");
        Cities.add(3, "Limburg");
        System.out.println("Cities from belgium");
        String result = Cities.stream()
                .filter(c -> c.length() > 3)
                .sorted(Comparator.reverseOrder()).map(String::toUpperCase)
                .map(c -> c.substring(0, Math.min(c.length(), 10)))
                .map(c->"prefix"+c+"suffix")
                .collect(Collectors.joining(","));



        System.out.println(result);


    }

}
//Schrijf een methode die een lijst van Strings als parameter verwacht
// en een lijst van Strings teruggeeft waarbij alle Strings die beginnen met een ‘a’zijn
// en de lengte van de String groter is dan 3. de String.
//De Strings moeten ook in omgekeerde volgorde zijn
// en de Strings moeten worden samengevoegd tot een String met een komma als scheidingsteken.
// De String moet ook in hoofdletter zijn.
// De String moet ook worden afgekort tot 10 karakters.
// De String moet ook worden voorzien van een prefix en een suffix.
//public String filterA(List strings) { return null; }

