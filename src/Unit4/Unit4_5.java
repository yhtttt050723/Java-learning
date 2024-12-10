package Unit4;
class Student {
    String name;
    String number;
    String grade;
    String major;
    int age;

    Student(String xm, String sh) {
        name = xm;
        number = sh;
    }
    void Study(){
        System.out.println(name + ":" +number+ "正在教室学习");
    }
}
public class Unit4_5 {
        public static void main(String[] arges){
            Student stu1 , stu2;
            stu1 = new Student("peter","2020");
            stu2 = new Student("alice","2019");
            stu1.Study();
            stu2.Study();
        }
}

