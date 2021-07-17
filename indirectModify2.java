class A {
    private String name;// 私有数据字段不可直接修改

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class indirectModify2 {
    public static void main(String[] args) {
        A a = new A();
        haha(a);
        System.out.println(a.getName());
    }

    static void haha(A a) {
        System.out.println(a);
        a.setName("wangxiaoer");
    }
}
/*
 A@6ff3c5b5 
 wangxiaoer
 */