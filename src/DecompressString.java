public class DecompressString {

    /**
     * Given a string compression, return its "decompressed" form
     *
     * E.g. "a1b2"   -> "abb"
     *      "a2b1c3" -> "aabccc"
     */
    public static String decompress(String str) {
        StringBuilder decomp = new StringBuilder("");
        for (int i = 0; i < str.length() - 1; i += 2) {
            int len = str.charAt(i + 1) - '0';
            for (int j = 0; j < len; j++) {
                decomp.append(str.charAt(i));
            }
        }
        return decomp.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(decompress("a1b2"));
//        System.out.println(decompress("a2b1c3"));
//        System.out.println(decompress("a1"));
//    }

}