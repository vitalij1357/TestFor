package HW11;

import java.util.List;
import java.util.stream.Collectors;

public class Step2 {
    public static void main(String[] args) {
        List<String> Names2 = List.of("Erik", "Eva", "Mila", "Ira", "Dasha");
        List<String> collect = Names2.stream()
                .map(s -> s.toUpperCase())
                .sorted((s1,s2) -> s2.compareTo(s1))
                .peek(System.out::println)
                .collect(Collectors.toList());


    }
}
