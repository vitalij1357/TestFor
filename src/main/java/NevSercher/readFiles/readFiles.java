package NevSercher.readFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;

public class readFiles implements readFilesIn{
    @Override
    public String read(File fileToRead) {
        StringJoiner result = new StringJoiner("\n");
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()){
                result.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }
}
