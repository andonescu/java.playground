package ro.andonescu.playground.java.defaultmethods;

import ro.andonescu.playground.util.GameResult;
import ro.andonescu.playground.util.rockpaperscissors.RockPaperScissors;

/**
 * Created with IntelliJ IDEA.
 * User: iandonescu
 * Date: 09/01/13
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class MAIN_RockPaperScissors {

    interface GameService {
        default GameResult getResult(RockPaperScissors playerOne, RockPaperScissors playerTwo) {
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

    class GameServiceImpl implements GameService {

    }


    public void gameResultPredictor() {

        GameService gameService = new GameServiceImpl() ;

        GameResult result = gameService.getResult(RockPaperScissors.PAPER, RockPaperScissors.SCISSORS);
        System.out.println(String.format("game result : %s", result));
    }

    public static void main(String[] args) {
        new MAIN_RockPaperScissors().gameResultPredictor();
    }


}
