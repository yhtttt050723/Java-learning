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
[方法修饰符] 方法返回类型 方法名 ([参数列表])
{
[方法体;]
}
(1)
1. 访问权限:public , protected , 默认(defalut) ,private
2. 类型特性:static , final , abstract , synchronized , 默认(static 与默认声明一致)
abstract 为抽象方法 只有方法声明 没有方法体
synchronized 修饰方法能够避免多个线程在同一时间执行同一代码段的代码。
(2)
方法返回值类型: Java 语言的任何数据类型
有 return 必须与 方法返回类型相同 没有return 则为 void 返回类型
4.2.5 构造方法
构造方法要求与类名相同且没有任何返回值类型.
[方法修饰符] 构造方法名 ([参数列表])
{
[方法体;]
}
名称必须与类的名称相同

 */
package Unit4;

public class Unit4_2$4_3 { // Unit 4_3
    class Student{
        String name;
        String number;
        String grade;
        String major;
        int age;
        Student(String xm , String sh){
            name = xm;
            number = sh;
        }
        void Study(){
            System.out.print(name + "正在教室学习");
        }
    }
}
