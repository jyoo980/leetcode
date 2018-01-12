public class StringDifference {

    /**
     * Given two strings s and t which consist of only lowercase letters.
     *
     * String t is generated by random shuffling string s and then add one more letter at a random position.
     * Find the letter that was added in t.
     *
     * Input:
     * s = "abcd"
     * t = "abcde"
     * Output: e
     *
     */
    public static String getAddedLetter(String s, String t) {
        if (s.length() <= 1 || t.length() <= 1) {
            return "";
        } else {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    return Character.toString(t.charAt(i));
                }
            }

            return Character.toString(t.charAt(s.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(getAddedLetter("abcd", "abcde"));
    }


}