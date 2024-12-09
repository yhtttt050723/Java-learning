package Unit3;
//输出斐波那契数列                                                                                                          
public class Unit3_10 {
    public static void main(String[] arges){
        int i,j,t;
        i = j = 1;
        System.out.println(i);
        System.out.println(j);
        for (int n = 1 ; n <= 10 ;n++){
            t = i+j;
            System.out.println(t);
            i = j ;
            j = t ;
        }
    }
}
