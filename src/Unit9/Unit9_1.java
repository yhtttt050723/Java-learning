package Unit9;
/*
异常类与异常处理
运行错误成为异常
两大异常类:Error类与Exception类

 */
import java.util.Scanner;
public class Unit9_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a/b);
    }
}
