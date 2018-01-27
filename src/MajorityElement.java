public class MajorityElement {

    /**
     * Given an array of size n, find the majority element. The majority element is the element that appears
     * more than ⌊ n/2 ⌋ times.
     *
     * E.g. input: [1,2,2,4,4,2,2,2] -> 2
     *      input: [1]               -> 1
     *      input: [1,2,2,1,1]       -> 1
     *
     */
    public static int getMajorityElement(int[] array) {
        double majoritySize = Math.floor(array.length / 2);

        for (int i = 0; i < array.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    currentCount++;
                }
            }
            if (currentCount >= majoritySize) {
                return array[i];
            }
        }
        return -1;          // error case
    }

//    public static void main(String[] args) {
//        int[] test1 = {1, 2, 2, 4, 4, 2, 2, 2};
//        int[] test2 = {1};
//        int[] test3 = {1, 2, 2, 1, 1};
//
//        System.out.println(getMajorityElement(test1));
//        System.out.println(getMajorityElement(test2));
//        System.out.println(getMajorityElement(test3));
//    }

}