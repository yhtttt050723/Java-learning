package Unit7;
/*
成员方法的覆盖
子类方法签名与父类相同时会覆盖父类的方法
但是必须保证返回值相同
 */
public class Unit7_2 {
    static class Father{
        String suggest(String obj,int speed){
            return obj+speed+"45634";
        }
    }
    static class Son extends Father{
        String suggest(String obj,int speed){
            return obj+speed+"iuuouo";
        }
    }

    public static void main(String[] args) {
        Son son1 =new Son();
        System.out.println(son1.suggest("1",2));
    }
}
