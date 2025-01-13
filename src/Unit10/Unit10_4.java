package Unit10;
/*
DataInputStream
 */
import java.io.*;
public class Unit10_4 {
    public static void main(String[] args) throws IOException {
        DataOutputStream output;
        output = new DataOutputStream(new FileOutputStream(".\\filestream1.dat"));
        int i = 11111;
        output.writeInt(i);
        DataInput input = new DataInputStream(new FileInputStream(".\\filestream1.dat"));
        int ii = input.readInt();
        System.out.println(ii);
    }
}
