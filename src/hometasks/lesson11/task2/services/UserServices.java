package hometasks.lesson11.task2.services;

import hometasks.lesson11.task2.domain.User;

import java.util.*;

public class UserServices {

    public Set<String> getUniqueUsers (List<User> users) {
        Set<String> uniqueNames = new HashSet<>();
        for (User user : users) {
            uniqueNames.add(user.getName());
        }
        return uniqueNames;
    }
}
