package ro.andonescu.playground.java.lamda;

import ro.andonescu.playground.java.lamda.games.GameResult;
import ro.andonescu.playground.java.lamda.games.GameService;
import ro.andonescu.playground.java.lamda.games.rockpaperscissors.RockPaperScissors;
import ro.andonescu.playground.java.lamda.games.rockpaperscissors.RockPaperScissorsUtil;

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

//        or

//        GameService gameService = (playerOne, playerTwo) -> {
//            int gameValue = playerOne.getValue() - playerTwo.getValue();
//            if (gameValue == 0) {
//                return GameResult.DRAW;
//            } else if (gameValue == 1 || gameValue == -2) {
//                return GameResult.LOST;
//            } else {
//                return GameResult.WIN;
//            }
//        };

        GameResult result = gameService.getResult(RockPaperScissors.PAPER, RockPaperScissors.SCISSORS);
        System.out.println(String.format("game result : %s", result));
    }
    public static void main(String[] args) {
          new MAIN_RockPaperScissors().gameResultPredictor();
    }


}
