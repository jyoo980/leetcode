public class PivotIndex {

    /**
     * Input:
     * nums = [1, 7, 3, 6, 5, 6]
     * Output: 3
     * Explanation:
     * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers
     * to the right of index 3. Also, 3 is the first index where this occurs.
     *
     */
    public static int getPivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }

            if (leftSum == rightSum) return i;
        }
        return -1;
    }

//    public static void main(String[] args) {
//        int[] test = {1, 7, 3, 6, 5, 6};
//        int[] test2 = {1, 1, 4, 0, 2};
//        System.out.println(getPivotIndex(test));
//        System.out.println(getPivotIndex(test2));
//    }

}