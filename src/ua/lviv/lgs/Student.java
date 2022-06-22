package ua.lviv.lgs;

public class Student {
    private int age;
    private String firstName;
    private String lastName;
    public String groupe;

    public Student(int age, String firstName, String lastName, String groupe) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupe = groupe;
    }

    public Student(String groupe){
        this.groupe = groupe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }
}
