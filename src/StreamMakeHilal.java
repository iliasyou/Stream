import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMakeHilal {

    // create stream using stream of
    public static void main(String[] args) {
        Stream<String> names= Stream.of("jai","Hemant");
        names.forEach(System.out::println);




        System.out.println("------");
        // Create stream using array of elements
        Stream<Integer> integerStream = Stream.of(new Integer[]{1,2,3,4,5});
        integerStream.forEach(System.out::println);





        List<String> namesList = Arrays.asList("Vishal","Naren");
        Stream<String> namesStream = namesList.stream();
        namesStream.forEach(System.out::println);
    }
}
