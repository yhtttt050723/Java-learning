package Unit9;
import java.io.*;
public class Unit9_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一行文本");
        InputStreamReader  isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String inputline = null;
        inputline = br.readLine();
        System.out.println("你输入的文本是"+inputline);
    }
}
