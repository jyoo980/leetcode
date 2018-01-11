public class MaxConsecutiveOnes {

    /**
     * Given a binary array, find the maximum number of consecutive 1s in this array.
     * Input: [1,1,0,1,1,1]
     * Output: 3
     *
     */
    public static int maxConsecutiveOnes(int[] binaries) {
        int currentMax = 0;
        int currentCount = 0;

        for (int num : binaries) {
            if (num == 1) {
                currentCount++;
            } else {
                currentMax = (currentCount > currentMax)? currentCount : currentMax;
                currentCount = 0;
            }
        }
        return (currentCount > currentMax)? currentCount : currentMax;
    }

//    public static void main(String[] args) {
//        int[] test0 = {};
//        int[] test1 = {1, 1, 0, 1, 1, 1};
//        int[] test2 = {1, 1, 0, 0, 0};
//        System.out.println(maxConsecutiveOnes(test0));
//        System.out.println(maxConsecutiveOnes(test1));
//        System.out.println(maxConsecutiveOnes(test2));
//    }

}