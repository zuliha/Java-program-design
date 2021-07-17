import java.lang.*;

public class threadGetPriority {
public static void main(String args[]) {
new ThreadDemo();

}

}

class ThreadDemo implements Runnable {
Thread t;

ThreadDemo() {
// thread created

t = new Thread(this, "Admin Thread");

// set thread priority

t.setPriority(1);

// print thread created

System.out.println("thread = " + t);

// this will call run() function

t.start();

}

public void run() {
// returns this thread's priority.

System.out.println("Thread priority = " + t.getPriority());

}

}
