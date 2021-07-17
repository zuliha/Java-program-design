import java.io.*;
public class copyFile {

    public void copy(String FromPath, String ToPath) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(ToPath, true);
            inputStream = new FileInputStream(FromPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] bytes = new byte[1024];
        int read = 0;
        try {
            while ((read = inputStream.read(bytes)) > 0) {
                outputStream.write(bytes, 0, read);
                if (read != 1024) {
                    System.out.println("即将完成");
                } else {
                    System.out.println("正在复制...");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        copyFile c = new copyFile();
        c.copy("C:\\Users\\Daxia\\Documents\\JAVA作业\\test1.docx ","C:\\Users\\Daxia\\Documents\\JAVA作业\\test2.docx");
    }


}
