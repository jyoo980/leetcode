import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumIndexSum {

    /**
     * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a
     * list of favorite restaurants represented by strings. You need to help them find out
     * their common interest with the least list index sum.
     *
     * E.g. input(s): ["Shogun", "Tapioca Express", "Burger King", "KFC"]
     *                ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
     *      return: ["Shogun"]
     */
    public static String[] getLeastIndexSum(String[] array1, String[] array2) {
        HashMap<Integer, String> commonMap = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            int correspondingIndex = getLocation(array1[i], array2);
            commonMap.put(i + correspondingIndex, array1[i]);
        }

        int min = 1000000;
        for (Map.Entry<Integer, String> entry : commonMap.entrySet()) {
            min = (entry.getKey() < min) ? entry.getKey() : min;
        }
        return  new String[]{commonMap.get(min)};

    }

    private static int getLocation(String s, String[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array2[i].equals(s)) {
                return i;
            }
        }
        return 1000000;     // if not found
    }

//    public static void main(String[] args) {
//        String[] test1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] test2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
//        String[] test3 = {"a", "b", "c", "d"};
//        String[] test4 = {"b", "c", "d", "a"};
//        String[] result1 = getLeastIndexSum(test1, test2);
//        String[] result2 = getLeastIndexSum(test3, test4);
//        for (String s : result1) {
//            System.out.println(s);
//        }
//        for (String s : result2) {
//            System.out.println(s);
//        }
//    }

}