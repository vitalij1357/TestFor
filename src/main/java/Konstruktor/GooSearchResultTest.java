package Konstruktor;

import java.util.*;

public class GooSearchResultTest {
    public static void main(String[] args) {
//        GooSearchResult test = new GooSearchResult("http://test.com/com");
//        System.out.println(test.parseDomain());
//        PunctuationMarkCounter test1 = new PunctuationMarkCounter();
//        System.out.println(test1.count("Hello,World!"));
//        DoubleSpaceCleaner test2 = new DoubleSpaceCleaner();
//        System.out.println(test2.clean("          Hello       World    "));
      Set<String> text = new HashSet<>();
      String name = "Igor Komensky\nNastja Ignatova\nNastja Maruf";
      String[] fulName=name.split("\n");
         for (String fulNames : fulName) {
            String[] namesPart = fulNames.split(" ");
            String firstName = namesPart[0];
             text.add(firstName);
       }
        System.out.println(text);
        Name name1 = new Name();
        System.out.println(name1.makeFullName("Filip", "Karel"));
        System.out.println(name1.isNameLucky("Lola"));
        System.out.println(name1.getNameCode("Luky"));
        System.out.println(name1.isMoneyName("7Igor5"));
        System.out.println(name1.makeNamePositive("NOare"));
        System.out.println(name1.makeNameClean("  Father"));
        System.out.println(name1.makeHalfOfName("Barakuda"));
    }
    }
    class Name {
        public String makeFullName(String firstName, String lastName) {
            firstName = firstName.toLowerCase();
            lastName = lastName.toUpperCase();
            return String.join(" ", firstName, lastName);

        }

        public boolean isNameLucky(String name) {
            if (name.contains("A") || name.contains("a") || name.contains("O") || name.contains("o")) {
                return true;
            } else return false;
        }

        public String getNameCode(String name) {
            if (name.length() == 1) {
                // Повертаємо ім'я у верхньому регістрі
                return name.toUpperCase();
            }
            char firstChar = Character.toUpperCase(name.charAt(0));
            char lastChar = Character.toUpperCase(name.charAt(name.length() - 1));
            return String.valueOf(firstChar) + lastChar;

        }

        public boolean isMoneyName(String name) {
            boolean firstChar = Character.isDigit(name.charAt(0));
            boolean andChar = Character.isDigit(name.charAt(name.length()-1));
            if (firstChar&&andChar)
            {
                return true;
            }
            else return false;
        }
        public String makeNamePositive(String name){
            String normalName = name.replaceAll("(?i)no","yes"); // (?i) - iгноруэ регiстр

                return normalName;
            }
        public String makeNameClean(String name){
            String maceClean = name.trim();
            return "CLEAN"+ maceClean+"CLEAN";
        }
        public String makeHalfOfName(String name){
            int halfName = name.length()/2;
            return name.substring(0,halfName);
        }
        }

