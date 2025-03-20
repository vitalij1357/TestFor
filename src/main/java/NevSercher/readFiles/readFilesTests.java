package NevSercher.readFiles;

import java.io.File;
import java.util.Scanner;

public class readFilesTests {
    public static void main(String[] args) {
        readFilesIn readFilesIn = new readFiles();
        System.out.println(readFilesIn.read(new File("rootFiles/testFile")));
    }
}
