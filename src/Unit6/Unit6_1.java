package Unit6;
/*
第六章 常用类与正则表达式
1.Object类
Java类中所有类都直接或者间接继承Object类
如果extends中没有指明继承类则默认继承Object类
常见方法和使用
equals的内容
public boolean equals (Object o){
        return (this==o);
    }
 */
//equals 的使用
//在没有创建新对象的情况下,东西被放在常量池中所以地址会相同
//equals在判断值是否相等,而==在判断地址是否相等
public class Unit6_1 {
    public static void main(String[] Args){
        String name1 = new String("张三");
        String name2 = new String("张三");
        String name3 = "张三";
        String name4 = "张三";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name1==name3);
    }
}
