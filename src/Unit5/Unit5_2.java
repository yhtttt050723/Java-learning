package Unit5;
/*
对象数组的创建：
当使用students = new Student[3];
还需要为students这个数组中的三个数字元素分别构造Student对象实例;
否则数组中每一个元素的引用为NULL;
并不能进行正确的数据存取访问;
 */
class Student{
    String name;
    String major;
    int age;
    Student(String name,String major,int age){
        this.age = age;
        this.name = name;
        this.major = major;
    }
    void study(){
        System.out.println(name+age+major+"正在学习");
    }
}
public class Unit5_2 {
    public static void main(String[] args) {
         Student[] students= new Student[3]; // 3为长度不是下标
         students[0] = new Student("王伟1","计算机",18);
         students[1] = new Student("王伟2","计算机",18);
         students[2] = new Student("王伟3","计算机",18);
         for (int i = 0; i < 3 ; i++){
             students[i].study(); // 对象数组名加下标.方法
         }
    }
}
