package homework.December.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hw9_3 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String[] myArray = {"sun", "house", "house", "dog", "cat", "cat"};
        myList.add("sun");
        myList.add("house");
        myList.add("house");
        myList.add("dog");
        myList.add("cat");
        myList.add("cat");
        int length = myList.size();
        System.out.println(length);
        System.out.println(myList);
        for (int i = 0; i <= myList.size() - 1; i++) {
            String data = myList.get(i);
            if (myList.indexOf(data) != myList.lastIndexOf(data)) {
                List<String> printList = Arrays.asList(data);
                System.out.print(printList);


            }


        }


    }

    public List<String> findDuplc(String[] inputArray) {
        List<String>inPut=Arrays.asList(inputArray);
        for (int i = 0; i <= inPut.size() - 1; i++) {
            String data = inPut.get(i);
            if (inPut.indexOf(data) != inPut.lastIndexOf(data))
             {List<String> forReturn=Arrays.asList(data);
                return forReturn;
            }

        }

        return inPut;
    }
}









