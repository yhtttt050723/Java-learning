package Unit3;
import java.util.Scanner;
/*
 从 键盘 输入 若干数；
当这组数平方和 大于 某个数；
输出数据个数 与 平方和
*/
public class Unit3_4 {
    public static void main(String[] arges){
        double s = 0 , x;
        int i = 0;
        Scanner input = new Scanner(System.in);
        do{
            x = input.nextDouble();
            i = i+1;
            s = s + Math.pow(x,2);
        }while (x != 0 && s <= 1.0e3);
        System.out.println("输入数据个数为：" + i);
        System.out.println("平方和为：" + s);

    }
}
