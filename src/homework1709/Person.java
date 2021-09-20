package homework1709;

public class Person {
    String name;
    String surname;
    int height;

    public Person() {
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person (String name, String surname, int height) {
        this (name,surname);
        this.height = height;
    }

}
