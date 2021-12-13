package homework.December.hw1;

import java.util.*;

public class hw10 {
    //*
    //     * Question-1:
    //     * Create a hashMap with any numbers of key-value pairs from the user
    //     * Key should be Integer
    //     * Value should be String
    //     *
    //     * Create method that will print the keys with same value
    //     *
    //     * Input to method -> [ {101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"} ]
    //     * Output (print) ->
    //     *      "happy" is present with 101, 103, 106 keys
    //     *      "peace" is present with 102, 105 keys
    //     *
    //     * Input to method -> [ {111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"} ]
    //     * Output (print) ->
    public static void main(String[] args) {


        HashMap<Integer, String> numbersNames = new HashMap<>();
        numbersNames.put(101, "happy");
        numbersNames.put(102, "peace");
        numbersNames.put(103, "sun");
        numbersNames.put(104, "learn");
        numbersNames.put(105, "peace");
        numbersNames.put(106, "happy");
        numbersNames.put(107, "sun");

        Map<Integer, String> empty = new HashMap<>();

            for (Map.Entry<Integer, String> entry : numbersNames.entrySet()) {
                if (empty.containsKey(entry))
                    System.out.println(entry.getKey());
                //System.out.println(entry.getValue());


                //Collection<String> zzz=numbersNames.values();
                //System.out.println(zzz);
                //String gfg=zzz.toString();
                //String[] split=gfg.split(",");
                //List<String> zzz=Arrays.asList(split);
                //for (Map.Entry myEntry:numbersNames.entrySet())
                // myEntry.getValue();
                //String gfg=;
                // String[] split=gfg.split(",");
                // List<String> zzz=Arrays.asList(split);
                //for (int i=0;i<.size();i++){
                // String data=zzz.get(i);
                // if (zzz.indexOf(data)!=zzz.lastIndexOf(data)){
                // List<String>print=Arrays.asList(data);
                // System.out.println(myEntry.getKey());

            }

        }
    }
























            //
            //    /**
            //     * Question-2:
            //     * Create a method, that will return all duplicates values with count from the given List<String>
            //     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
            //     * Output:
            //     *      happy - 2
            //     *      joy - 3
            //     *      laugh - 2
            //     *
            //     *      Map<String, Integer>
            //     */
            //
            //
            //    /**
            //     * Question-3:
            //     *
            //     * Create a method that will take String-array as input
            //     *
            //     * Method should return the name(s) of color present max number of times in given String array
            //     *
            //     * If there is a color with maximum count, return the color name
            //     * If there are two or more colors with same number, return all
            //     *
            //     * Hint: return type as Set<String> or List<String>
            //     *
            //     */
            //    String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
            //            "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
            //            "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
            //            "green", "green"};
            //
            //}


