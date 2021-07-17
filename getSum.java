import java.math.BigInteger;

class Task implements Runnable{
    long startPos,endPos,total;
    Task(long startPos,long endPos){
        this.startPos=startPos;
        this.endPos=endPos;
    }
    public void run() {
        total=0;
        for(long i=startPos;i<=endPos;i++){
            total++;
        }
        System.out.println(total); 
    }
}

public class getSum {
    public static void main(String[] args) {
        Task task1=new Task(1,500000000);
        Thread th1=new Thread(task1);
        th1.start(); 
        
        Task task2=new Task(500000001,1000000000);
        Thread th2=new Thread(task2);
        th2.start();    
        
        try {
            th1.join(); //join（）方法强制另一个线程等待线程完成。
            th2.join();
        } catch (Exception e) {
        }
        
        long total=task1.total+task2.total;
        System.out.println(total);

    }
    
}