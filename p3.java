class A {
    void test() {
        int[] a = new int[3];
        int[] b;
        b = a;
        b[0] = 1000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}

public class p3 {
    public static void main(String[] args) {
        A s = new A();
        s.test();
    }
}