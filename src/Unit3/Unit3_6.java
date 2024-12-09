package Unit3;
//一元二次方程求根
import java.util.Scanner;

public class Unit3_6 {
    public static void main(String[] arges){
        double a , b ,c , x1 , x2;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入 a ,b ,c 的值") ;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double phi = Math.pow(b , 2) - 4 * a *c;
        if (a == 0){
            if (b == 0){
                System.out.println("不是一个二元一次方程");
            }
            else {
                x2 = -c / b ;
                x1 = x2 ;
                System.out.println("式子为一元一次方程，解为"+x1);
            }
        }
        else {
            if (phi > 0){
                x1 = (-b + Math.pow(phi,1/2))/2/a;
                x2 = (-b - Math.pow(phi,1/2))/2/a;
                System.out.println("该方程有两个根一个为:"+x1+"另一个是："+x2);
            } else if (phi == 0) {
                x2 =-b / 2 / a;
                x1 = x2 ;
                System.out.println("该式子有两个相同的跟为："+x1+","+x2);
            }
            else {
                System.out.println("判别式phi<0,该式子无根");
            }
        }
    }
}
