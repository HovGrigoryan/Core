package collections;

public class User {

    public String name;
    public String surname;
    public String phone;
    public String email;
    public int age;

    public User(String name, String surname, String phone, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
