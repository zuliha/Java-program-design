class A {
    private String name;// 私有数据字段不可直接修改

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class indirectModify {
    public static void main(String[] args) {
        A a = new A();
        a.setName("hahaha"); // setter方法来设置新值。
        System.out.println(a.getName()); // getter方法来返回其值

    }

}
// hahaha