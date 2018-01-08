import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayIntersection {

    /**
     * Given two arrays, write a function to compute their intersection.
     * Example
     * Given: [1, 2, 2, 1], [2, 2], return [2]
     *
     */
    public static List<Integer> arrayIntersect(int[] arr1, int[] arr2) {

        LinkedList<Integer> intersection = new LinkedList<>();
        int shorter = (arr1.length < arr2.length)? arr1.length : arr2.length;

        for (int i = 0; i < shorter; i++) {
            if (arr1[i] == arr2[i] && !intersection.contains(arr1[i])) {
                intersection.add(arr1[i]);
            }
        }

        return intersection;
    }

    public static void main(String[])
}
