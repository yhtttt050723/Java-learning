package 实验课一.experiment3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class Unit10_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int PI = 100 + rand.nextInt(900);
        FileWriter fw = null;
        try {
            fw = new FileWriter(".\\filestream.txt",true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        char array[] = {'文','本','输','入','输','出','实','例'};
        for (int i = 0; i < array.length; i++) {
            try {
                fw.write(array[i]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            fw.write('\n');
            fw.write(array);
            fw.write('\n');
            fw.write("你好，欢迎使用Java编程\n");
            fw.write("PI="+PI);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
