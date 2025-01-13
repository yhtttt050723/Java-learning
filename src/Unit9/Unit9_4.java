package Unit9;
/*
throw语句抛出异常
 */
public class Unit9_4 {
    public static void main(String[] args) {
        int num = 0;
        try {
            if(num == 0)
                System.out.println("num"+100/num);
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("分母不为零");
            e.printStackTrace();//输出e的异常信息,给出错误原因和位置
        }
    }
}
