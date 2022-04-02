package DeadLock2;

public class Main extends Thread {
    @Override
    public void run() {
        Thread thread = new Main();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread tr = new Main();
        tr.start();
    }
}

