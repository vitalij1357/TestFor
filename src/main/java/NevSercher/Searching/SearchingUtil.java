package NevSercher.Searching;

public class SearchingUtil implements SearchIn{
    @Override
    public boolean search(String WhereYouSearch, String searchWord) {
        return WhereYouSearch.toLowerCase().contains(searchWord.toLowerCase());
    }
}
