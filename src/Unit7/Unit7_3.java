package Unit7;
/*
super关键字的使用
用于访问被隐藏的父类方法或者被覆盖的父类方法
使用注意
1.不能用在静态方法
2.super.方法名 用父类的方法
3.super.变量名 用父类的隐藏变量
 */

    class Father{
        int highspeed =20;
    }
     class  Son  extends Father{
        int highspeed = 100;//因为子类中的变量名字与父类是相同的，所以在继承后父类的变量被隐藏
         int big = super.highspeed;//super关键字在子类中进行使用
    }

public class Unit7_3 {
        public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println(son1.highspeed);
            System.out.println(son1.big);
    }
}