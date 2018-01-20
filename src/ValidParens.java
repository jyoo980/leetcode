public class ValidParens {

    /**
     * Given an input string str, return true if str is a valid string of parenthesis
     * E.g. "{}()[]" -> return true
     *      "{({})"  -> return true
     *      "(]()"   -> return false
     */
    public static boolean validParens(String str) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validParens("{}()[]"));
        System.out.println(validParens("{({})"));
        System.out.println(validParens("(]()"));
    }
    
}