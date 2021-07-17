abstract class InnerClass {
    public abstract void print();

}

abstract class InnerClass1 {
    public abstract void print2();
}

public class inside {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass() {
            @Override
            public void print() {
                System.out.println("匿名内部类");
            }

        };
        innerClass.print();
    }
}
//匿名内部类
    