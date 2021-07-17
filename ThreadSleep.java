//正确 可运行
class A implements Runnable {
    public void run() {
        while (true) {
            System.out.println("*****");
            try {
                Thread.sleep(1000);  //sleep（long millis）方法使线程休眠指定的时间（毫秒），以允许其他线程执行
            } catch (Exception e) {

            }
        }
    }
}

class B implements Runnable {
    public void run() {
        while (true) {
            System.out.println("##");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
    }
}

public class a1 {
    public static void main(String[] args) {
        try {
            A a = new A();
            Thread th1 = new Thread(a);
            th1.start();

            B b = new B();
            Thread th2 = new Thread(b);
            th2.start();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
