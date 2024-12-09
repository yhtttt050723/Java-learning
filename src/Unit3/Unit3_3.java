package Unit3;
//求和1/i ， 使和大于等于十的最小的i
public class Unit3_3 {
    public static void main(String[] arges){
        double f = 0 ;
        long i , n;
        i = n = 0;
        while (f < 10){
            i = i + 1 ;
            f = f + 1 / i;
        }
        n = i ;
        System.out.println("最小N值为" + n);
        System.out.println("f(n) = " + f);
    }

}
//哇  这书上这个算法简直是狗屎！