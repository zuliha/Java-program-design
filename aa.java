//复制文件
import java.io.*;

class A {
    public void test() throws Exception {

        // 1.创建文件 输入流从系统文件获取字节
        FileInputStream fis = new FileInputStream("tuOne.jpg");
        // 2.创建文件输出流将数据写入系统文件
        FileOutputStream fos = new FileOutputStream("tuTwo.jpg");
        // 3.保存字节数
        byte[] cache = new byte[1024];
        int len;
        do {
            // 4.输入流读取字节数，并保存到字节数组中
            len = fis.read(cache);
            // 5.将字节数组写入目标文件中
            fos.write(cache, 0, len);
            System.out.println("成功复制图片");
        } while (len == 1024);
        // 6.最后关闭输入输出流，释放连接资源
        fos.close();
        fis.close();
    }
}

public class aa {
    public static void main(String[] args) {
        A a = new A();

        try {
            a.test();

        } catch (Exception e) { // TODO: handle exception
        }

    }
}