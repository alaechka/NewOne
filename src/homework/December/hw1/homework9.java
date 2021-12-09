package homework.December.hw1;

import java.util.*;

public class homework9 {

    public static void main(String[] args) {
        String getAnswer = duplicate("mw,apple,sun,visa,home,november,apple,home,code");
        String getAnswer2=duplicate("work,job,apple,cheese,apple,home,cheese");
        String getAnswer3=duplicate("home,job,java");
        System.out.println("\n Does given array contain duplicates data? --->"+getAnswer3);

        //question: why I can not to do the same process with String[]?
        //Java does not allow to store any String [] in lines 8,9,10 after word "thisWords",even if I cre-
        //--ate method "public static String duplicate(String [] thisWords) {" insted of
        //public static String duplicate(String thisWords) {
    }
    public static String duplicate(String thisWords) {
        String newMy[]=thisWords.split(",");

        List<String>words_list=Arrays.asList(newMy);

        int listLength=words_list.size();

        Set<String>words_new= new HashSet<>(words_list);
        int setLength=words_new.size();

        boolean compare=listLength!=setLength;
        final String answer=compare? "Yes":"No";
        return answer;

    }


    }

















    // create a method that can find if the given array has any duplicates data or not

    //list using array //convert array into list, convert list into set//first find length of array
    //after find length of set if they are different it means yes

    //apple, sun, home,visa,apple,november, home,code,window

    // task 2 . create a method that would return the values occurring more than one time in given string-array
    //String [] words={"bla bla bla"};
    //convert Array into list
    //indexOf,lastIndexOf// если первый индекс слова и последний индекс слова не совпадают
     //знчит эти слова нужно вывести в ретерн
    //add// чтобы стор валью повторяющихся слов в лист нужно использовать адд метод
    //if
    //for





