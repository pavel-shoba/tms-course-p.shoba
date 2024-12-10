package hometasks.lesson4;

public class TaskTwo {
    public static void main(String[] args) {

        int [] mass = {23, 454, 1, 94, 34, 55, 22, 93, 20, 13};
        int sum = 0;
        int max;
        int min;
        int count;

        for (int k = 0; k < mass.length; k++) {
            sum += mass[k];
        }

        for(int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass.length - 1 - i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }

        count = mass.length;
        max = mass[mass.length - 1];
        min = mass[0];

        System.out.println("Count of elements is " + count);
        System.out.println("Sum of elements is " + sum);
        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);
    }
}
