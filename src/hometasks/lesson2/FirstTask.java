package hometasks.lesson2;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        long number = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= number; i++){
            result = result * i;
        }
        System.out.println(result);
    }
}
