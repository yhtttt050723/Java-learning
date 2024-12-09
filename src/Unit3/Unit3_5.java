package Unit3;

public class Unit3_5 {
    public static void main(String[] arges){
        double s = 1;
        long f = 1 ;
        for (int i = 1; i <= 10 ; i++){
            f = f * i ; // f中存储上一个元素阶乘。
            s = s + 1.0 / f ;
        }
        System.out.println(s);
    }
}
