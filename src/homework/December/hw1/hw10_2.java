package homework.December.hw1;

import java.util.*;

public class hw10_2 {

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
        public Map<String,Integer> working (String[]myWords){
            List<String> words = Arrays.asList(myWords);
            Map<String, Integer> example = new HashMap<String, Integer>();
            for (int i = 0; i < words.size(); i++) {
                String data = words.get(i);
                if (!example.containsKey(data)) {
                    example.put(data,1);
                } else {
                    example.put(data, example.get(data) + 1);
                }
            }
            for (Map.Entry<String, Integer> entry : example.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }


            return example;
        }
    }




