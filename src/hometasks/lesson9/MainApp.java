package hometasks.lesson9;

import hometasks.lesson9.domain.Bet;
import hometasks.lesson9.domain.User;
import hometasks.lesson9.services.GameHandler;
import hometasks.lesson9.services.Implementation.ChangeServiceImpl;
import hometasks.lesson9.services.Implementation.GameHandlerImpl;
import hometasks.lesson9.services.Implementation.PlayServiceImpl;
import hometasks.lesson9.services.Implementation.ValidationServiceImpl;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your available balance: ");
        int myBalance = sc.nextInt();

        User user = new User(name, myBalance);
        Bet bet = new Bet();
        GameHandler gameHandler = new GameHandlerImpl(new ValidationServiceImpl(), new PlayServiceImpl(), new ChangeServiceImpl());

        gameHandler.game(user, bet);
    }
}
