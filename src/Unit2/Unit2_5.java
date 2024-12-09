/*
运算符和表达式、
% 取余操作 ， 最终数值符号由被除数决定
其中 i++ 后执行 i = i + 1
    ++i 先执行 i = i + 1
    其余同理

2.5.3逻辑运算符
! 非 离散 ： 非
& 与 离散 ： 合取
^ 异或 离散：11 0
            10 1
            01 1
            00 1
| 或 离散 ： 析取
&& 同 & 但是先计算左边值 ， 计算结果快
||同上
2.5.4赋值运算符
x+=y  ==  x = x +y
其余运算符同理
2.5.5条件运算符
A?B:C
其中 A为true 表达式B为整个式子的值
否则C为整个式子的值

 */
package Unit2;

public class Unit2_5 {
    public static void main(String[] arges){
        int age = 20;
        char gender = 'F';
        System.out.println(age > 18 && gender == 'F');//前 true 后 true
        System.out.println(age > 18 || gender == 'F');//前 true 后 true
        System.out.println(age != 18 ^ gender == 'F');//前 true 后 true
        System.out.println(!(age > 18) && gender == 'F');//前false 后 true
    }
}
