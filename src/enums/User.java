package enums;
import com.sun.jndi.cosnaming.IiopUrl;
public enum User {
    USER1("Alex", "Ivanov", 32, "Man", new Address("Usa","Chicago")),
    USER2("Viktor", "Petrov", 28, "Man",new Address("Russia","Omsk")),
    USER3("Anna", "Litvinova", 18, "Woman",new Address("Belarus","Minsk"));
    private String name;
    private String surName;
    private int age;
    private String gender;
    private Address address;

       User(String name, String surName, int age, String gender, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

       public static class Address {
        private String country;
        private String city;

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }
        public void getAddress() {
            System.out.println("User lives in " + city + "(" + country + ")");

        }

    }

    public void returnNameAndSurname() {
        System.out.println("User is " + name + " " + surName);
    }

    public int returnAge() {
        this.age = age + 1;
        return age;
    }

    public void returnAllaInformation() {
        System.out.println("User is " + name + " " + surName + " " + age + " years " + ", " + gender + ".");
//        Address address = new Address("USA", "Chicago");
        address.getAddress();
    }

}

