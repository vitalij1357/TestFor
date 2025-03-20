package HW11;

import java.util.stream.Stream;

public class HW11Tests {
    public static void main(String[] args) {
        HW11.Step1 step1 = new HW11.Step1();
        HW11.Step2 step2 = new HW11.Step2();
        HW11.Step3 step3 = new HW11.Step3();
        HW11.Step4 step4 = new HW11.Step4();
        HW11.Step5 step5 = new HW11.Step5();
        String[] n = {"Ivan","Nina","Peter","Maxim","Katja","Misha"};
        step1.parse(n);
        step2.FilterNames(n);
        String[] numbers = {"1, 2, 0","4, 5"};
        step3.getNumbers(numbers);
        step4.Generator();
        Stream<String> streamA = Stream.of("Ire","Vanja","Nastja");
        Stream<String> streamB = Stream.of("1","2","3","4");
        step5.zip(streamA, streamB);
    }
}
