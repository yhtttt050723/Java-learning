package Unit9.EX7;

public class Text_4 {
    public static void main(String[] arges){
        try{
            method();
            System.out.println("After the method call");
        }catch (RuntimeException e){
            System.out.println("RuntimeException in main");
        }catch (Exception e){
            System.out.println("Exception in main");
        }
    }
    static void method() throws  Exception{
        try{
            String s ="abc";
            System.out.println(s.charAt(3));
        }catch (RuntimeException e){
            System.out.println("RuntimeException in method()");
        }catch (Exception e){
            System.out.println("Exception in method()");
        }
    }
}
