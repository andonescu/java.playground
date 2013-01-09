package ro.andonescu.playground.java.lamda.games.rockpaperscissors;

/**
 * Created with IntelliJ IDEA.
 * User: iandonescu
 * Date: 09/01/13
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public enum RockPaperScissors {
    ROCK(1), PAPER(2), SCISSORS(3);

    private int value;

    RockPaperScissors(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
