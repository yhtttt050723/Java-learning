package Unit4;
//4. 用this访问本类的构造方法;
class OurStudent{
    private String stuNumber;
    private int stuScore;
    OurStudent(){
        this("学号未输入");
    }


    OurStudent(String xh){
        this(xh , 0);
    }
    OurStudent(String xh,int cj){
        stuNumber = xh;
        stuScore = cj;
        System.out.println("学号为"+stuNumber+"成绩为"+stuScore);
    }
}
public class Unit4_9 {
    public static void main(String[] args){
        OurStudent s1 = new OurStudent();
        OurStudent s2 = new OurStudent("54wd85a8wd48",90);
    }
}
