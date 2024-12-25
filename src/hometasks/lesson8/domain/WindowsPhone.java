package hometasks.lesson8.domain;

public class WindowsPhone extends Phone {

    @Override
    public void firmware() {
        System.out.println("Checking OS version for WindowsPhone: 1.0");
    }

    @Override
    public void call(Integer number) {
        System.out.println("Making a call and send SMS");
    }
}
