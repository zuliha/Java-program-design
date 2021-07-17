class A {
    void aa() {
        //System.out.println(this);
        System.out.println("A.aa");
    }
}

class B extends A {
    void bb() {
        System.out.println(this);

    }
}

public class p6 {
    public static void main(String[] args) {
        B b = new B();
        b.bb();
        b.aa();


    }

}
