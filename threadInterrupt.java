//interrupt
class Task implements Runnable {
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted() == true) {
                break;
            }
            System.out.println("TASK");
        }
    }
}

public class threadInterrupt {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        thread.interrupt();
        System.out.println("Main******");
    }
}