package Unit9.EX7;

public class Text_2 {
    public static void main(String[] arges){
        try{
            method(0);
            System.out.println("After the method call");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
    static void method(int i) throws Exception{
        System.out.println(100/i);
    }
}
