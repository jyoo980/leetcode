public class WordRotation {

    /**
     * Given two strings s and t, determine if t is a "rotation" of s.
     *
     * For example, s = "waterbottle", t = "lewaterbott", return true
     *
     */
    public static boolean validRotation(String s, String t) {
        if  (s.length() != t.length()) {
            return false;
        } else {
            StringBuilder tBuilder = new StringBuilder(t);
            tBuilder.append(tBuilder);

            String tt = tBuilder.toString();

            return tt.contains(s);
        }
    }

//    public static void main(String[] args) {
//        System.out.println(validRotation("waterbottle", "lewaterbott"));
//        System.out.println(validRotation("rotation", "ionrotat"));
//        System.out.println(validRotation("rotation", "tonrotat"));
//    }

}