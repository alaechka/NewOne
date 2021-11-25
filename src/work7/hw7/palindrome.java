package work7.hw7;

public class palindrome {


    public static void main(String[] args) {
        String first = "level";
        String[] word = first.split("");
        String word1 ="";
        for (int i = 1; i <= word.length; i++) {
            word1 += word[word.length - i];






            }
            System.out.println(word1);
        boolean compare=first.equals(word1);
        System.out.println(compare);



        }

    }

