public class RangeSumQuery {

    /**
     * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j)
     * inclusive.
     *
     * Given nums = [-2, 0, 3, -5, 2, -1]
     * sumRange(0, 2) -> 1
     * sumRange(2, 5) -> -1
     * sumRange(0, 5) -> -3
     */
    public static int sumRange(int[] nums, int i, int j) {
        int acc = 0;
        for (int start = i; start <= j; start++) {
            acc += nums[start];
        }
        return acc;
    }

//    public static void main(String[] args) {
//        int[] test = {-2, 0, 3, -5, 2, -1};
//        System.out.println(sumRange(test, 0, 2));
//        System.out.println(sumRange(test, 2, 5));
//        System.out.println(sumRange(test, 0, 5));
//    }

}