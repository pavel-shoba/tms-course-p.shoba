package hometasks.lesson8.domain;

public class AndroidPhone extends Phone {

    @Override
    public void firmware(){
        System.out.println("Checking OS version for AndroidPhone: 14.1");
    }
}
