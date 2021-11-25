package work7;

public class HW7ReverseString {
    public static void main(String[] args) {
        String input1=reverse("more learn");
        String input2=reverse("happy birthday to you");
        String input3=reverse("learn");

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }


    public static String reverse(String example) {
        String[] SplitExample = example.split(" ");
        String returnExample = "";
        for (int i = 1; i <= SplitExample.length; i++) {
            returnExample += SplitExample[SplitExample.length - i] + " ";

        }
        return returnExample;

    }
}