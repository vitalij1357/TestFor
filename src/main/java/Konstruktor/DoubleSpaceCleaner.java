package Konstruktor;

import java.util.ArrayList;
import java.util.List;

public class DoubleSpaceCleaner {
    public String clean(String phrase){
        phrase=phrase.trim();
        phrase=phrase.replaceAll("\\s+"," ");
        return phrase;
    }
}




