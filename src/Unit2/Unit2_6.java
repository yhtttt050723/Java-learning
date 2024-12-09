/*
2.6强制类型转换
（强制转换类型）数值
 */
package Unit2;
import java.util.Scanner;
public class Unit2_6 {
    static Scanner input = new Scanner(System.in); // 加入static使得所有类都可以用 input 和 phi
    //定义常数值圆周率;
    static final float phi = 3.141596f;
    public static void main (String[] arges){
        float radius = input.nextFloat();
        System.out.println("圆的周长是："+(int)(2*phi*radius));
        System.out.println("圆的面积是:"+(int)(phi*phi*radius));


    }
}
