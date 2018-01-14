public class IsPowerOfTwo {

    /**
     * Given an integer, write a function to determine if it is a power of two.
     *
     */
    public static boolean isPowerOfTwo(int num) {
        int acc = 2;
        boolean flag = true;

        while (flag) {
            if (acc == num) {
                return true;
            } else if (acc > num) {
                flag = false;
            }
            acc *= acc;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(24));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2 * 2 * 2 * 2));
    }

}