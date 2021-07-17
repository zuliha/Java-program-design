import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.net.*; 
import java.io.*;
public class Client2 {
    public static void main(String[] args) {
        Socket socket = new Socket("127.0.0.1",9001);

        DataOutputStream out =new DataOutputStream(socket.getOutputStream());
        DataInputStream in=new DataInputStream(socket.getInputStream());

        while(true){
            out.writeUTF(args[0]);

            Thread.sleep(1000);
        }

        
    }
    
}