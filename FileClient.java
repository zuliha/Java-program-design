import java.net.*;
import java.io.*;
import java.util.*;
public class FileClient {
    public static void main(String[] args) {
        ServerSocket ss=new ServerSocket(9002);
        Socket socket=new Socket("127.0.0.1",9002);

        DataInputStream out =new  DataOutputStream(socket.getOutputStream());
        byte[] fileContent=new byte[1024];
        FileInputStream fileIn=new FileInputStream ("form.txt");
        int length=fileIn.read(fileContent);
        out.write(fileContent,0,length);
        fileIn.close();
    }
    
}
// 结束