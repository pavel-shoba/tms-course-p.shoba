package hometasks.lesson4;

public class TaskOne {
    public static void main(String[] args) {

        int [] first = {2, 61, 23, 99, 53, 111, 576, 5};
        int [] second = {90, 5, 303, 765, 111, 32, 8, 14, 23, 202};

        System.out.println("Repeated elements in both arrays: ");
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (second[j] == first[i]) {
                    System.out.println(first[i]);
                }
            }
        }
    }
}
