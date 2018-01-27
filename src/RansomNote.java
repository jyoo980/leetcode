import java.util.ArrayList;
import java.util.List;

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
        if (note.length() < 1 || mag.length() < 1 || note.length() > mag.length()) {
            return false;
        } else {
            List<Character> magChars = new ArrayList<>();
            dumpToList(mag, magChars);


        }

    }
    
    private static void dumpToList(String s, List<Character> sArray) {
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            sArray.add(c);
        }
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}