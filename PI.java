import java.math.BigDecimal;

public class PI {
    public static void main(String[] args) {
        BigDecimal PI = new BigDecimal(0);
        for (int i = 0; i < 2; i++) {
            PI = PI.add((BigDecimal.valueOf(1).divide(BigDecimal.valueOf(16).pow(i))).multiply((BigDecimal.valueOf(4)
                    .divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(1)))
                    .subtract(BigDecimal.valueOf(2)
                            .divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(4))))
                    .subtract((BigDecimal.valueOf(1)
                            .divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(5))))
                            .subtract((BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8)
                                    .multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(6)))))))));
        }
        System.out.println("PI=" + PI);
    }
}
//没有结果