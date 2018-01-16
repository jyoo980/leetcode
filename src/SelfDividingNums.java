import java.util.LinkedList;
import java.util.List;

public class SelfDividingNums {

    /**
     * 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     * Also, a self-dividing number is not allowed to contain the digit zero.Given a lower and upper number bound,
     * output a list of every possible self dividing number, including the bounds if possible.
     *
     */
    public static List<Integer> getSelfDividingNums(int lower, int upper) {
        List<Integer> selfNums = new LinkedList<>();

        for (int i = lower; i <= upper; i++) {
            if (isSelfDividing(i)) {
                selfNums.add(i);
            }
        }
        return selfNums;
    }

    private static boolean isSelfDividing(int num) {
        String tmp  = Integer.toString(num);

        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.contains("0") || num % (tmp.charAt(i) - '0') != 0 || tmp.charAt(i) == '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getSelfDividingNums(1, 22));
        System.out.println(getSelfDividingNums(1, 128));
    }

}