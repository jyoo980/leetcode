public class InsertPosition {

    /**
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * You may assume no duplicates in the array.
     *
     * E.g. Input: [1,3,5,6], 5
     *      Output: 2
     *
     *      Input: [1,3,5,6], 0
     *      Output: 0
     *
     *      Input: [1,3,5,6], 7
     *      Output: 4
     */
    public static int getInsertPosition(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (Math.abs(target - nums[i]) <= 1 && (i == nums.length - 1)) {
                    return i + 1;
                } else if (Math.abs(target - nums[i]) <= 1) {
                    return i;
                }
            }
        }
        return -1;      // error case
    }

    public static void main(String[] args) {
        int[] test1 = {1,3,5,6};
        int[] test2 = {1,3,5,6};
        int[] test3 = {1,3,5,6};
        System.out.println(getInsertPosition(test1, 5));
        System.out.println(getInsertPosition(test2, 0));
        System.out.println(getInsertPosition(test3, 7));
    }

}