package 实验课一.experiment1_2;

import 实验课一.experiment1_2.*;

public class Test{
    public static void main(String[] args) {
        // 创建不同类型的对象
        Person person = new Person("张三", "北京市海淀区", "123456");
        Student student = new Student("李四", "上海市浦东新区", "789012", "2024-01");
        Employee employee = new Employee("王五", "广州市天河区", "345678");
        Faculty faculty = new Faculty("赵六", "深圳市南山区", "901234", "教授");
        Staff staff = new Staff("孙七", "成都市武侯区", "567890", "行政经理");

        // 调用它们的 toString 方法
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}