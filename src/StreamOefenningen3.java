import java.util.ArrayList;
import java.util.List;

public class StreamOefenningen3 {
    public static void main(String[] args) {
        List<String> Cities = new ArrayList<>();
        Cities.add(0, "Brussel");
        Cities.add(1, "Antwerpen");
        Cities.add(2, "Gent");
        Cities.add(3, "Limburg");
        System.out.println("Cities from belgium");
        Cities.stream()
                .filter((C) -> C.contains("A"))
                .filter(C -> C.length() > 3)
                .forEach(System.out::println);


    }


}


//Schrijf een methode die een lijst van Strings als parameter
// verwacht en een lijst van Strings teruggeeft waarbij alle Strings
// die beginnen met een ‘a’ zijn en de lengte van de String groter is dan 3.
//public List filterA(List strings) { return null; }
