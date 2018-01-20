import java.util.Arrays;

public class MaxThreeProduct {

    /**
     * Given an integer array, find three numbers whose product is maximum and output the maximum product.
     *
     * E.g. Input: [1,2,3]   -> Output: 6
     *      Input: [1,2,3,4] -> Output: 24
     *
     */
    public static int maxThreeProduct(int[] nums) {
        int maxProduct = 1;
        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 3) {
            for (int num : nums) {
                maxProduct *= num;
            }
            return maxProduct;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > nums.length - 4; i--) {
            maxProduct *= nums[i];
        }
        return maxProduct;
    }

//    public static void main(String[] args) {
//        int[] test1 = {1,2,3};
//        int[] test2 = {1,2,3,4};
//        int[] test3 = {3, 2, 6, 0, 1, 3};
//        System.out.println(maxThreeProduct(test1));
//        System.out.println(maxThreeProduct(test2));
//        System.out.println(maxThreeProduct(test3));
//    }

}