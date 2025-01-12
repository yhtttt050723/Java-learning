package Unit6;
//生成八个随机数 并观察结果
import java.util.Random;
public class Unit6_7 {
    public static void main(String[] args){
        Random random1 = new Random();
        System.out.println("来自第一个随机数列");
        for (int i = 0;i < 8;i++){
            System.out.print(random1.nextInt(1000)+"\t");
        }
        Random random2 = new Random();
        System.out.println("");
        System.out.println("来自第二个随机数列");
        for (int i = 0;i < 8;i++){
            System.out.print(random2.nextInt(1000)+"\t");
        }
    }
}
