package hometasks.lesson8.domain;

public abstract class Phone  {

    private Integer number;
    private Integer levelSound;

    public void call(Integer number) {
        System.out.println("Making a call");
    }

    public void play(Integer levelSound) {
        System.out.println("Level of sound was got and started playing music");
    }

    public abstract void firmware();

    public Integer getNumber() {
        return number;
    }

    public Integer getLevelSound() {
        return levelSound;
    }
}
