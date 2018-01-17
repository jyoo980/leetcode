public class BinaryBits {

    /**
     * Given a positive integer, check whether it has alternating bits: namely,
     * if two adjacent bits will always have different values.
     *
     * Input: 5
     * Output: True
     * Explanation:
     * The binary representation of 5 is: 101
     */
    public static boolean hasAlternatingBits(int num) {
        String binaryRep = toBinary(num);

        char current = binaryRep.charAt(0);

        for (int i = 1; i < binaryRep.length(); i++) {
            if (current ==  binaryRep.charAt(i)) {
                return false;
            }
            current = binaryRep.charAt(i);
        }
        return true;
    }

    private static String toBinary(int num) {
        StringBuilder str = new StringBuilder("");

        while (num != 0) {
            str.append(num % 2);
            num /= 2;
        }

        return str.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(hasAlternatingBits(3));
//        System.out.println(hasAlternatingBits(7));
//        System.out.println(hasAlternatingBits(11));
//        System.out.println(hasAlternatingBits(5));
//        System.out.println(hasAlternatingBits(10));
//    }

}