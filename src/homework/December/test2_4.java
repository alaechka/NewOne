package homework.December;

import java.util.Arrays;
import java.util.HashSet;

public class test2_4 {
    /**
     * Ques-4:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     * points: 40
     */

    public static void main(String[] args) {
        int[] numbers = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        Arrays.sort(numbers);
        HashSet<Integer> set = new HashSet<>();

        for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
            set.add(i);
        }

    }
}