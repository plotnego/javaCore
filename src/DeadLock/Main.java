package DeadLock;

public class Main extends Thread{
    @Override
    public void run() {
    Thread tr = new Main();
    tr.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Main();
        thread.start();
        thread.join();

    }
}
