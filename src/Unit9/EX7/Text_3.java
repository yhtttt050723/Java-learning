package Unit9.EX7;

public class Text_3 {
    public static void main(String[] arges){
        try {
            String[] array = new String[15];
            System.out.println("array[15] is" + array[15]);
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }catch (Exception ex){
            System.out.println("Exception");
        }
    }
}
