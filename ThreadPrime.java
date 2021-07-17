// 多线程求素数
class Task1 implements Runnable {
    public int counter = 0;
    public void run() {
        // 判断是否是素数
        for (int i = 2; i <= 100000; i++) {
            int j = 0;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                counter++;
            }
        }
        System.out.println(Thread.currentThread().getName() + "有" + counter + "个素数");
    }
}
 
class Task2 implements Runnable { 
    public int counter = 0;
    public void run() {
        // 判断是否是素数
        for (int i = 100000; i <= 200000; i++) {
            int j = 0;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                counter++;
            }
        }
        System.out.println(Thread.currentThread().getName() + "有" + counter + "个素数");
    }
}
public class ThreadPrime {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread th1 = new Thread(task1, "线程1");
        th1.start();

        Task2 task2 = new Task2();
        Thread th2 = new Thread(task2, "线程2");
        th2.start();
    }
}
 