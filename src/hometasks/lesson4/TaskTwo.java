package hometasks.lesson4;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {

        int [] mass = {23, 454, 1, 94, 34, 55, 22, 93, 20, 13};
        int sum = 0;
        int max;
        int min;
        int count;

        count = mass.length;
        Arrays.sort(mass);
        max = mass[count - 1];
        min = mass[0];

        for(int i = 1; i < mass.length; i++) {
            sum += mass[i];
        }

        System.out.println("Count of elements is " + count) ;
        System.out.println("Sum of elements is " + sum);
        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);
    }
}
