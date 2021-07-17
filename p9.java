import java.io.File;
import java.util.LinkedList;
import java.io.PrintWriter;
import java.util.*;
class Words{
    public void aa() throws Exception{
        PrintWriter printWriter = new PrintWriter("a1.txt");
        printWriter.write("tmd不写了");
        printWriter.flush();
        printWriter.close();
        File file = new File("a1.txt");
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        String s1 = s.replaceAll("tmd","***");
        scanner.close();
        System.out.println("原文：\n"+s);
        System.out.println("修正：\n"+s1);
        PrintWriter printWriter1 = new PrintWriter("a1.txt");
        printWriter1.write(s1);
        printWriter1.flush();
        printWriter.close();
    }
}
public class p9{
    public static void main(String[] args) throws Exception{
        Words a = new Words();
        a.aa();
    }
}
