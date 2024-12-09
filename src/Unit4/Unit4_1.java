/*
4.1 面向对象编程的基本概念
1. 对象
抽象概念：
程序 -> 对象
变量 -> 状态属性
方法 -> 描述行为
2. 类
对对象进行划分
一类具有相同属性和行为的类
3. 封装
隐蔽对象属性和行为的一个手段
隐蔽了类的具体实现功能
使得一个类用其他类的功能时，只需要明确它的外部接口，不需要明确这个类的内部细节
4. 继承
为了达到代码复用的目的
通过已有类创建新类的机制
一个子类只能有一个父类
但是一个可以在继承一个弗雷的同时实现多个接口
5. 多态
静态多态 ： 由方法重载引起的一种多态形式.
    方法重载 ： 在一个类中的多个方法具有相同的名字，但有不同的参数列表.
动态重载 :  由继承机制实现
    由子类方法覆盖父类中相同方法引起的一种多态形式
 */

package Unit4;
public class Unit4_1 {
    class Teacher{
        String department;
        String name;
        String title;
        boolean gender;
        void leturing(){
            System.out.print("We will give lectures.");
        }
    }
}
