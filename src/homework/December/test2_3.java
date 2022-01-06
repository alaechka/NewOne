package homework.December;

import java.sql.Array;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class test2_3 {

    public static void main(String[] args) {
        String[] array1 = {"happY", "king", "peace", "living standard"};
        String[] array2 = {"king kong", "Happy", "PEACE"};
        Set<String> fdf=printCommon(array1,array2);
        System.out.println(fdf);

        String[] array3= {"ab","abcd","abc","abcde","defg","koli"};
        String[] array4={"abcde","jhuy", "plot","koli"};
        Set<String>fdf1=printCommon(array3,array4);
        System.out.println(fdf1);


    }

    public static Set printCommon(String[] array1, String[] array2) {
         Set<String>newSet= new HashSet<>();
        for (String fromArray1 : array1) {
            for (String fromArray2 : array2) {
                if (fromArray1.equalsIgnoreCase(fromArray2)) {
                    newSet.add(fromArray1.toLowerCase(Locale.ROOT));

                }
            }
        } return newSet;
    }
}




