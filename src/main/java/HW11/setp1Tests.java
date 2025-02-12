package HW11;

import java.util.List;
import java.util.stream.Collectors;

public class setp1Tests {
    public static void main(String[] args) {
        List<String> Names = List.of("Igor", "Ivan", "Marie", "Max", "Vasil", "Erik", "Diana");
        Names.stream()
                .filter(name->Names.indexOf(name) % 2 != 0)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
