package NevSercher.Scanner;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ScanFile implements ScanFileIn {
    @Override
    public Collection<File> scan(File base) {
        List<File> result = new ArrayList<>();
        recursive(base,result);
        return result;
    }
    private void recursive(File direct,Collection<File> storage){
        for (File child : direct.listFiles()) {
            if (child.isDirectory()){
                recursive(child,storage);
            }else {
                storage.add(child);
            }
        }
    }
}
