import java.io.DataOutputStream;
import java.net.*; 
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",9000);

        DataInputStream in=new DataInputStream(socket.getInputStream());
        DataOutputStream out =new DataOutputStream(socket.getOutputStream());
        
        out.writeDouble(3.14); 
    }
    
}