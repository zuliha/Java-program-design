import java.io.*;

class C{
    public void test () throws Exception{
        byte[] cache = new byte[1024];
        FileInputStream fis =new FileInputStream("tuOne.jpg");
        int len ;
        int i = 1;
        do {
            len = fis.read(cache);
            i++;
            if(i==30){
                for(i)
                System.out.println(cache[0]);
            }
        }while(len=1024);
        fis.close();
    }

}
public class Decode {

    
}