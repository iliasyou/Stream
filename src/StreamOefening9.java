import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOefening9 {
    public static void main(String[] args) {
        List<String> Cities = new ArrayList<>();
        Cities.add(0, "Brussel");
        Cities.add(1, "Antwerpen");
        Cities.add(2, "Gent");
        Cities.add(3, "Limburg");
        System.out.println("Steden uit België");
        String prefix = "<";
        String suffix = ">";
        List<String> result = IntStream.range(0, Cities.size())
                .filter(i -> Cities.get(i).length() > 4)
                .mapToObj(i -> String.format("%d-%s", i + 1,
                        new StringBuilder(Cities.get(i)).reverse().toString().substring(0, 7)))
                .collect(Collectors.toList());
        String formattedResult = String.format("%s%s%s", prefix, String.join(",", result), suffix).toUpperCase();
        System.out.println(formattedResult);
    }
}


//Schrijf een methode die een lijst van Strings als parameter verwacht
// en een lijst van Strings teruggeeft waarbij alle Strings die beginnen met een ‘a’ zijn
// en de lengte van de String groter is dan 3. de String.
//De Strings moeten ook in omgekeerde volgorde zijn
// en de Strings moeten worden samengevoegd tot een String met een komma als scheidingsteken.
// De String moet ook in hoofdletter zijn. De String moet ook worden afgekort tot 10 karakters.
// De String moet ook worden voorzien van een prefix en een suffix.
// De String moet ook worden voorzien van een uniek nummer.
//public String filterA(List strings) { return null; }

