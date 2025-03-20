package Lamds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class HumanGenerators {
    public Collection<Human> generator(int count){
        Random random = new Random();
        List<String> firstNames = List.of("Igor", "Bill", "Ivan", "Sam");
        List<String> lastNames = List.of("Gaits", "Tischenko", "Kondratjuk", "Horodnij");
        Collection<Human> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String firstName = firstNames.get(random.nextInt(firstNames.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));
           String fulName = firstName +" "+ lastName;
           int salary = 500 + random.nextInt(1001);
           Human human = new Human(fulName,salary);
           result.add(human);
        }
        return result;
        }
    }
