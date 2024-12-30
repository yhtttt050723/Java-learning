package Unit5;
/*
5. 数组
5.1 数组特点：
1. 元素类型相同;
2. 所有元素的存放地址连续;
3. 数组下标从零开始;
4. 数组大小一旦定义 不能动态增大减小;
5.2 一维数组
5.2.1 数组的声明
类型 数组名[];
类型[] 数组名;
5.2.2 数组的创建
如 : numbers = new int[4];
数组名 = new 数组元素类型[数组大小];
 */
// 输入十个数字 ， 计算平均值 和 高于平均值的数量.
import java.util.*;
public class Unit5_1 {
    public static void main(String[] args) {
        final int NumberArray = 10;
        double[] array = new double[NumberArray];
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入"+NumberArray+"个数字");
        for (int i = 0;i < NumberArray;i++){
            array[i] = input.nextDouble();
            sum = sum += array[i];
        }
        double average = sum/NumberArray;
        int NumberAverage = 0;
        for (int i = 0;i < NumberArray;i++){
            if (array[i] >average)
                NumberAverage++;
        }
        System.out.println("平均值为"+average);
        System.out.println("高于平均值的个数为"+NumberAverage);

    }
}
