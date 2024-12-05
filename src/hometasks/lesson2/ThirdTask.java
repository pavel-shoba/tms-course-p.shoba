package hometasks.lesson2;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 10;
        double avg = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println("Please enter a number");
            int number = sc.nextInt();
            count = --count;
            sum = (sum + number);
            avg = sum / i;
            System.out.println("Were entered " + i + " numbers");
            System.out.println("Average sum of all numbers is " + avg);
            System.out.println("You should add " + count + " numbers for lessons");
        }
    }
}
