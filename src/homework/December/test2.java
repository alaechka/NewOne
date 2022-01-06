package homework.December;

public class test2 {

    /**
     * Ques-1:
     * Create a method to return a max value from an input-int-array
     * points: 10
     */

    public static void main(String[] args) {
        int[] input1 = {32, 54, 12, 67, 2, 5};
        int[] input2 = {5, 4, 3, 1, 2};
        int[] input3 = {90, 34, 12, 4};
        int[] input4 = {-15, -4, -12, -7};
        int ex1 = findit(input1);
        int ex2 = findit(input2);
        int ex3 = findit(input3);
        int ex4 = findit(input4);
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println(ex4);
    }

    public static int findit(int[] inputNumbers) {

        int findmax1 = inputNumbers[0];
        for (int i = 0; i < inputNumbers.length; i++) {
            if (findmax1 < inputNumbers[i]) {
                findmax1 = inputNumbers[i];
            }

        }
        return findmax1;

    }
}









