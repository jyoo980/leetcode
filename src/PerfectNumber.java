public class PerfectNumber {

    /**
     * We define the Perfect Number is a positive integer that is equal to the sum of all its
     * positive divisors except itself.Now, given an integer n, write a function that returns true
     * when it is a perfect number and false when it is not.
     *
     * E.g. input = 28 -> True, since 28 = 1 + 2 + 4 + 7 + 14
     *
     */
    public static boolean isPerfectNumber(int num) {
        int divisorSum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum != 0 && num / divisorSum == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
    }

}