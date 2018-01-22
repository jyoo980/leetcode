import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    /**
     * Given a sorted array, remove the duplicates in-place such that each
     * element appear only once and return the new length.
     *
     * E.g. [1, 1, 3, 4] -> return 2
     *
     */
    public static int removeDuplicates(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).equals(array.get(i + 1))) {
                array.remove(i);
            }
        }
        return array.size();
    }

//    public static void main(String[] args) {
//        List<Integer> test1 = new ArrayList<>();
//        test1.add(1);
//        test1.add(1);
//        test1.add(3);
//        test1.add(4);
//        System.out.println(removeDuplicates(test1));
//        System.out.println(removeDuplicates(test1));
//    }

}