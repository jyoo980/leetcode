public class IsSubsequence {

    /**
     * Given a string s and a string t, check if s is subsequence of t.
     *
     * E.g. s = "abc", t = "ahbgdc" -> true
     *      s = "axc", t = "ahbgdc" -> false
     *      s = "aec", t = "abcde"  -> false
     *
     */
    public static boolean isSubsequence(String s, String t) {
        int prevLocation = -1;
        boolean indexSwitch = true;
        for (int i = 0; i < s.length(); i++) {
            if (hasChar(t, s.charAt(i))) {
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        indexSwitch = j > prevLocation;
                        prevLocation = j;
                        break;
                    } else {
                        indexSwitch = false;
                    }
                }
            } else {
                return false;
            }

        }
        return indexSwitch;
    }

    private static boolean hasChar(String s, char ch) {
        char[] sArray = s.toCharArray();

        for (char c : sArray) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        System.out.println(isSubsequence("abc", "ahbgdc"));
//        System.out.println(isSubsequence("axc", "ahbgdc"));
//        System.out.println(isSubsequence("aec", "abcde"));
//    }

}