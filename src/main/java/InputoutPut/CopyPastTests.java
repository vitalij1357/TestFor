package InputoutPut;

import java.io.*;

public class CopyPastTests {
   public static void main(String[] args) throws IOException {
//        FileInputStream from = new FileInputStream("data.txt");
//        FileOutputStream to = new FileOutputStream("data.target.txt");
//         new CopyPast(from,to).copy();
       new FileCopy("dat.txt","data.target.txt");
    }
}
