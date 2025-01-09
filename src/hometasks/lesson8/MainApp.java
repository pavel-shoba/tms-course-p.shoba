package hometasks.lesson8;

import hometasks.lesson8.domain.AndroidPhone;
import hometasks.lesson8.domain.ApplePhone;
import hometasks.lesson8.domain.Phone;
import hometasks.lesson8.domain.WindowsPhone;
import hometasks.lesson8.services.RepairSevice;

public class MainApp {

    public static void main(String[] args) {

        RepairSevice repairSevice = new RepairSevice();
        AndroidPhone androidPhone = new AndroidPhone();
        ApplePhone applePhone = new ApplePhone();
        WindowsPhone windowsPhone = new WindowsPhone();

        repairSevice.check(androidPhone);
        repairSevice.check(applePhone);
        repairSevice.check(windowsPhone);

        Phone myPhone = new Phone() {
            @Override
            public void firmware() {
                System.out.println("Checking version for my phone");
            }
        };

        repairSevice.check(myPhone);
    }
}
