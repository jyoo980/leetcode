public class LongestStringMatch {

    /**
     * Given two strings s and t, return the length of the string sequence they have in
     * common starting from the beginning.
     *
     * E.g. "abcdef", "abcdefgh" -> 6
     *      "a", "ab"            -> 1
     *
     */
    public static int longestCommonLen(String s, String t) {
        int iterLen = (s.length() < t.length())? s.length() : t.length();
        int sameCharLen = 0;

        for (int i = 0; i < iterLen; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                sameCharLen++;
            } else {
                return sameCharLen;             // this line ensures that we stop iterating once we find a mismatch
            }
        }
        return sameCharLen;
    }

//    public static void main(String[] args) {
//        System.out.println(longestCommonLen("abcdef", "abcdefgh"));
//        System.out.println(longestCommonLen("a", "ab"));
//    }

}