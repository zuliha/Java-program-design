import java.io.*;
class B {
    public void test() throws Exception {
        byte[] cache = new byte[1024];
        FileInputStream fis = new FileInputStream("tuOne.jpg");
        FileOutputStream fos = new FileOutputStream("tuTwo.jpg");
        int len;
        int i=1;
        do{
            len = fis.read(cache);
             i++;
             if(i==30){
                cache[0]=97;

             }
             System.out.println(i);
             fos.write(cache,0,len);
             

        } while (len == 1024);
        fos.close();//关闭流
        fis.close();
          
    }
}
public class b {
    public static void main(String[] args) {
        B a= new B();
        try {
            a.test();
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    } 
}