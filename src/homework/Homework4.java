package homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {
        // print the length of country name.

        String Country= "USA";
        System.out.println("country=" +Country);

        String[] SplitUsa= Country.split("");
        System.out.println("\n Split Country name=" + Arrays.toString(SplitUsa));

        int LengthOFCountry= SplitUsa.length;
        System.out.println("\n Length of Country USA=" +LengthOFCountry);

        // Print numbers of words in Sentence 2

        String Sentence2= "Health was earlier said to Be the ability of the bode functioning Well.";
        String[] SplitSentence2= Sentence2.split(" ");
        System.out.println("\n Split Sentence2="+ Arrays.toString(SplitSentence2));

        int NumbersOfWords2=SplitSentence2.length;
        System.out.println("\n Numbers of words in Sentence 2=" + NumbersOfWords2);



        //
        //  Create abbreviation "make america great again"

         String name1= "Make America great again";
         String NameToUc= name1.toUpperCase(Locale.ROOT);
        System.out.println("\n Name to upper case="+ NameToUc);

        String[] SplitNametoUc=NameToUc.split(" ");
        // Find length to know how many indexes we have in sentence
        int lengthOfName1= SplitNametoUc.length;
        System.out.println("\n length of sentence Name1="+lengthOfName1);
        int lastindexName1=lengthOfName1-1;
        System.out.println("\n Last index of sentence Name1="+lastindexName1);

        // Indexes from o to 3

        System.out.println("\n First index of sentence Name1=" + SplitNametoUc[0]);
        // second index Name 1
        System.out.println("\n Second index of sentence Name1=" + SplitNametoUc[1]);
        // third index of name 1
        System.out.println("\n third  index of Sentence Name1=" + SplitNametoUc[2]);
        //fourth index name 1
        System.out.println("\n  fourth index of Sentence Name1=" + SplitNametoUc[3]);

        // first indexes of Each word
        Character IndexMake= SplitNametoUc[0].charAt(0);
        System.out.println("\n 0Index Make="+IndexMake);

        Character IndexAmerica=SplitNametoUc[1].charAt(0);
        System.out.println("\n 0Index America="+IndexAmerica);

        Character IndexGreat= SplitNametoUc[2].charAt(0);
        System.out.println("\n 0Index great="+IndexGreat);

        Character IndexAgain= SplitNametoUc[3].charAt(0);
        System.out.println("\n 0Index Again="+IndexAgain);

        System.out.println("\n Abbrevietion="+IndexMake+IndexAmerica+IndexGreat+IndexAgain);







    }










}
