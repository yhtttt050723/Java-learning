/*
语句块概念：
由{}中间的语句
class main{
    int i;
    {
    int j;
    }
}
j 只在语句块之内可见，i 在整个main 方法中可见

循环：
while
do while
for
条件控制：
if
switch.
 */
package Unit3;
import java.util.Scanner;
//三个数从小到大排列
public class Unit3_1 {
    public static void main(String[] arges){
        float a , b , c , t ;
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        if (a > b){
            t = a ;
            a = b ;
            b = t ;
        }// 现在  b > a ;
         if (a > c){
            System.out.println("三个数由小到大" + c + "<" + a + "<" +b );
        } else if (c > b) {
             System.out.println("三个数由小到大" + a + "<" + b + "<" +c );
         }
         else {
             System.out.println("三个数由小到大" + a + "<" + c + "<" +b );
         }

    }
}
