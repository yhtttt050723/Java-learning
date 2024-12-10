package Unit4;

class MyStatic{
    static int num; // 为类变量 ， 类外直接类名引用
    String name; // 为实例变量 , 类外使用需要创建对象引用
    MyStatic(String s){
        num++;
        name = s;
    }
}
public class Unit4_4 {
    public static void main(String[] arges) {
        MyStatic ms_1, ms_2;
        ms_1 = new MyStatic("peter");
        ms_2 = new MyStatic("alice");
        System.out.println("总人数:" + MyStatic.num);
        System.out.println("人员："+ms_1.name);
        System.out.println("人员："+ms_2.name);
    }
}
