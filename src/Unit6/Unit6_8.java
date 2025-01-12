package Unit6;
/*
包装类
Integer.parseInt(String s,int i) 可以把字符串参数转化成i进制整数进行解析
不填写i的情况下默认为十进制
字符串参数只能是数字
这个东西只能用来转化进制
 */
public class Unit6_8 {
    public static void main(String[] args) {
        int a = Integer.parseInt("100",8);
        System.out.println(a);
    }
}
