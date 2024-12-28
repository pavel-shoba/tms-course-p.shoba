package hometasks.lesson9.services;

import hometasks.lesson9.domain.Bet;
import hometasks.lesson9.domain.User;

public interface GameHandler {

    void game(User user, Bet bet);

}
