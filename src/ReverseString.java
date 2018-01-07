public class ReverseString {

    /**
     * Write a function that takes a string as input and returns the string reversed.
     * If the input is null, return null.
     *
     * Time: O(n)
     * Space: O(n)
     *
     */
    public String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char[] arr = str.toCharArray();

            int begin = 0;
            int end = arr.length - 1;
            while (end > begin) {
                char tmp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = tmp;
                end--;
                begin++;
            }
            return new String(arr);
        }
    }
}
