package hometasks.lesson11.task2.services;

import hometasks.lesson11.task2.domain.User;

import java.util.Comparator;

public class AgeComporator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getAge() - u2.getAge();
    }
}
