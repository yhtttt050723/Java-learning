package Unit6;
/*
Random类
random.nextInt(n) 生成0-n的随机int值
 */
import java.util.Random;
public class Unit6_6 {
    public static void main(String[] args){
        Random random1 = new Random(3);
        for(int i = 0 ;i < 10 ; i++){
            System.out.print(random1.nextInt(1000)+"\t");
        }
        System.out.println("");
        Random random2 = new Random(2);
        for(int i = 0 ;i < 10 ; i++){
            System.out.print(random2.nextInt(1000)+"\t");
        }
    }
}
