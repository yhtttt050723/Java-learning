package Unit3;

import java.util.Scanner;
// 输出九九乘法表，本程序大部分内容在于输出时的格式控制;
/*
print 输出内容不加换行符号
println 输出内容加换行符号
printf 格式化输出内容 类似C语言printf
 */
public class Unit3_8 {
    public static void main(String[] arges){
        int i , j , n ;
        Scanner input =new Scanner(System.in);
        System.out.println("输入N值：");
        n = input.nextInt();
        System.out.println("                九九乘法表");
        i = 1 ;
        System.out.println(" ");
        while ( i <= n){
            System.out.printf(" %6d",i);
            i++;
        }
        System.out.println();
        i = 1 ;
        while (i <= n){
            System.out.print("----------");
            i++;
        }
        System.out.println();
        i = 1;
        while(i <= n){
            System.out.printf(" %2d",i);
            System.out.print("|");
            j = 1;
            while(j <= n){
                System.out.printf(" %6d", i *j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
