package Unit4;

import java.util.Scanner;

/*
4.3 this 的使用
1. 用this 在实例方法 和 构造方法中 引用成员
如果类的实例方法需要引用本类的实例成员 ， 可以在实例成员的前面加 this 指向实例成员所属的当前对象
this.变量名 : 引用本对象的实例成员
this.方法名 ：引用本对象的实例方法

 */
public class Unit4_6 {
    static Scanner input = new Scanner(System.in);
    static class Circle {
        double radius;// 成员变量

        void setRadius(double radius) {//radius 形式参数
            this.radius = radius; // 当成员变量与形式参数同名时 , 就必须用radius 解决重名冲突问题
        }

        private double computeArea() {
            return Math.PI * radius * radius;
        }

        private double computeS() {
            return Math.PI * radius * 2;
        }

        double geiArea() {
            return this.computeArea();
        }
    }
        public static void main (String[] args){
            float radius = input.nextFloat();
            Circle circle = new Circle();
            circle.setRadius(radius);
            System.out.println("圆的周长是："+circle.computeS());
            System.out.println("圆的面积是:"+circle.geiArea());
            System.out.println(circle.computeArea());
        }
}
