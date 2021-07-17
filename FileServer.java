import java.net.*;
import java.io.*;
import java.util.*;
public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(9002);
        Socket socket=ss.accept();
        DataInputStream in =new  DataInputStream(socket.getInputStream());
        byte[] fileContent=new byte[1024];
        int length=in.read(fileContent);
        FileOutputStream fileOut=new FileOutputStream("to.txt");
        fileOut.write(fileContent);
        fileOut.close();
    }
    
}
// 结束