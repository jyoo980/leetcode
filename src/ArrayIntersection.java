import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayIntersection {

    /**
     * Given two arrays, write a function to compute their intersection.
     * Example
     * Given: [1, 2, 2, 1], [2, 2], return [2]
     *
     * Space: O(1)
     * Time: O(n)
     *
     */
    public static List<Integer> arrayIntersect(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        LinkedList<Integer> intersection = new LinkedList<>();
        int shorter = (arr1.size() < arr2.size())? arr1.size() : arr2.size();

        for (int i = 0; i < shorter; i++) {
            if (arr1.contains(arr2.get(i)) && !intersection.contains(arr2.get(i))) {
                intersection.add(arr2.get(i));
            }
        }

        return intersection;
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr1.add(1);
//        arr1.add(2);
//        arr1.add(2);
//        arr1.add(1);
//        arr2.add(1);
//        arr2.add(2);
//
//        System.out.println(arrayIntersect(arr1, arr2));
//
//    }

}