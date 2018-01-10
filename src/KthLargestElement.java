import java.util.Arrays;

public class KthLargestElement {

    /**
     * Find the kth largest element in an unsorted array. Note that it is the kth largest
     * element in the sorted order, not the kth distinct element.
     * For example,
     * Given [3,2,1,5,6,4] and k = 2, return 5.
     */
    public static int kthLargest(int[] array, int k) {

        Arrays.sort(array);
        int index = array.length - k;
        return (index < 0) ? -1 : array[index];
    }

//    public static void main(String[] args) {
//        int[] test = {3, 2, 1, 5, 6, 4};
//        System.out.println(kthLargest(test, 2));
//    }

}