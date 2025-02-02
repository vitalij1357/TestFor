package HW10.Step1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Skiper2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("rootFiles/Contacts.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line= br.readLine())!= null){
            if (validNumber(line)){
                System.out.println(line);
            }
        }
        }
        public static boolean validNumber(String line){
            line = line.trim();
            if (line.startsWith("(")&& line.length()== 14){
                return line.charAt(4) == ')' && line.charAt(5) == ' ' &&
                        line.charAt(9) == '-';
            }
            if (line.length()==12){
              return   line.charAt(3) == '-'&& line.charAt(7) == '-';
            }
            return false;
        }
    }
