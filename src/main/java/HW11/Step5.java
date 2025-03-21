package HW11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step5 {
    public <T> Collection<T> zip (Stream<T> streamA, Stream<T> streamB){
        Iterator<T> iteratorA = streamA.iterator();
        Iterator<T> iteratorB = streamB.iterator();

        List<T> result = Stream.iterate(0, i -> iteratorA.hasNext() && iteratorB.hasNext(), i -> i + 1)
                .flatMap(i -> Stream.of(iteratorA.next(), iteratorB.next()))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
        return result;
    }
}
