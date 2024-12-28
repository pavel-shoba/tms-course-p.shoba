package hometasks.lesson9.services.Implementation;

import hometasks.lesson9.domain.User;
import hometasks.lesson9.exception.CloseGameException;
import hometasks.lesson9.exception.NumberValidationException;
import hometasks.lesson9.services.PlayService;

public class PlayServiceImpl implements PlayService {

    @Override
    public boolean play(User user, Integer number) {
        int random = (int) (Math.random() * 6);
        if (number == -1) {
            throw new CloseGameException("Number -1 is to finish game");
        }
        if (number < 0 || number > 5) {
            throw new NumberValidationException("Your number is incorrect");
        }
        return number == random;
    }
}
