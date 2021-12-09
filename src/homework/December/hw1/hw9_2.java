package homework.December.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw9_2 {

    public List<String> findDuplc(String[] inputArray) {
        List<String[]> inPut = new ArrayList<>();
        inPut.add(inputArray);
        for (int i = 0; i <= inPut.size() - 1; i++) {
            String[] data = inPut.get(i);
            if (inPut.indexOf(data) != inPut.lastIndexOf(data)) {
                List<String> printList = Arrays.asList(data);
                System.out.print(data);
                return Arrays.asList(data);


            }
        }
        return null;
    }
}
