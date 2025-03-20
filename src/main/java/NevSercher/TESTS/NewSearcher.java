package NevSercher.TESTS;

import NevSercher.Scanner.ScanFile;
import NevSercher.Scanner.ScanFileIn;
import NevSercher.Searching.SearchIn;
import NevSercher.Searching.SearchingUtil;
import NevSercher.readFiles.readFiles;
import NevSercher.readFiles.readFilesIn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NewSearcher {
    public void ScanAndPrint(File input, String content){
        Collection<File> result = SEARCH(input,content);
        if (result.isEmpty()){
            System.out.println("No word to search");
        }else {
            for (File FoundWord : result) {
                try {
                    System.out.println("found " + result.size() + " words in directory " + FoundWord.getCanonicalPath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    private Collection<File> SEARCH (File input, String content){
        List<File> result = new ArrayList<>();

        ScanFileIn scanFileIn = new ScanFile();
        readFilesIn readFiles = new readFiles();
        SearchIn searchIn = new SearchingUtil();

        Collection<File> files = scanFileIn.scan(input);
        for (File scaner : files) {
            String Con = readFiles.read(scaner);
            if (searchIn.search(Con,content)){
                result.add(scaner);
            }
        }
        return result;
    }
}
