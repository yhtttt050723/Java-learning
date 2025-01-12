package Unit7;
/*
子类中的构造方法
子类会继承父类的属性和方法但是构造方法是不继承的
构造方法：方法名与类名相同且没有返回值
 */
class Fclass{
    Fclass(){
        System.out.println("Fclass()");
    }
}
class Sclass extends Fclass{
     Sclass(){
        //系统会默认加一条super语句去执行父类的构造方法
        System.out.println("Sclass()");
    }
}
public class Unit7_4 {
    public static void main(String[] args) {
        Sclass sclass = new Sclass();
    }
}
