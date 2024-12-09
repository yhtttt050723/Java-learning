package 实验课一.experiment1_2;

import 实验课一.experiment1_2.Employee;

public class Faculty extends Employee {
    private String rank;

    public Faculty(String name, String address, String idNumber, String rank) {
        super(name, address, idNumber);
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{name='" + name + "', address='" + address + "', idNumber='" + idNumber + "', rank='" + rank + "'}";
    }
}
