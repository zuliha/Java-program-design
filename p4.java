class A {
    static void v(int[] t) {
        t[0] = 1000;
    }
}

public class p4 {
    public static void main(String[] args) {
        int[] s = new int[5];
        A.v(s);
        System.out.println(s[0]);
    }
}
// 1000