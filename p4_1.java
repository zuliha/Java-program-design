class A {
    static int[] a() {
        int[] t = new int[5];
        t[0] = 1000;
        return t;
    }
}

public class p4_1 {
    public static void main(String[] args) {
        int[] s = A.a();
        System.out.println(s[0]);
    }
}
// 1000