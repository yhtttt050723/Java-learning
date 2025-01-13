package Unit10;
import java.io.*;
import java.util.*;
public class Unit10_6 {
    public static void main(String[] args) throws Exception {
        File file = new File(".\\score.txt");
        PrintWriter output = new PrintWriter(file);
        output.println("数学");
        output.close();
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String a;
            a = input.next();
            System.out.println(a);
        }
    }
}
