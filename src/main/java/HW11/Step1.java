package HW11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Step1 {
    public Collection<String> parse(String[] names){
        List<String> Names = new ArrayList<>();
        for (String name : names) {
            Names.add(name);
        }
        Names.stream()
                .filter(name->Names.indexOf(name) % 2 != 0)
                .peek(System.out::println)
                .collect(Collectors.toList());
        return Names;
    }
}
