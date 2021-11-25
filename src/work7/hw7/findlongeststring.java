package work7.hw7;

import java.util.Arrays;

public class findlongeststring {

    public static void main(String[] args) {
        String[] wehave={"happy", "happy new year", "peaceful", "king kong"};

        int find=wehave[0].length();
        String ggg=" ";
        for (int i=0; i<wehave.length;i++){
            if (find<wehave[i].length()){
                find=wehave[i].length();
                ggg+=find;
            }

        }
        System.out.println(ggg);

    }
}
