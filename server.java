import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.net.*; 
import java.io.*;
public class server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(9000);
        Socket socket=ss.accept();
        
        DataInputStream in=new DataInputStream(socket.getInputStream());
        DataOutputStream out =new DataOutputStream(socket.getOutputStream());
        while(true){
            String re=in.readUTF();
            System.out.println("hahahaha");
            Thread.sleep(1000);

        }
       

    }
}