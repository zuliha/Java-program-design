class A {
    static String name;     //去掉static 试试

}

public class practice {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.name = "hahah";
        System.out.println(b.name);


    }
}

