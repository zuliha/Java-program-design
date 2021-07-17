public class shortCircuit {
    public static void main(String[] args) {
        int a = 5;
        boolean b = ((a < 4) && (a++ > 4));  //短路运算
        System.out.println(a);
        System.out.println(b);


    }

}
