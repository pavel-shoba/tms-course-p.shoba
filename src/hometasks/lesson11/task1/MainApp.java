package hometasks.lesson11.task1;

import hometasks.lesson11.task1.services.NumberService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(20);
        numbers.add(70);
        numbers.add(80);
        numbers.add(30);
        numbers.add(10);
        numbers.add(90);
        numbers.add(10);
        numbers.add(60);
        numbers.add(5);
        numbers.add(100);
        numbers.add(100);

        NumberService numberService = new NumberService();

        System.out.println("List of numbers without dublicates: " + numberService.sortNumbersWithoutDublicate(numbers));

        System.out.println("Count dublicates of numbers: " + numberService.getCountOfNumbers(numbers));
    }
}
