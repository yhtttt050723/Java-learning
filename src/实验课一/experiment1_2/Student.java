package 实验课一.experiment1_2;

import 实验课一.experiment1_2.Person;

public class Student extends Person {
    private String classNumber;

    public Student(String name, String address, String idNumber, String classNumber) {
        super(name, address, idNumber);
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', address='" + address + "', idNumber='" + idNumber + "', classNumber='" + classNumber + "'}";
    }
}
