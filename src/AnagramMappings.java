import java.util.LinkedList;
import java.util.List;

public class AnagramMappings {

    /**
     *  Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by
     * randomizing the order of the elements in A.
     *
     * We want to find an index mapping P, from A to B.
     * A mapping P[i] = j means the ith element in A appears in B at index j.
     *
     */
    public static List<Integer> getMapping(int[] A, int[] B) {
        List<Integer> array = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j] == A[i]) {
                    array.add(i, j);
                }
            }
        }
        return array;
    }

//    public static void main(String[] args) {
//        int[] arr1 = {12, 28, 46, 32, 50};
//        int[] arr2 = {50, 12, 32, 46, 28};
//        System.out.println(getMapping(arr1, arr2));
//    }

}