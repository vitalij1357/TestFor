package HW11;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step4 {
    private Stream<Long> formula(long Seed,long a, long c,long m){

        return Stream.iterate(Seed,x-> (a * x +c) % m);
    }

    public Collection<Long> Generator(){
         long a = 25214903917L;
         long m = (1L << 48);
         long c = 11L;

        long seed = 11L;
        List<Long> collect = formula(seed, a, c, m)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
        return collect;
    }
}
