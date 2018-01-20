public class TwiceOthers {

    /**
     * In a given integer array nums, there is always exactly one largest element.
     * Find whether the largest element in the array is at least twice as much as every other number in the array.
     * If it is, return the index of the largest element, otherwise return -1.
     *
     * Input: nums = [3, 6, 1, 0]
     * Output: 1
     *
     */
    public static int twiceOthers(int[] nums) {
        int largest = getMax(nums);

        for (int num : nums) {
            if (largest != num) {
                if (largest < (num * 2)) {
                    return -1;
                }
            }
        }

        return getLargestIndex(nums);
    }

    private static int getMax(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = (nums[i] > max)? nums[i] : max;
        }
        return max;
    }

    private static int getLargestIndex(int[] nums) {
        int largest = getMax(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == largest) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 6, 1, 0};
        System.out.println(twiceOthers(test1));
    }
}
