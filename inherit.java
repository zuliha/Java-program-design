class A {

    void hello() {
        System.out.println("hello from A");
    }
}

class B extends A { // 类的继承
    void hello(int t) {
        System.out.println("hello from B");
    }

    void hello(int t, int s) {
        System.out.println("hello from b-2p");
    }
}

public class inherit {
    public static void main(String[] args) {
        A a = new A();
        a.hello();
        B b = new B();
        b.hello(1, 2);
    }
}
