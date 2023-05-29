import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHilal {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Brussel");
            list.add("Antwerpen");
            list.add("Gent");
            list.add("Limburg");
            System.out.println(list.stream().map(
                    element -> element.toUpperCase())
                    .collect(Collectors.toList()));
            // collect is en paramter die je de naam geeft  op de zelfde lijn [brusssel, antwerpen, gent , limburg]


        }

    }

