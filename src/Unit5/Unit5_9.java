package Unit5;
/*
使用Math.random 生成随机数字
首先Math.random返回的是一个double类型值
这决定了很多时候使用它需要
如
double num = Math.random(); 会生成一个零到一的整数
如果需要规定范围 比如从min到max
double num = Math.random()*(max - min) + min;
左闭右开区间
 */
//彩票抽奖程序
import java.util.Scanner;
import java.util.Arrays;
public class Unit5_9 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本次抽取的数字个数");
        int num = input.nextInt();
        System.out.println("请输入本次抽取数字的最大值");
        int max = input.nextInt();
        int[] ArrayGame = new int [num];
        for (int i = 0; i < num ; i++){
            ArrayGame[i] = (int)(Math.random()*max);//random为小写
        }
        System.out.println("");
        System.out.println("抽取的数组为：");
        for(int i = 0; i < ArrayGame.length;i++){
            System.out.print(ArrayGame[i]+"\t");
        }//存在随机重复问题，需要解决随机过程中可能产生的随机数相同问题
        System.out.println("");
        int[] result = new int[num];
        //初始化初识数组
        int[] begin = new int[num];
        for (int i = 0; i < begin.length;i++){
            begin[i] = (int)(Math.random()*max);
        }
        for (int i = 0; i <result.length;i++){
            int r =(int)(Math.random()*num);
            result[i] = begin[r];
            begin[r] = begin[num-1];
            num--;
        }
        Arrays.sort(result);
        for(int i = 0; i < result.length;i++){
            System.out.print(result[i]+"\t");
        }
    }
}
