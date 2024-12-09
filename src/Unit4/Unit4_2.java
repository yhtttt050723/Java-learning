/*
4.2 类和对象
4.2.1 类的构成
寻找类的过程：
1. 从需求中抽象出对象.
2. 对对象进行分析，给出对象所对应的类.
3. 给出每个类的属性和方法.
4. 给出类的定义（类名，属性和方法）

4.2.1 类声明
[类修饰符] + class 类名 +[extends 父类名] + [implements 接口名列表]
4.2.2 类主体
{
    [成员变量声明;]
    [构造方法声明;]
    [成员方法声明;]
}
4.2.3 成员变量
[变量修饰符] + 类型 + 变量 (初始值);
变量修饰符:
(1)访问权限修饰符: public , protected , 默认(defalut) ,private
(2)成员变量的类型修饰符: static
(3)常量修饰符: final
4.2.4 成员方法

 */
package Unit4;

public class Unit4_2 {
    class Student{
        String name;
        String number;
        String grade;
        String major;
        int age;
        void String(){
            System.out.print(name + "正在教室学习");
        }
    }
}
