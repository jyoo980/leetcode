import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindArrayDuplicates {

    /**
     * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice
     * and others appear once. Find all the elements that appear twice in this array.
     *
     * Input: [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     */
    public static List<Integer> getDuplicateNums(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1]) {
                duplicates.add(array[i]);
            }
        }
        return duplicates;
    }

//    public static void main(String[] args) {
//        int[] test = {4, 3, 2, 7, 8, 2, 3, 1};
//        int[] test2 = {1, 2, 2, 3};
//        System.out.println(getDuplicateNums(test));
//        System.out.println(getDuplicateNums(test2));
//    }

}