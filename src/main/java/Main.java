import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

  public static void main(String[] args) {
    Fork fork1 = new Fork();
    Fork fork2 = new Fork();
    Fork fork3= new Fork();
    Philosopher ph1 = new Philosopher(fork1, fork2);
    Philosopher ph2 = new Philosopher(fork2, fork3);
    Philosopher ph3 = new Philosopher(fork3, fork1);

    ExecutorService executorService = Executors.newFixedThreadPool(3);
    System.out.println("start1");
    executorService.submit(ph1);
    System.out.println("start2");
    executorService.submit(ph2);
    System.out.println("start3");
    executorService.submit(ph3);
  }

}
