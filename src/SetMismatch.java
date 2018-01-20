import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SetMismatch {

    /**
     * The set S originally contains numbers from 1 to n. But unfortunately,
     * due to the data error, one of the numbers in the set got duplicated to
     * another number in the set, which results in repetition of one number and
     * loss of another number.
     *
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     *
     */
    public static List<Integer> getMismatched(int[] nums) {
        List<Integer> mismatched = new LinkedList<>();
        if (nums.length == 0) {
            return mismatched;
        } else {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1]) {
                    mismatched.add(nums[i]);
                    mismatched.add(nums[i] + 1);
                }
            }
            return mismatched;
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1,2,2,4};
        int[] test2 = {1,3,1,4,5,6,7};
        System.out.println(getMismatched(test1));
        System.out.println(getMismatched(test2));
    }

}
