import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        String[] words= {"hello","this","is",};
        // 1 - eerste voorbeeld
       // for(String w: words){
           // System.out.println(w);
        //}
        // 2 - voorbeeld
        // Stream.of(words).forEach(System.out::println);


        List<String> myPlaces = new ArrayList<>();
        myPlaces.add(0,"Katmandu");
        myPlaces.add(1,"Nepal");
        myPlaces.add(2,"belgie");
        myPlaces.add(3,"Usa");
        System.out.println("Places from Nepal");
       long count = myPlaces.stream()
               // .filter((p)-> p.contains("Usa"))
                .map((p)-> p.toUpperCase())
                .map((p)-> p.toLowerCase())
                .map((p)-> p.length()<5)
                .count();
                //.forEach((p)-> System.out.println(p));
        System.out.println(count);

    }
}
