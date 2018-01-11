public class FizzBuzz {

    /**
     * Write a program that outputs the string representation of numbers from 1 to n.
     * But for multiples of three it should output “Fizz” instead of the number and for the multiples
     * of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
     *
     */
    public static String fizzBuzz(int cap) {
        StringBuilder result = new StringBuilder("");

        for (int i = 1; i <= cap; i++) {
            if (i % 15 == 0) {
                result.append(" FizzBuzz");
            } else if (i % 5 == 0) {
                result.append(" Buzz");
            } else if (i % 3 == 0) {
                result.append(" Fizz");
            } else {
                result.append(" " + Integer.toString(i));
            }
        }
        return result.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(fizzBuzz(15));
//    }

}