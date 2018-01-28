import java.util.HashMap;
import java.util.HashSet;

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
        HashMap<String, Integer> commonMap = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            int correspondingIndex = getLocation(array1[i], array2);
        }
    }

    private static int getLocation(String s, String[] array2) {
        return 0;
    }

    public static void main(String[] args) {

    }

}