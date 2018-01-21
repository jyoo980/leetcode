public class HammingDistance {

    /**
     * The Hamming distance between two integers is the number of positions at which the
     * corresponding bits are different. Given two integers x and y, calculate the Hamming distance.
     *
     * E.g. x = 1, y = 4 -> 2
     *      x = 1, y = 2 -> 2
     *
     */
    public static int hammingDistance(int x, int y) {
        int diffCount = 0;
        String xStr = Integer.toBinaryString(x);
        String yStr = Integer.toBinaryString(y);

        if (xStr.length() < yStr.length()) {
            xStr = addLeadingZeroes(xStr, yStr.length());
        } else {
            yStr = addLeadingZeroes(yStr, xStr.length());
        }

        for (int i = 0; i < xStr.length(); i++) {
            if (xStr.charAt(i) != yStr.charAt(i)) {
               diffCount++;
            }
        }
        return diffCount;
    }

    private static String addLeadingZeroes(String str, int len) {
        StringBuilder result = new StringBuilder(str);
        while (result.length() != len) {
            result.insert(0, "0");
        }
        return result.toString();
    }


//    public static void main(String[] args) {
//        System.out.println(hammingDistance(1, 4));
//        System.out.println(hammingDistance(1, 1));
//        System.out.println(hammingDistance(1, 2));
//    }

}