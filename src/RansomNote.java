public class RansomNote {

    /**
     * Given an arbitrary ransom note string and another string containing letters from all the magazines,
     * write a function that will return true if the ransom note can be constructed from the magazines;
     * otherwise, it will return false.
     *
     * E.g. canConstruct("a", "b") -> false
     *      canConstruct("aa", "ab") -> false
     *      canConstruct("aa", "aab") -> true
     */
    public static boolean canConstruct(String note, String mag) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}