import java.util.Arrays;

public class ValidAnagram {

    /**
     * Given two strings s and t, write a function to determine if t is an anagram of s.
     * For example,
     * s = "anagram", t = "nagaram", return true.
     * s = "rat", t = "car", return false.
     *
     * You may assume the string contains only lowercase alphabets.
     *
     */
    public static boolean validAnagram(String s, String t) {
        if (s.length() < 1 || t.length() < 1) {
            return false;
        } else {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);

            return Arrays.equals(sArray, tArray);
        }
    }

//    public static void main(String[] args) {
//        System.out.println(validAnagram("apple", "elppa"));
//        System.out.println(validAnagram("tommarvoloriddle", "iamlordvoldemort"));
//        System.out.println(validAnagram("hello", "helloworld"));
//    }

}