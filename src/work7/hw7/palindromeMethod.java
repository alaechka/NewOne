package work7.hw7;

public class palindromeMethod {
    public static void main(String[] args) {
        boolean abc=zoo("level");
        boolean abc1=zoo("sent");
        System.out.println(abc);
        System.out.println(abc1);
    }

    public static boolean zoo(String sent1){
        String first=sent1;
        String[] word=first.split("");
        String word1="";
        for (int i=1; i<= word.length;i++){
            word1+=word[word.length-i];

        }
        boolean compare=first.equals(word1);
        return compare;

    }

}
