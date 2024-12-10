package hometasks.lesson2;

public class SecondTask {
    public static void main(String[] args) {
        int result1 = 0;
        int result2 = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 5 == 0) {
                result1 = result1 + 1;
            }
            if (i % 25 == 0) {
                result2 = result2 + 1;
            }
        }
        System.out.println(result1 + result2);
    }
}
