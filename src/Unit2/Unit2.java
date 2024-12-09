/*
E8:
A1:
(x+y)/(x-y)+phi/(x+y)*(2+a)
A2:
Math.pow(x,3) + (c + d)/(a*b) != y + 1/(2*a)
EX9:
b
c
-2
 */
package Unit2;
public class Unit2 {
    public static void main (String[] arges){
        int a = 1;
        double d = 1.0;
        a = 46/9;
        System.out.println(a);//5
        int b = 1;
        b = -46 % 9 + 4 * 4 - 2;//16 - 3 == 13
        System.out.println(b);
        int c =1;
        c = 45 + 43 % 5 * (23 * 3 % -2); //45+43%5*23 = 69 +45 = 114错误原因：括号内也为从左至右  结果为48
        System.out.println(c);
        int d1 = 1;
        d1 %= 3 / d +3;//1
        System.out.println(d1);
        System.out.println(d*d + 4 + 4);
        int a1 = 1 ;
        d += 1.5*3 + (++a1); // 4.5 + 2  = 6.5 6.5 +1.0 = 7.5 d = 7.5 a = 2
        System.out.println(d);
        System.out.println(a1);
        double d2 = 1.0;
        int a2 = 1;
        d2 -= 1.5 * 3 + a2++; //4.5 + 1 = 5.5 d = 1 - 5.5 = -4.5 a =2
        System.out.println(d2);
        System.out.println(a2);
        char x ='a';
        char y ='c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
    }
}
