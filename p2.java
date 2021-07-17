class AA {
    String name;
}

public class p2 {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = aa1;
        aa2.name = "hanhan";
        System.out.println(aa1.name);
    }
}