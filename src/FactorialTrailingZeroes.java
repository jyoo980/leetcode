public class FactorialTrailingZeroes {

    /**
     * Given an integer n, return the number of trailing zeroes in n!.
     *
     */
    public static int trailingZeroes(int n) {
        int nFactorial = factorial(n);
        int trailingZeros = 0;
        StringBuilder nFactorialString = new StringBuilder(Integer.toString(nFactorial));
        nFactorialString.reverse();

        for (int i = 0; i < nFactorialString.length(); i++) {
            if (nFactorialString.charAt(i) == '0') {
                trailingZeros++;
            } else if (nFactorialString.charAt(i) != '0') {
                return trailingZeros;
            }
        }

        return trailingZeros;
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }

//    public static void main(String[] args) {
//        System.out.println(trailingZeroes(5));
//    }

}