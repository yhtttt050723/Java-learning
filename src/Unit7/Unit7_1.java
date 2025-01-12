package Unit7;
/*
继承：继承可以让子类拥有父类的非私有属性和非私有方法

 */
//成员变量的隐藏

public class Unit7_1 {
    static class Father{
        int highspeed =100;
    }
    static class Son extends Father{
        int highspeed = 100;//因为子类中的变量名字与父类是相同的，所以在继承后父类的变量被隐藏
    }
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println(son1.highspeed);
    }
}
