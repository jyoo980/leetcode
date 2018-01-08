import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SingleNumber {

    /**
     *
     * Given an array of integers, every element appears twice except for one.
     * Find that single one.
     *
     */
    public static int singleNum(List<Integer> array) {
        HashSet<Integer> intHash = new HashSet<>();

        for (Integer num : array) {
            if (!intHash.add(num)) {
                return num;
            } else {
                intHash.add(num);
            }
        }
        return -1;
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        arr1.add(0);
//        arr1.add(1);
//        arr1.add(3);
//        arr1.add(0);
//        arr1.add(-2);
//        System.out.println(singleNum(arr1));
//    }

}