package HW11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Step2 {
    public Collection<String> FilterNames(String[] names){
        List<String> nameCollection = List.of(names);

        List<String> collect = nameCollection.stream()
                .map(s -> s.toUpperCase())
                .sorted((s1,s2) -> s2.compareTo(s1))
                .peek(System.out::println)
                .collect(Collectors.toList());
        return collect;
    }
}
