import java.util.LinkedList;
import java.util.List;

public class ArrayProduct {

    /**
     * Given an array of n integers where n > 1, nums, return an array output such that output[i]
     * is equal to the product of all the elements of nums except nums[i].
     * <p>
     * E.g. [1,2,3,4], return [24,12,8,6]
     */
    public static List<Integer> arrayProduct(int[] nums) {
        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            result.add(i, product);
        }
        return result;
    }

//    public static void main(String[] args) {
//        int[] test1 = {1,2,3,4};
//        System.out.println(arrayProduct(test1));
//    }

}