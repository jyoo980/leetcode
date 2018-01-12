public class SIngleElementSortedArray {

    /**
     * Given a sorted array consisting of only integers where every element appears twice except for one element which
     * appears once. Find this single element that appears only once.
     *
     * Input: [1,1,2,3,3,4,4,8,8]
     * Output: 2
     *
     */
    public static int singleElementSortedArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[i + 1] && array[i + 1] != array[i + 2]) {
                return array[i + 1];
            }
        }
        return -1;
    }

//    public static void main(String[] args) {
//        int[] test = {1, 1, 2, 3, 3, 4, 4, 8, 8};
//        int[] test2 = {1, 1, 2, 3, 3};
//        int[] test3 = {};
//        int[] test4 = {3, 3, 7, 7, 10, 11, 11};
//        System.out.println(singleElementSortedArray(test));
//        System.out.println(singleElementSortedArray(test2));
//        System.out.println(singleElementSortedArray(test3));
//        System.out.println(singleElementSortedArray(test4));
//
//    }

}