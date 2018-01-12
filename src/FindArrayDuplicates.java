import java.util.Arrays;

public class FindArrayDuplicates {

    /**
     * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice
     * and others appear once. Find all the elements that appear twice in this array.
     *
     * Input: [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     */
    public static int[] getDuplicateNums(int[] array) {
        int[] duplicates = {};
        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1]) {
                duplicates[i] = array[i];
            }
        }
        return duplicates;
    }

    

}
