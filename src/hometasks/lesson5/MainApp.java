package hometasks.lesson5;

public class MainApp {

    public static void main(String[] args) {

        Student first = new Student("Igor", "Krutoi");
        Student second = new Student("Yura", "Shatunov", 20);
        Student third = new Student("Borya", "Moiseev", 18, 7);

        System.out.println(first.getFullName());
        System.out.println(second.getFullName());
        System.out.println(third.getFullName());

        first.printCountOfLectionByUser();
        second.printCountOfLectionByUser();
        third.printCountOfLectionByUser();

        second.changeCountOfLection(13);
        second.printCountOfLectionByUser();
    }
}
