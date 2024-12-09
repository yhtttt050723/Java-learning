/*
2.2
控制台输入输出：
例如：
Scanner input = new Scanner(System.in)
int a = input.nextInt();
其中 对next进行说明：
next + 类型 为输入什么类型的值
next 为读取一个字符串  直到遇到分隔符结束
nextLine 为读取一行字符 ， 直到遇到行结束符结束
nextBoolean 读取布尔值 ， true or false
 */
package Unit2;
import java.util.Scanner;
public class Unit2_2 {
    static Scanner input = new Scanner(System.in); // 加入static使得所有类都可以用 input 和 phi
    //定义常数值圆周率;
    static final float phi = 3.141596f;
    public static void main (String[] arges){
        float radius = input.nextFloat();
        System.out.println("圆的周长是："+2*phi*radius);
        System.out.println("圆的面积是:"+phi*phi*radius);


    }
}
