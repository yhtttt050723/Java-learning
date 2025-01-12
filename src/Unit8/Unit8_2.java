package Unit8;
/*
Java只支持单继承，不支持多继承，接口解决这一问题
在抽象类中如果将所有的成员变量设置为常量，所有方法都定义为抽象方法--接口(Interface)
接口定义的语法:
<接口修饰符>+interface+<接口名称>+[extends<父接口名列表>]{}
修饰符:public 和 默认 , 默认的接口仅包内可见
接口体中含有所需要说明的静态属性和抽象方法.
如:
public interface doable extends b,c{
double pi = 3.1415926;
public void dothis();
public int dothat();
}
 */
public class Unit8_2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.play();
        dog.liveInLand();
        dog.run();
        dog.shout();
    }
}
interface Animal{
    String species = "动物类";
    void shout();
    void run();
}
interface Terrestrial extends Animal{
    String species = "陆地动物";
    void liveInLand();
}
interface Pet{
    String name = "宠物狗";
    void play();
}
class Dog implements Terrestrial,Pet{
    String name;

    @Override
    public void shout() {
            System.out.println("狗狗汪汪乱叫");
    }

    @Override
    public void run() {
        System.out.println(species+"在奔跑");
    }

    @Override
    public void liveInLand() {
        System.out.println("狗狗生活在陆地上");
    }

    @Override
    public void play() {
        name = "小黑";
        System.out.println(name+"在玩耍");
    }
}
abstract class Cat implements Terrestrial,Pet{
    @Override
    public void shout() {
        System.out.println("小猫喵喵叫");
    }
}

