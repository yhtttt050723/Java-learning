package 实验课一.experiment1_2;

public class Person {

    protected String name;
    protected String address;
    protected String idNumber;

    public Person(String name, String address, String idNumber) {
        this.name = name;
        this.address = address;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address='" + address + "', idNumber='" + idNumber + "'}";
    }

}
