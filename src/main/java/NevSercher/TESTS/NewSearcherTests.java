package NevSercher.TESTS;

import java.io.File;

public class NewSearcherTests {
    public static void main(String[] args) {
        NewSearcher newSearcher= new NewSearcher();
        newSearcher.ScanAndPrint(new File("rootFiles"),"Java");
    }
}
