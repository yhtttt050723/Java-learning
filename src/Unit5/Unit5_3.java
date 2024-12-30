package Unit5;
import java.util.Scanner;
/*
数组长度
数组名 .length
数组的初始化
数组创建后 ， 如果不初始化 ，系统会根据其类型自动进行初始化
数组型为零
Boolean为false
访问数组
数组第一个值下标为零

 */
//从键盘中键入全班学生的成绩，计算平均值与标准差
public class Unit5_3 {
    public static void main(String[] args) {
        int n = 0;
        double sum,average,sd;
        sum = average = sd = 0;
        double[] array = new double[20];
        System.out.println("请从键盘中输入二十个学生的成绩,输入-1停止输入");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < array.length;i++){
            array[i] = input.nextDouble();
            n++;
            if (array[i] == -1){
                n = n-1;
                break;
            }
            sum = array[i] + sum;
        }
        average = sum / n;
        System.out.println(sum);
        System.out.println("平均成绩为"+average);
        System.out.println("学生人数为"+n);
        double t =0;
        for (int i = 0;i < n;i++){
            t = Math.pow(array[i]-average,2) + t;
        }
        /*
        sd =Math.pow((1/(n-1))* t,0.5) ;
        这里的 1/(n-1) 在 Java 中会被视为整数除法，
        如果 n-1 是一个整数且大于 1，
        那么 1/(n-1) 就会等于 0（因为整数除法会舍弃小数部分）。
        因此，整个乘积变成 0 * t，再开方后自然就是 0.0 了。
         */
        sd =Math.pow((1.0/(n-1))* t,0.5) ;
        System.out.println("标准差是"+sd);
    }
}
