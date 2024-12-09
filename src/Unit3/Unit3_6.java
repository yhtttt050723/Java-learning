package Unit3;

import java.util.Scanner;

public class Unit3_6 {
    public static void main(String[] arges){
        double a , b ,c , x1 , x2;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入 a ,b ,c 的值") ;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if (a == 0){
            if (b == 0){
                System.out.println("不是一个二元一次方程");
            }
        }
    }
}
