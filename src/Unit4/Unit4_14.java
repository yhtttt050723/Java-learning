package Unit4;
//应用举例
//开发一个可以管理学生成绩的小程序
class Teacher{
    String t_id; // 教师工号
    String tname; // 教师姓名
    boolean gender;
    String phonenumber;
    String title;
    public Teacher(String id,String name){
        t_id = id;
        tname = name;
    }
}
class Student1{
    String name;
    String number;
    String grade;
    String major;
    int age;
    Student1(String xm , String sh){
        name = xm;
        number = sh;
    }
}
public class Unit4_14 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("王伟","6666");
        Teacher t1 = new Teacher("66666","王伟乘二");
        System.out.println(t1.tname);
        System.out.println(t1.t_id);
    }
}
