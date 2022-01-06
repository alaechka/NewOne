package homework.December.hw1;

import java.util.*;

public class hw10 {


    public static void main(String[] args) {

        hw10 dom=new hw10();
        Map<Integer,String> inputMap= new HashMap<>();
        inputMap.put(102,"f");
        inputMap.put(107,"hj");
        inputMap.put(108,"hj");
        inputMap.put(101,"fjjj");
        inputMap.put(110,"hj");
        Map<Integer,String>ftftft=dom.returnDuplicatedValuesWithKeys(inputMap);

        System.out.println(ftftft);

    }
    public Map<Integer, String> returnDuplicatedValuesWithKeys(Map<Integer, String> inputMap) {
        Set<String> inputSet = new HashSet<>();
        for (Integer key : inputMap.keySet()) {
            inputSet.add(inputMap.get(key).toLowerCase(Locale.ROOT));
        }

        for (String str : inputSet) {
            int counter = 0;
            String resultString = "";
            for (Integer key : inputMap.keySet()) {
                if (str.equalsIgnoreCase(inputMap.get(key))) {
                    counter++;
                    resultString = resultString + key + ", ";
                }
            }
            if (counter > 1) {
                System.out.println(str + " is present with: " + resultString.substring(0, resultString.length() - 2));
            }
        }

        return inputMap;
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


