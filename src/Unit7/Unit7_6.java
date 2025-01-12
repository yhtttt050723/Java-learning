package Unit7;
/*
动态绑定机制
左父右子,左边父类的类数值输入到子类,执行子类方法
特点
可以使用父类中的隐藏成员变量,但是子类多的属性和方法是使用不了的
可以代替子类的对象调用子类中重写的实例方法
可以调用子类继承的父类成员变量
 */
class F_Demo{
    int i = 5;
    void method(){
        System.out.println("none of fdome");
    }
    static void method(int i){
        System.out.println("One of fdome"+i);
    }
}
class S_Demo extends F_Demo{
    int i = 15;
    String str = "hello";
    void method(){
        System.out.println("none of sdome");
    }
    static void method(int i){
        System.out.println("one of sdome"+i);
    }
}
public class Unit7_6 {
    public static void main(String[] args) {
        S_Demo sdome = new S_Demo();
        sdome.method();
        F_Demo ndome = new S_Demo();
        ndome.method(sdome.i);
        ndome.method(ndome.i);
    }
}
