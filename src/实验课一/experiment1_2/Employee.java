package 实验课一.experiment1_2;

public class Employee extends Person {
    public Employee(String name, String address, String idNumber) {
        super(name, address, idNumber);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', address='" + address + "', idNumber='" + idNumber + "'}";
    }
}