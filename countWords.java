import java.io.File;
import java.util.LinkedList;
import java.io.PrintWriter;
import java.util.*;
class Words{
    public void aa() throws Exception{
        PrintWriter printWriter = new PrintWriter("a1.txt");
        printWriter.write("yearning for freedom");
        printWriter.flush();
        printWriter.close();
        File file = new File("a1.txt");
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        String[] A = s.split(" ");
        scanner.close();
        int i;
        int sum = 0;
        for(i = 0; i < A.length; i++) {
            if(A[i].equals("")){
                sum++;
            }
        }
        System.out.println(A.length-sum);
    }
}
public class countWords{
    public static void main(String[] args) throws Exception{
        Words a = new Words();
        a.aa();
    }
}
