package homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework6 {
    public static void main(String[] args) {


        // ABBREVIATION

        String sentence3 = "make america great again";
        String[] sent3split = sentence3.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i = 0; i < sent3split.length; i++) {
            abbreviation = abbreviation + sent3split[i].charAt(0); // MAKE
        }
        System.out.println("\n abbreviation 1=" +abbreviation);


        String sentence1 = "outfit of the day";
        String[] sentence1spl = sentence1.toUpperCase().split(" ");
        String abbreviation2 = "";
        for (int i = 0; i < sentence1spl.length; i++) {
            abbreviation2 += sentence1spl[i].charAt(0);
        }
        System.out.println("\n abbreviation2=" + abbreviation2);

        String sentence2 = "happy birthday to you";
        String[] sentence2split = sentence2.toUpperCase().split(" ");
        String abbreviation3 = "";
        for (int i = 0; i < sentence2split.length; i++) {
            abbreviation3 += sentence2split[i].charAt(0);
        }
        System.out.println("\n abbreviation3=" + abbreviation3);

        String sentence4 = "good morning";
        String[] sen4Sp = sentence4.toUpperCase().split(" ");
        String abbreviation4 = "";
        for (int i = 0; i < sen4Sp.length; i++) {
            abbreviation4 += sen4Sp[i].charAt(0);

        }
        System.out.println("\n Abbreviation4="+ abbreviation4);

        String sentence5 = "happy new year";
        String[] sentence5spl = sentence5.toUpperCase().split(" ");
        String abbreviation5 = "";
        for (int i = 0; i < sentence5spl.length; i++) {
            abbreviation5 += sentence5spl[i].charAt(0);
        }
        System.out.println("\n abbreviation 5=" + abbreviation5);

        String sentence6 = "happy birthday to you dear";
        String[] sentence6spl = sentence6.toUpperCase().split(" ");
        String abbreviation6 = "";
        for (int i = 0; i < sentence6spl.length; i++) {
            abbreviation6 += sentence6spl[i].charAt(0);

        }
        System.out.println("\n abbreviation 6=" + abbreviation6);

        String sentence7 = "happy new year to you dear";
        String[] sentence7spl = sentence7.toUpperCase().split(" ");
        String abbreviation7 = "";
        for (int i = 0; i < sentence7spl.length; i++) {
            abbreviation7 += sentence7spl[i].charAt(0);
        }
        System.out.println("\n abbreviation 7=" + abbreviation7);

        // 3 Reverse a String


        String[] word1 = {"Learn"};
        String[] word2 = {"More", "Learn"};  // more i=1 , [0]..// learn i=2, [1]
        String[] word3 = {"happy", "birthday", "to", "you"};


        System.out.println("\n reversed order 1");
        for (int i = 1; i <= word1.length; i++) {
            System.out.println(word1[i - 1]);

        }


        System.out.println("\n reversed order 2");
        String order2 = "";

        for (int i = 1; i <= word2.length; i++) {

            order2 += word2[word2.length - i] + " ";

        }
        System.out.println(order2);

        System.out.println("\n reversed order 3");
        String order3 ="";

        for (int i = 1; i <= word3.length; i++) {

            order3+=word3[word3.length-i]+ " ";
        }
        System.out.println(order3);



        /// Q3 Change the given sentence in titlecase

        // HappY nEW YEAR to YoU dEAr--> Happy New Year To You Dear
        // gooD morNING--> Good Morning
        //  make AMERICA GreAT AgAin--> Make America Great Again


        String Example1 = "HappY nEW YEAR to You dEAr";
        String Example1ToLowCase = Example1.toLowerCase();
        System.out.println("\n print " + Example1ToLowCase);

        String[] SplitExample1toLowCase = Example1ToLowCase.split(" ");

        String store = "";
        for (int i = 0; i < SplitExample1toLowCase.length; i++) {
            store += SplitExample1toLowCase[i].substring(0, 1).toUpperCase() + SplitExample1toLowCase[i].substring(1) + " ";

        }
        System.out.println("\n Example1=" + store);

        //gooD morNING--> Good Morning

        String example2 = "gooD morNING";
        String example2toLowCase = example2.toLowerCase();
        String[] example2Split = example2toLowCase.split(" ");
        String store1 = "";
        for (int i = 0; i < example2Split.length; i++) {
            store1 += example2Split[i].substring(0, 1).toUpperCase() + example2Split[i].substring(1) + " ";

        }
        System.out.println("\n Example 2=" + store1);



        String example3 = "make AMERICA GreAT AgAin";
        String example3ToLowcase = example3.toLowerCase();
        String[] example3split = example3ToLowcase.split(" ");
        String store6 = "";
        for (int e = 0; e < example3split.length; e++) {

            store6 += example3split[e].substring(0,1).toUpperCase()+example3split[e].substring(1).toLowerCase()+" ";
        }
        System.out.println("\n Example 3="+ store6);

        int[] findMax = {45, 76, 98, 2, 54, 67};
        int max = findMax[0];
        for (int i = 0; i < findMax.length; i++) {
            if (max < findMax[i]) {
                max = findMax[i];

            }
        }

        System.out.println("\n max=" + max);


        int[] findMax2 = {65, 87, 209, 342, 564, 76};
        int max2 = findMax2[0];
        for (int d = 0; d < findMax2.length; d++) {
            if (max2 < findMax2[d]) {
                max2 = findMax2[d];

            }
        }
        System.out.println("\n Max2= " + max2);


        int[] findMax3 = {65, 12, 9, 765, 3332, 98};
        int max3 = findMax3[0];
        for (int c = 0; c < findMax3.length; c++) {
            if (max3 < findMax3[c]) {
                max3 = findMax3[c];
            }
        }
        System.out.println("\n max3=" + max3);

    }
}























