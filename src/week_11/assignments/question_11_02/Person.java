package week_11.assignments.question_11_02;

public class Person {
    String name;
    String address;
    long phone;
    String email;

    Person() {

    }

    Person(String name, String address, long phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone + "\nEmail: " + email;
    }
}
