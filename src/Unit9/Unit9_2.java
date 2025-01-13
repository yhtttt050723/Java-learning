package Unit9;
/*
Error类与Exception类

异常处理机制

 */
import java.util.*;
public class Unit9_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("输入两个数字：");
            try{
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println(number2/number1);
            }catch(InputMismatchException e){
                System.out.println("输入的格式不对");
            }catch(ArithmeticException e){
                System.out.println("被除数不为零");
            }finally{
                System.out.println("终于输入对了，真不傻");
                input.close();
            }
        }
    }

}
