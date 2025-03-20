package HW10.Step1;

import java.io.*;
import java.util.regex.Pattern;

public class Skiper {
    public static void main(String[] args) throws IOException {
        File file = new File("rootFiles/Contacts.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bfis = new BufferedReader(isr);
        String regex = "^(?:\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        String line;
        while((line=bfis.readLine()) != null){
         if (pattern.matcher(line).matches()) {
                System.out.println(line);
            }
        }
    }
}
