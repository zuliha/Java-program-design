class Person {
    int age = 12;
}

class Student extends Person {
    int age = 18;

    void A() {
        System.out.println("学生年龄：" + super.age);
    }
}

public class p6_1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.A();
    }
}