package Unit10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Unit10_3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fr = new FileOutputStream(".\\filestream.txt");
        fr.write(11111);
        FileInputStream fis;
        fis = new FileInputStream(".\\filestream.txt");
        int value;
        while((value = fis.read()) != -1)
            System.out.println(value);
    }
}
