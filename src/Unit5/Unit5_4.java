package Unit5;

public class Unit5_4 {
    public static void main(String[] args){
        int x=0;
        int[] y = new int[10];
        y[0] = 6;
        m(x,y); //优先级在于语句顺序而不是方法
        System.out.println(x);
        System.out.println(y[0]);

    }

    public static void m(int num,int[] number){
        num = 3;
        number[0]=3;
    }
}
