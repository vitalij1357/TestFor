package NevSercher.Scanner;

import java.io.File;
import java.util.Collection;

public interface ScanFileIn {
    Collection<File> scan(File base);
}
