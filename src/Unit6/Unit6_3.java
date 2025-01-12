package Unit6;
//getClass()方法使用:
/*
每一个class内容都会创建一个class对象保存在.class文件中
 */
public class Unit6_3 {
    static class Person{
        String name;
        int age;
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
    public static void main(String[] args){
        Person person1 = new Person("ddd",18);
        Class<?>c;
        c=person1.getClass();
        System.out.println(c);
        System.out.println(c.getName());
    }
}
