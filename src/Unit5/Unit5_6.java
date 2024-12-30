package Unit5;
import java.util.Scanner;
/*
从键盘输入学生成绩
并从小到大进行排序
冒泡排序
两个点
首先双层循环
第一层循环控制循环次数
循环次数小于数组长度
第二层循环控制排序
循环次数小于数组长度减去第一次循环次数减去一
 */
public class Unit5_6 {
    final static int MaxSize = 20;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生人数，不超过20");
        int size = input.nextInt();
        double[] scores = new double[size];
        int NumOfStudents = 0;
        for (int i = 0;i < scores.length;i++){
            if (scores[i] == -1) {
            NumOfStudents = NumOfStudents-1;
            break;
        }
            System.out.print("请输入第"+(i+1)+"个学生成绩");
            scores[i] = input.nextDouble();
            NumOfStudents++;

        }
        double[] RightScores = scores;
        RightScores = Paixu(RightScores);
        for (double t:RightScores)
            System.out.println(t);
    }
    public static double[] Paixu(double []list){
        for (int i = 0 ; i < list.length; i ++){
            for (int j = 0 ; j < list.length - i -1; j ++){
                double l;
                if (list[j] > list[j+1]){
                    l = list[j];
                    list[j] = list[j+1];
                    list[j+1] = l;
                }
            }
        }
        return list;
    }
}
