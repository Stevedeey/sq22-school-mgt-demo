package entity;


import enums.Role;

public class Person {

    private String name;

    private int age;

    private String address;

    private int applicantScore;

    private Role role;

    // other fields relevant to all the persons can be added here!


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getApplicantScore() {
        return applicantScore;
    }

    public void setApplicantScore(int applicantScore) {
        this.applicantScore = applicantScore;
    }

    public Person(String name, int age, String address, int applicantScore, Role role) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.applicantScore = applicantScore;
        this.role = role;
    }

    public Person(String name, int age, String address, Role role) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.role = role;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", applicantScore=" + applicantScore +
                ", role=" + role +
                '}';
    }
}
