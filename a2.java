import java.net.*;
import java.io.*;
import java.util.*;

class ReadTask implements Runnable{
    Socket socket;
    ReadTask(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            DataInputStream in = new DataInputStream(this.socket.getInputStream());
            while(true){
                String strIn = in.readUTF();
                System.out.println(strIn);
            }
        }
        catch(Exception e){}
    }
}
class WriteTask implements Runnable{
    Socket socket;
    WriteTask(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try{
            DataOutputStream out = new DataOutputStream(this.socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            while(true){
                String hua = scanner.nextLine();
                out.writeUTF(hua);
            }
        }
        catch(Exception e){}
    }
}

public class a2{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9000);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF(args[0]);
        ReadTask readTask = new ReadTask(socket);
        new Thread(readTask).start();
        WriteTask writeTask = new WriteTask(socket);
        new Thread(writeTask).start();
    }
}
