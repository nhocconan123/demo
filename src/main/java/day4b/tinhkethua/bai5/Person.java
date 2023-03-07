package day4b.tinhkethua.bai5;

public class Person {
    private String Name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        Name = name;
        this.address = address;
    }

    public Person(String address) {
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
