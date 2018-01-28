public class LongestUncommonSubs {

    /**
     * Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings.
     * The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this
     * subsequence should not be any subsequence of the other strings.
     *
     * E.g. Input: "aba", "cdc" -> 3
     *             "abcdef", "abcdefg" -> 1
     *              "gnfguiddfnfd", "gnfgueyzfnfd" -> 3
     */
    public static int longestUncommonSub(String s, String t) {
        int longestUncommonLen = 0;
        int currentUncommonLen = 0;
        int len = (s.length() < t.length())? s.length() : t.length();
        return -1;
    }
}
