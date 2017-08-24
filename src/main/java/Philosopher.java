public class Philosopher implements Runnable{

  Fork leftFork;
  Fork rightFork;

  public Philosopher(Fork leftFork, Fork rightForkl) {
    this.leftFork = leftFork;
    this.rightFork = rightForkl;
  }

  public void run() {
    synchronized (leftFork){
      System.out.println("get left fork");
    }
    synchronized (rightFork){
      System.out.println("get right fork");
    }
  }
}
