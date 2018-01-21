public class LastWordLength {

    /**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the
     * length of last word in the string. If the last word does not exist, return 0.
     *
     * E.g. "Hello, world!" -> 6
     *
     */
    public static int lastWordLen(String s) {
        boolean hasSpace = false;
        int lastWordLen = 0;
        int lastWordStartIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i != s.length() - 1) {
                lastWordStartIndex = i + 1;
                hasSpace = true;
            }
        }
        if (lastWordStartIndex == s.length()) {
            return 0;
        }
        if (hasSpace) {
            for (int i = lastWordStartIndex; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    lastWordLen++;
                }
            }
            return lastWordLen;
        }
        return lastWordLen;

    }

//    public static void main(String[] args) {
//        System.out.println(lastWordLen("Hello, world!"));
//        System.out.println(lastWordLen("Mynameisbob"));
//        System.out.println(lastWordLen("So don't look back in anger, I heard her say"));
//        System.out.println(lastWordLen("Hello my dude "));
//    }

}