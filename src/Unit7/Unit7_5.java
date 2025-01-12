package Unit7;
/*
主动执行父类的构造方法
 */
class F_class{
    F_class(){
        System.out.println("Fclass()");
    }
    F_class(int i){
        System.out.println("Fclass"+i);
    }
}
class S_class extends F_class{
    S_class(){
        super(3);
        //super(3);
        //系统会默认加一条super语句去执行父类的构造方法
        //有super语句后系统不会默认加 即第一个父类方法不会被实现
        System.out.println("Sclass()");
    }
}
public class Unit7_5 {
    public static void main(String[] args) {
        S_class sclass = new S_class();
    }
}


