public class RepeatedSubstring {

    /**
     * Given a non-empty string check if it can be constructed by taking a substring of it and
     * appending multiple copies of the substring together. You may assume the given string consists of
     * lowercase English letters only and its length will not exceed 10000.
     *
     * E.g. Input: "abab"         -> true
     *             "aba"          -> false
     *             "abcabcabcabc" -> true
     */
    public static boolean isRepeatedSubstring(String str) {
        StringBuilder base, sub;
        for (int i = 1; i < str.length(); i++) {
            base = new StringBuilder("");
            sub = new StringBuilder(str.substring(0, i));
            for (int j = 0; j < str.length(); j++) {
                base.append(sub);
                if (base.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        System.out.println(isRepeatedSubstring("abab"));
//        System.out.println(isRepeatedSubstring("aba"));
//        System.out.println(isRepeatedSubstring("abcabcabcabcabc"));
//    }

}