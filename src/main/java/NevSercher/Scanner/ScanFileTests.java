package NevSercher.Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class ScanFileTests {
    public static void main(String[] args) throws IOException {
        ScanFileIn scanFileIn = new ScanFile();
        Collection<File> files = scanFileIn.scan(new File("./rootFiles"));
        for (File file : files) {
            System.out.println(file.getCanonicalPath());
        }
        }
    }

