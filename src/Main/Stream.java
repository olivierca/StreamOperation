package Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Stream {
    private List<String> person = Arrays.asList("Jean", "Pierre", "Luc", "Moi", "Tony");

    public void toStream() {
        List<String> test = person.stream()
            // filtrage
            .filter(x -> x.contains("Je"))

            // mapping : reformatage des chaînes de caractères en majuscule
            .map( x -> x.substring(0,x.length()).toUpperCase())

            // collection (x) to list (test)
            .collect(Collectors.toList());

            // affiche le nombre d'éléments
            System.out.print(test.stream().count());
    }
}
