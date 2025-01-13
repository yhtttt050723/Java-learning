package Unit8;
/*
匿名类

 */
public class Unit8_4 {
    public static void main(String[] args){
        Teacher t = new Teacher();
        Student s = new Student() {
            @Override
            void speak() {
                System.out.println("匿名类体");
            }
        };
        t.look(s);
    }

}
abstract class Student{
    abstract void speak();
}
class Teacher{
    void look(Student s){
        s.speak();
    }
}