package hometasks.lesson9.services.Implementation;

import hometasks.lesson9.domain.Bet;
import hometasks.lesson9.domain.User;
import hometasks.lesson9.exception.CloseGameException;
import hometasks.lesson9.exception.NumberValidationException;
import hometasks.lesson9.exception.StakeValidationException;
import hometasks.lesson9.services.ChangeService;
import hometasks.lesson9.services.PlayService;
import hometasks.lesson9.services.GameHandler;
import hometasks.lesson9.services.ValidationService;

import java.util.Scanner;

public class GameHandlerImpl implements GameHandler {

    private ValidationService makeValidation;
    private PlayService playInGame;
    private ChangeService makeChanges;

    public GameHandlerImpl(ValidationService makeValidation, PlayService playInGame, ChangeService makeChanges) {
        this.makeValidation = makeValidation;
        this.playInGame = playInGame;
        this.makeChanges = makeChanges;
    }

    @Override
    public void game(User user, Bet bet) {

        Scanner sc = new Scanner(System.in);
        int stake;
        int number;
        boolean result;

        while (true) {
            if (user.getBalance() <= 0) {
                System.out.println("You don't have enough balance to play");
                break;
            }

            System.out.println("Please enter your stake:");
            stake = sc.nextInt();
            bet.setStake(stake);

            try {
                makeValidation.validate(user, stake);
            } catch (StakeValidationException message) {
                System.out.println("Try to change your stake");
                continue;
            }

            System.out.println("Please enter your number from -1 to 5:");
            number = sc.nextInt();

            try {
                result = playInGame.play(user, number);
                makeChanges.change(user, stake, result);
            } catch (CloseGameException exception) {
                System.out.println(exception.getErrorMessage());
                break;
            } catch (NumberValidationException exception) {
                System.out.println(exception.getErrorMessage());
            }
        }
    }
}
