import java.math.BigInteger;

public class bigInt {
    public static void main() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        for (int i = 0; i < 10; i++)
            BigInteger c = a.add(b).toString();
        System.out.println(c);
        a = b;
        b = c;

    }

}
