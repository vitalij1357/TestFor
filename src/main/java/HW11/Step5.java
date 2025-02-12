package HW11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step5 {
    public static <T> Stream<T> zip (Stream<T> streamA,Stream<T> streamB){
        List<T> result = new ArrayList<>();
        Iterator<T> iteratorA = streamA.iterator();
        Iterator<T> iteratorB = streamB.iterator();

        while (iteratorA.hasNext()&& iteratorB.hasNext()){

            result.add(iteratorA.next());
            result.add(iteratorB.next());
        }
        return result.stream();
    }

    public static void main(String[] args) {
        Stream<String> StreamA = Stream.of("Igor", "Maja", "Dasha");
        Stream<String> StreamB = Stream.of("1", "2", "3", "4");

        Stream<String> result = zip(StreamA, StreamB);
        result.peek(System.out::println).collect(Collectors.toList());
    }
}
