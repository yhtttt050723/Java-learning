package 实验课一.experiment1_2;

import 实验课一.experiment1_2.Employee;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String idNumber, String title) {
        super(name, address, idNumber);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{name='" + name + "', address='" + address + "', idNumber='" + idNumber + "', title='" + title + "'}";
    }
}