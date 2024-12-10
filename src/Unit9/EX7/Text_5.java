package Unit9.EX7;

public class Text_5 {
    public static void main(String[] arges){
        try {
            method();
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Over!");
        }
    }
    static void method() throws IndexOutOfBoundsException{
        String s = "abc";
        System.out.println(s.charAt(3));
    }
}
