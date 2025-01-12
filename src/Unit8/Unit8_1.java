package Unit8;
/*
1.不管方法是不是抽象类,只要加了abstract都是抽象类
2.抽象类不能被实例化,即不能用关键字new为该类创建对象
3.子类没有继承抽象父类中的所有的抽象方法,则该子类也必须定义为抽象类
4.abstract和final 不能共同修饰类,两者是对立关系
5.如果类中有抽象方法,则类必须用abstract修饰
6.抽象类中可以有自己的构造方法,但这些构造方法需要通过子类的构造方法调用
 */
public class Unit8_1 {
}
abstract class Animal1{
    public String name;
    public Animal1(){
        name = "false";
    }
    public Animal1 (String t){
        name = t;
    }
    public abstract void shout();
    public abstract void play();
}
abstract class Dog1 extends Animal1{
    public Dog1(){
        super();
    }
    public Dog1(String t){
        super(t);
    }
    public void shout(){
        System.out.println("狗狗发出叫声，汪汪");
    }
    public void play(){
        System.out.println(name+"为主人看家");
    }
}
abstract class Cat1 extends Animal1{
    public Cat1(){
        super();
    }
    public Cat1(String t){
        super(t);
    }

    @Override
    public void play() {
        System.out.println(name+"在逮老鼠");
    }
}
