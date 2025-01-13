package Unit11;

public class Unit11_3 {
    public static void main(String[] args) {
        Master master =new Master("qqq");
        Thread thread = new Thread(master);
        thread.start();

    }
}
class Master extends Student implements Runnable{
    Master(String name){
        super(name);
    }
    public void run(){
        int sum = 0;
        System.out.println(sum);
        Student a = new Student("sd");
        a.introduce();
    }

}
class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
    public void introduce(){
        System.out.println("我是一名大学生"+this.name);
    }
}