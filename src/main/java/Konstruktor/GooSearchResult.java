package Konstruktor;

import java.util.Locale;

public class GooSearchResult {
    private final String url;
    public String getUrl(){
        return url;
    }
    public GooSearchResult(String url){
        this.url=url;
    }
   public String parseDomain(){

        String normUrl= url.toLowerCase();
        if (normUrl.startsWith("http://"))
        {
            normUrl=normUrl.substring(7);
        }
        else if (normUrl.startsWith("https://"))
        {
            normUrl=normUrl.substring(8);
        }
        int domEndIndex = normUrl.indexOf("/");
        if (domEndIndex != -1)
        {
            return normUrl = normUrl.substring(0,domEndIndex);
        }
        else return normUrl;
   }
}
