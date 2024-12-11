package Unit10;
import java.io.*;
public class Unit10_1 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos;
        fos = new FileOutputStream(".\\filestream.txt");
        byte[] array = {25,33,89,27,127,-5};
        for (int i = 0; i < array.length;i++){
            fos.write(array[i]);}
            fos.write(255);
            fos.write(231);
            fos.close();

    }
}
