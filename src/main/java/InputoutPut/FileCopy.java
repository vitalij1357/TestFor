package InputoutPut;

import java.io.*;

public class FileCopy {
    private final File from;
    private final File to;
    public FileCopy(String from,String to){
        this(new File(from),new File(to));
    }
    public FileCopy(File from,File to){

        this.from = from;
        this.to = to;
    }
    public void copy() throws IOException {

        new CopyPast(new FileInputStream(from), new FileOutputStream(to)).copy();
    }
}
