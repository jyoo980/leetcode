import java.math.BigDecimal;
import java.math.RoundingMode;

public class PowerN {

    /**
     * Implement pow(x, n).
     *
     * E.g. Input: 2.00000, 10 -> 1024.00000
     *             2.10000, 3  -> 9.26100
     *
     */
    public static double pow(double x, int n) {
        double result = 1.0;

        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    // Recursive Solution
    private static double recursivePow(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * recursivePow(x, n - 1);
        }
    }

//    public static void main(String[] args) {
//        System.out.println(pow(2.00000, 10));
//        System.out.println(pow(2.10000, 3));
//        System.out.println(recursivePow(2.00000, 10));
//        System.out.println(recursivePow(2.10000, 3));
//    }

}