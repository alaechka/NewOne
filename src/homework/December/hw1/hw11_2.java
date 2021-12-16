package homework.December.hw1;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hw11_2 {

    public static void main(String[] args) {
        Date hwDate = new Date();
        SimpleDateFormat dayfor = new SimpleDateFormat("H");
        String dayForString = dayfor.format(hwDate);
        int input=5;

        Calendar cal = Calendar.getInstance();
        //cal.setTime(hwDate);
        for (int i = 0; i < input * 2; i++) {
            if (i % 2 == 0) {
                cal.setTime(hwDate);
                cal.add(Calendar.HOUR, i);
                Date other = cal.getTime();
                System.out.println(other);
            }


        }
    }
}