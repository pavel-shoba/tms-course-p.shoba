package hometasks.lesson9.services.Implementation;

import hometasks.lesson9.domain.User;
import hometasks.lesson9.services.ChangeService;
import hometasks.lesson9.services.PlayService;

public class ChangeServiceImpl implements ChangeService {

    @Override
    public void change(User user, int stake, boolean result) {
        int balance = user.getBalance();
        if(!result) {
            balance = balance - stake;
            user.setBalance(balance);
            System.out.println("You lost, available balance is: " + balance);
        } else {
            balance = balance + stake;
            user.setBalance(balance);
            System.out.println("You win, available balance is: " + balance);
        }
    }
}
