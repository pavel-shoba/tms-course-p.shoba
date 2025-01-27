package hometasks.lesson11.task1.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class NumberService {

    public HashSet<Integer> sortNumbersWithoutDublicate (List<Integer> list) {
        return new HashSet<>(list);
    }

    public HashMap<Integer, Integer> getCountOfNumbers (List<Integer> list) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for(Integer number : list) {
            if (result.containsKey(number)) {
                result.put(number, result.get(number) + 1);
            } else {
                result.put(number, 1);
            }
        }
        return result;
    }
}

