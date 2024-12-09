package Unit3;

import java.util.Scanner;

//求两个正整数的最大公约数
public class Unit3_7 {
    public static void main(String[] arges){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int n1 = input.nextInt();
        System.out.println("请输入第二个数字");
        int n2 = input.nextInt();
        int gcd = 1 ;
        int n ;
        if (n1 > 0 && n2 >0){
            if (n1 > n2){
                n = n2;
            }
            else n = n1;
            while(n >= 1){
                if (n1 % n == 0 && n2 % n ==0){
                    gcd = n;
                    break;
                }
                n--;
            }
            System.out.println("两个数字的最大公约数为："+gcd);
        }
        else {
            System.out.println("请输入两个大于零的数字");
        }
    }
}
