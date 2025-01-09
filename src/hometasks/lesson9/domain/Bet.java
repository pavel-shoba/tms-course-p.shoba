package hometasks.lesson9.domain;

public class Bet {

    private int stake;
    private boolean result;
    private int number;

    public Bet(int stake, boolean result, int number) {
        this.stake = stake;
        this.result = result;
        this.number = number;
    }

    public Bet() {
    }

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
