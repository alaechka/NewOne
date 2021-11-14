package homework;

import com.sun.tools.javac.util.Convert;
import sun.awt.SunHints;

import java.util.Locale;

public class homework3 {
    public static void main(String[] args) {

        // Store 100 in result1 if the length of sentence1 is greater then or equal to 10
        //else store 150 in result1


        String Sentence1= "Hello dear, how are you doing?";
        int LengthOfSen1= Sentence1.length();
        int result1= LengthOfSen1>=10?100:150;
        System.out.println("\nResult1=" +result1);



        // replace all instance of a/A with Z



        String sentence2="Health was earlier said to Be the ability of the body functiong WELL.";

        String sentenceReplace_a_Z= sentence2.replace("a","Z");
        System.out.println("\n After replace -> " +sentenceReplace_a_Z);
        System.out.println("Original-> "+sentence2);

        // pseudo
        String NewsentenceUP2=sentence2.toUpperCase();
       String AfterReplace= NewsentenceUP2.replace("A", "Z");
        System.out.println("\n After replace a/A-->" +AfterReplace);


        String  replaceThis ="a"; String replaceWith ="Z";
        String sentence2toLowercase= sentence2.toLowerCase();
        String replaceThisLowercase= replaceThis.toLowerCase();
        String Sentence2Replace = sentence2toLowercase.replace(replaceThisLowercase,replaceWith);
        System.out.println("\n New replace ---> " +Sentence2Replace);



        // find char at last index of Sentence2

        int lengthSent2 = sentence2.length();
        int lastIndSent2= lengthSent2-1;
        System.out.println("\n Last index Sent2--> "+ lastIndSent2);

        char charAtLasIN= sentence2.charAt(lastIndSent2);
        System.out.println("\n Char at last index of Sent2-->"+ charAtLasIN);


        //find index of "said" in sentence 2

        int IndexOfSaid= sentence2.indexOf("said");
        System.out.println("\n Index of said in sentence 2--> "+IndexOfSaid);

        ////////////////

        String Sentence3="Health was earlier said to Be the ability of the body functioning WELL.";

        // Find Length of the Sentence 3.

        int LengthSent3=Sentence3.length();
        System.out.println("\n The length of "+Sentence3+"=" +LengthSent3);

        //Find index of "body" in Sentence 3

        int IndexOfBody=Sentence3.indexOf("body");
        System.out.println("\n Index of body in sentence3=" +IndexOfBody);

     // Result if Sentence 3 contains "Body" (ignoring case)

        boolean res1 = Sentence3.toLowerCase().contains("Body".toLowerCase());

        System.out.println("\n Is sentence 3 contains Body?=" + res1);

        // OR

        boolean res2 = Sentence3.toUpperCase().contains("Body".toUpperCase());
        System.out.println("\n Does sentence 3 contains Body?=" + res2);

        // result if Sentence 3 Starts with Health (Ignoring Cases)

        boolean StartWithHealthSent3= Sentence3.toLowerCase().startsWith("Health".toLowerCase());
        System.out.println("\n Does sentence 3 start with Health?="+ StartWithHealthSent3);









        //













    }
}


