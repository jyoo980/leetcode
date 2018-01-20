public class RepeatedStringMatch {

    /**
     * Given two strings A and B, find the minimum number of times A has to be repeated such that B is
     * a substring of it. If no such solution, return -1.
     *
     *  For example, with A = "abcd" and B = "cdabcdab".
     *  return 3
     *
     * The length of A and B will be between 1 and 10000.
     *
     */
    public static int repeatedMatchNum(String a, String b) {
        StringBuilder repeated = new StringBuilder(a);
        int repeatNums = 0;

        while (repeated.length() != 10000) {
            if (repeated.toString().contains(b)) {
                return repeatNums + 1;
            }
            repeated.append(repeated);
            repeatNums++;
        }

        return -1;
    }

//    public static void main(String[] args) {
//        System.out.println(repeatedMatchNum("abcd", "cdabcdab"));
//    }

}