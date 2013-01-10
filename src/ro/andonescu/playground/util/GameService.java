package ro.andonescu.playground.util;

import ro.andonescu.playground.util.rockpaperscissors.RockPaperScissors;

/**
 * Created with IntelliJ IDEA.
 * User: iandonescu
 * Date: 09/01/13
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public interface GameService {
    GameResult getResult(RockPaperScissors playerOne, RockPaperScissors playerTwo);
}
