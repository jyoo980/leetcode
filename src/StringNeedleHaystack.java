public class StringNeedleHaystack {

    /**
     * Implement strStr().
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     *
     */
    public static int strStr(String needle, String haystack) {
        int needleIndex = -1;
        boolean insideSwitch = false;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                needleIndex = i;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i) != needle.charAt(j)) {
                        insideSwitch = true;
                        break;
                    }
                }
                if (!insideSwitch) {
                    return needleIndex;
                }
            }
        }
        return needleIndex;
    }

    public static void main(String[] args) {
        System.out.println(strStr("ll", "hello"));
        System.out.println(strStr("bba", "aaaaa"));
        System.out.println(strStr("ap", "aghapfdfd"));
    }


}
