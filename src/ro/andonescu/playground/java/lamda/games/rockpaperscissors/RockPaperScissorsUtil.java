package ro.andonescu.playground.java.lamda.games.rockpaperscissors;

import ro.andonescu.playground.java.lamda.games.GameResult;

/**
 * Created with IntelliJ IDEA.
 * User: iandonescu
 * Date: 09/01/13
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class RockPaperScissorsUtil {

    public static GameResult evaluate(RockPaperScissors playerOne, RockPaperScissors playerTwo) {
        int gameValue = playerOne.getValue() - playerTwo.getValue();
        if (gameValue == 0) {
            return GameResult.DRAW;
        } else if (gameValue == 1 || gameValue == -2) {
            return GameResult.LOST;
        } else {
            return GameResult.WIN;
        }
    }
}
