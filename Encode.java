import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class A{
    public void test() throws IOException {
        byte[] cache = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Daxia\\Documents\\WorkSpace\\java\\给电影人的情书.mp3");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Daxia\\Documents\\WorkSpace\\java\\river.mp4");
        int len;
        int i = 1;
        do{
            len = fileInputStream.read(cache);
            i++;
            if(i == 30){
                byte[] cache2 = new byte[1024];
                FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\Daxia\\Documents\\WorkSpace\\java\\dog.jpg");
                int len2 = fileInputStream2.read(cache2);
                for(int s = 0; s < len2; s++){
                    cache[s] = cache2[s];
                }
                fileInputStream2.close();
            }
            //System.out.println(i);
            fileOutputStream.write(cache,0,len);
        }while(len == 1024);
        fileOutputStream.close();
        fileInputStream.close();
    }
}

public class Encode{
    public static void main(String[] args) throws IOException{
        A a = new A();
        a.test();
    }
}
