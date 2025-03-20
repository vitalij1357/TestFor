package tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TestsLogic {
     public Collection<String> nameGenerator(int count){
        Collection<String> result = new ArrayList<>();
        Random random = new Random();
        List<String> FirstNames = List.of("Igor", "Eva", "Maria");
        List<String> LastNames = List.of("Petrenko", "Vasilenko", "Marchenko");
        for (int i = 0; i < count; i++) {
            String FirstName = FirstNames.get(random.nextInt(FirstNames.size()));
            String LastName = LastNames.get(random.nextInt(LastNames.size()));
            String FulName = FirstName + " " + LastName;
            result.add(FulName);
        }
        return result;
    }
    public static void main(String[] args) {
        TestsLogic names = new TestsLogic();
        Collection<String> Name = names.nameGenerator(5);
        AtomicInteger order = new AtomicInteger(1);
        Name.stream()
                .map(n->order.getAndIncrement() + "."+ n)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
