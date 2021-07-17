import java.math.BigInteger;

public class getSum2 {
    public static void main(String[] args) {
        BigInteger total = new BigInteger("0");
        BigInteger i = new BigInteger("0");

        long start = System.currentTimeMillis();

        while (i.longValue() < 1000000) {
            total = total.add(new BigInteger("1"));
            i = i.add(new BigInteger("1"));
        }
        long end = System.currentTimeMillis();

        System.out.println(total);
        System.out.println(end - start);
    }

}
