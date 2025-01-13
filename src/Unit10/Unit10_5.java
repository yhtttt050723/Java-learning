package Unit10;
import java.io.*;
public class Unit10_5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(".\\filestream54345.txt");
        fw.write("ajhkwdhguwaiudiiwa");
        fw.close();
        FileWriter aa = new FileWriter(".\\filestream54345.txt",true);
        aa.write("uyyyyyy");
        aa.close();
        FileReader fr = new FileReader(".\\filestream54345.txt");
        int value;
        while((value = fr.read()) != -1){
            System.out.print((char)value);
        }
    }
}
