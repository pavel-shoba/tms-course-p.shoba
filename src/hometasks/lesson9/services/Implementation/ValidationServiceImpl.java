package hometasks.lesson9.services.Implementation;

import hometasks.lesson9.domain.User;
import hometasks.lesson9.exception.StakeValidationException;
import hometasks.lesson9.services.ValidationService;

public class ValidationServiceImpl implements ValidationService {

    @Override
    public void validate(User user, int stake) {
        int maxStake = 100;
        String message = "Your stake was bigger than available balance or max stake(100)!";
        if (stake > user.getBalance() || stake > maxStake) {
            System.out.println(message);
            throw new StakeValidationException(message);
        }
    }
}
