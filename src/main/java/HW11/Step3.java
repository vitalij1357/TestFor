package HW11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Step3 {
    public String getNumbers(String[] input) {
        List<Integer> collect = List.of(input)
                .stream()
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted((s1,s2)->s1-s2)
                .collect(Collectors.toList());
        return collect
                .stream()
                .map(String ::valueOf)
                .peek(System.out::println)
                .collect(Collectors.joining(", "));
    }
}
