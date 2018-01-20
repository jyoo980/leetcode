import java.util.LinkedList;
import java.util.List;

public class MergeSortedLists {

    /**
     * Merge two sorted linked lists and return it as a new list. The new list should be made by
     * splicing together the nodes of the first two lists.
     */
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new LinkedList<>();
        int index = 0;

        while (!list1.isEmpty() || !list2.isEmpty()) {
            if (!list1.isEmpty()) {
                result.add(list1.get(index));
                list1.remove(index);
            }
            if (!list2.isEmpty()) {
                result.add(list2.get(index));
                list2.remove(index);
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        List<Integer> testList1 = new LinkedList<>();
//        List<Integer> testList2 = new LinkedList<>();
//        testList1.add(1);
//        testList1.add(2);
//        testList1.add(4);
//        testList2.add(1);
//        testList2.add(3);
//        testList1.add(4);
//        System.out.println(mergeLists(testList1, testList2));
//    }

}