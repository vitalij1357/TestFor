package HW10.Step3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class READ {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("rootFiles/testFile");
        List<String> arrey = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
           String[] pharse= scanner.nextLine().toString().split(" ");
            for (String pharses : pharse) {
                arrey.add(pharses);
            }
        }
        System.out.println(arrey);
        Map<String,Integer> ValueFrequency = new HashMap<>();
        for (String word : arrey) {
            ValueFrequency.put(word,Collections.frequency(arrey,word));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : ValueFrequency.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());

        }
    }
}
