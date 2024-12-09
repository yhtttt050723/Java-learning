package Unit3;
//求所有水仙花数字;
public class Unit3_9 {
    public static void main(String[] arges){
        System.out.println("水仙花数字有：");
        int i , j , k;
        int num1 , num2;
        for (i = 1 ; i <= 9 ; i++){
            for (j = 1; j <= 9 ; j++){
                for (k = 1; k <= 9;k++){
                    num1 = 100*i + 10*j + k;
                    num2 = (int) (Math.pow(i,3) + Math.pow(j,3) +Math.pow(k,3));
                    if (num1 == num2){
                        System.out.printf("%7d",num2);
                    }
                }
            }
        }
    }
}
