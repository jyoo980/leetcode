import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {

    /**
     * Given an array of integers, return indices of the two numbers such that they
     * add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     */
    public static List<Integer> twoSum(List<Integer> nums, int target) {
        List<Integer> indices = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();    /* Key is the number, value is the index */

        for (int i = 0; i < nums.size(); i++) {
            map.put(nums.get(i), i);
        }

        for (int i = 0; i < nums.size(); i++) {
            if (map.containsKey(target - nums.get(i))) {
                indices.add(i);
                indices.add(map.get(target - nums.get(i)));
                return indices;
            }
        }

        return indices;
    }

//    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(7);
//        nums.add(11);
//        nums.add(15);
//
//        System.out.println(twoSum(nums, 9));
//    }

}
