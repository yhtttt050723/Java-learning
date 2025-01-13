package Unit8;
/*
匿名接口
 */
public class Unit8_5
{
    public static void main(String[] args) {
        Dog111 dog= new Dog111();
        dog.call(new Animal12(){
            @Override
            public void shout(){
                System.out.println("匿名接口");
            }
        });
    }
}
interface Animal12{
    void shout();
}
class Dog111{
    void call (Animal12 a){
        a.shout();
    }
}