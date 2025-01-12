package Unit6;
/*
System类
此类中包含in.out.err三个成员变量，分别表示标准输入流,标准输出流,标准错误输出流
常用方法
1.public static long currentTimeMillis() 用于获取当前系统时间的毫秒值
 */
//此方法用法如下:
public class Unit6_4 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0 ; i < 100000;i++){
            sum += i;
        }
        System.out.println("用时为");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
