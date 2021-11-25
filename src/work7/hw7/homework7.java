package work7.hw7;


import java.util.Arrays;
// create abbreviation

public class homework7 {
    public static void main(String[] args) {
        String top=abbreviation("make america great again");
        String top2= abbreviation("outfit of the day");
        String top3= abbreviation("Happy birthday to you");

        System.out.println(top+" ," +top2+"," +top3);


    }


    public static String abbreviation(String abr) {
        String[] msgOut = abr.toUpperCase().split(" ");
        String msg="";
        for (int i=0; i< msgOut.length;i++) {
            msg+=msgOut[i].charAt(0);


        }

        return msg;
    }







    }



