package InputoutPut;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.LinkPermission;

public class CopyPast {
    private InputStream from;
    private OutputStream to;
    public CopyPast(InputStream from,OutputStream to){

        this.from = from;
        this.to = to;
    }
    public void copy() throws IOException {
        while (from.available()>0){
            to.write(from.read());
        }

    }
}
