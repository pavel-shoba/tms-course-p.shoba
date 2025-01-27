package hometasks.lesson11.task2;

import hometasks.lesson11.task2.domain.User;
import hometasks.lesson11.task2.services.AgeComporator;
import hometasks.lesson11.task2.services.UserServices;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<User> users = new LinkedList<>();

        users.add(new User("Petya", 18));
        users.add(new User("Vasya", 88));
        users.add(new User("Petya", 30));
        users.add(new User("Galya", 19));
        users.add(new User("Zoya", 24));
        users.add(new User("Petya", 47));
        users.add(new User("Kolya", 50));
        users.add(new User("Sanya", 15));

        UserServices userServices = new UserServices();

        System.out.println("Unique users by name: " + userServices.getUniqueUserNames(users));

        Set<User> sortedUsers = new TreeSet<>(new AgeComporator());
        sortedUsers.addAll(users);

        System.out.println("List of users by age: " + sortedUsers);
    }
}
