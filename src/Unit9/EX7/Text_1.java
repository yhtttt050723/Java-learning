package Unit9.EX7;

public class Text_1 {
    public static void main(String[] arges){
        try {
            int value = 40;
            if (value < 50)
                throw new Exception("Value is too small.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("end!");
        }
    }
}
