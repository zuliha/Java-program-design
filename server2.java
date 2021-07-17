import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.net.*; 
import java.io.*;
class ServerSocket implements Runnable{
    

    public void run(){


    }
}
public class server2 {
    public static void main(String[] args) {
        ServerSocket ss=new ServerSocket(9000);
        while(true){
            Socket socket=ss.accept();
           ServerTask st =new ServerTask(socket);
        }
    }
    
}