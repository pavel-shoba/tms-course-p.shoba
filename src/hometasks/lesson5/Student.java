package hometasks.lesson5;

import java.util.concurrent.CountDownLatch;

public class Student {

    public String name;
    public String surname;
    public int age;
    public int countOfLection;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname, int age, int countOfLection) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.countOfLection = countOfLection;
    }

    public String printFullName() {
        String fullName = "Fullname of student is: " + name + " " + surname;
        return fullName;
    }

    public void getCountOfLectionByUser(String surname, int countOfLection) {
        System.out.println(surname + " visited " + countOfLection + " lections");
    }
}
