package HW11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step5 {
    public <T> Collection<T> zip (Stream<T> streamA, Stream<T> streamB){
        List<T> result = new ArrayList<>();
        Iterator<T> iteratorA = streamA.iterator();
        Iterator<T> iteratorB = streamB.iterator();

        while (iteratorA.hasNext()&& iteratorB.hasNext()){

            result.add(iteratorA.next());
            result.add(iteratorB.next());
        }
        return result.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
