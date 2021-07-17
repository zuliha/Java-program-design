public class prime {

    public static void main(String[] args) {
        boolean bool;
        for (int i = 2; i < 100; i++) {
            bool = true;

            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    bool = false;
                }
            }
            if (bool == true) System.out.print(i + " ");

        }
    }

}
