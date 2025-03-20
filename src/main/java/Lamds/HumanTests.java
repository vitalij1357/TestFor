package Lamds;

import java.util.List;
import java.util.stream.Collectors;

public class HumanTests {
    public static void main(String[] args) {
//        Human jon = new Human("Jon", 1000);
//        Human karl = new Human("Karl", 2000);
//        Human sam = new Human("Sam", 1500);
//        Stream<Human> Humans = Stream.of(jon, karl, sam);
//        double avg = Humans
//                .map(human -> human.getSalary())
//                .mapToLong(it -> it)
//                .average()
//                .getAsDouble();
//        System.out.println(avg);
        HumanGenerators generators = new HumanGenerators();

        List<Human> HighSalary = generators
                .generator(100)
                .stream()
                .filter(human -> human.getSalary() > 1000)
                .peek(human -> {System.out.println(human);})
                .collect(Collectors.toList());
    }
}
