class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("#");
            Thread.yield();    //yield（）方法暂时释放其他线程的时间
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        while (true) {
            System.out.println("***");
        }
    }
}
