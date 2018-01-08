public class ReverseWords {

    /**
     * Given an input string, reverse the string word by word.
     *
     * For example,
     * Given s = "the sky is blue",
     * return "blue is sky the".
     */
    public static String reverseWord(String wrd) {
        if (wrd.length() <= 1) {
            return wrd;
        } else {
            String[] tokens = wrd.split(" ");

            int begin = 0;
            int end = tokens.length - 1;
            while (end > begin) {
                String tmp = tokens[begin];
                tokens[begin] = tokens[end];
                tokens[end] = tmp;
                begin++;
                end--;
            }
            return arrayToString(tokens);
        }
    }

    private static String arrayToString(String[] tokens) {
        StringBuilder wrd = new StringBuilder("");

        for (int i = 0; i < tokens.length; i++) {
            if (i == tokens.length - 1) {
                wrd.append(tokens[i]);
            } else {
                wrd.append(tokens[i]);
                wrd.append(" ");
            }
        }

        return wrd.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(reverseWord(""));
//        System.out.println(reverseWord("a"));
//        System.out.println(reverseWord("the sky is blue"));
//        System.out.println(reverseWord("the sky"));
//    }

}