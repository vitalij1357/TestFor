package Konstruktor;

public class PunctuationMarkCounter {
    public int count(String phrase)
    {
        String ch = ".,!:;";
        int count =0;
        for (char pharses : phrase.toCharArray()) {

if(ch.indexOf(pharses)!=-1)
{
    count++;
}
        }
        return count;
    }
}
