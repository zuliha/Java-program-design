//参差不齐的数组
class A {
    public static void he() {
        int[][] a = new int[2][];
        a[0] = new int[10];
        a[1] = new int[3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;
                System.out.println(a[i][j]);
            }
        }
    }
}

public class raggedArray {
    public static void main(String[] args) {
        A.he();
    }

}