package ro.andonescu.playground.java.constructorreference;

import ro.andonescu.playground.util.GameResult;
import ro.andonescu.playground.util.GameService;
import ro.andonescu.playground.util.rockpaperscissors.RockPaperScissors;
import ro.andonescu.playground.util.rockpaperscissors.RockPaperScissorsUtil;

/**
 * Created with IntelliJ IDEA.
 * User: iandonescu
 * Date: 09/01/13
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class MAIN_RockPaperScissors {


    public void gameResultPredictor() {


        GameService gameService = RockPaperScissorsUtil::evaluate;

        GameResult result = gameService.getResult(RockPaperScissors.PAPER, RockPaperScissors.SCISSORS);
        System.out.println(String.format("game result : %s", result));
    }

    public static void main(String[] args) {
        new MAIN_RockPaperScissors().gameResultPredictor();
    }


}
