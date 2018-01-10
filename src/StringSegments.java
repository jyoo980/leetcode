public class StringSegments {

    /**
     * Count the number of segments in a string, where a segment is defined to be a contiguous
     * sequence of non-space characters.
     *
     * Input: "Hello, my name is John"
     * Output: 5
     *
     */
    public static int stringSegments(String s) {
        char[] strArray = s.toCharArray();
        int segCounter = 0;

        for (char c : strArray) {
            if (c == ' ') {
                segCounter++;
            }
        }

        return segCounter + 1;
    }

//    public static void main(String[] args) {
//        System.out.println(stringSegments("Hello"));
//        System.out.println(stringSegments("Hello, my name is John"));
//    }

}