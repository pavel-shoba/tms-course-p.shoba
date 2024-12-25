package hometasks.lesson8.services;

import hometasks.lesson8.domain.Phone;

public class RepairSevice {

    public void check(Phone phone) {
        System.out.println("Checking phone:");
        phone.call(phone.getNumber());
        phone.play(phone.getLevelSound());
        phone.firmware();
        System.out.println("Phone is operational");
    }
}
