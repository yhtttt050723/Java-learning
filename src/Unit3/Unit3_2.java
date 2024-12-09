package Unit3;
import java.util.Scanner;
//成绩评定等级程序。
public class Unit3_2 {
    public static String ptoword(float grad){
        String result = null;
        switch((int)grad/10){
            case 10 :
                result = "A+";
                break;
            case  9:
                result = "A";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 6:
                result = "D";
                break;
            default:
                result = "E";
        }
        return result ;
    }
    public static void main (String[] arges){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        float score;
        score = input.nextFloat();
        if (score < 0 || score > 100){
            System.out.println("成绩有误");
        }
        else {
            System.out.println("成绩等级为："+ptoword(score));
        }
    }
}
