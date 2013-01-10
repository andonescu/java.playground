package ro.andonescu.playground.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: iandonescu
 * Date: 10/01/13
 * Time: 11:08
 * To change this template use File | Settings | File Templates.
 */
public class MAIN_PlayingWithThreads {

    private final ExecutorService executorService = Executors.newFixedThreadPool(3);


    private void startThreads() throws InterruptedException {
        List callableList = Arrays.asList(
                (Callable) () -> printThreadData(1),
                (Callable) () -> printThreadData(2),
                (Callable) () -> printThreadData(3),
                (Callable) () -> printThreadData(4),
                (Callable) () -> printThreadData(5)

        );

        executorService.invokeAll(callableList);

        executorService.shutdown();
    }

    private boolean printThreadData(int threadNumber) {
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("Thread %d - %d", threadNumber, i));
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        new MAIN_PlayingWithThreads().startThreads();
    }
}
