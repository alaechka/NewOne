package homework.December.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hw11 {


    //Try to submit code by creating a merge request.
    //     *
    //     * Create a method that will return a timeline of given input data-points
    //     * -> timeline should be (hour am/pm) with 2 hour interval from the current time.
    //     *
    //     *
    //     * generateTimeline(5)
    //     * // 8pm 10pm 12am 2am 4am
    //     *
    //     * generateTimeline(7)  // if running code at 3:12pm
    //     * // 3pm 5pm 7pm 9pm 11pm 1am 3am
    //     *
    //     * generateTimeline(10)     // running code at 2:45am
    //     * // 2am 4am 6am 8am 10am 12pm 2pm 4pm 6pm 8pm
    //     *
    //     */


    public static void main(String[] args) {

        Date now=new Date();
        System.out.println(now);
        SimpleDateFormat df= new SimpleDateFormat("H a");
        String amPm=df.format(now);
        System.out.println(amPm);

        Date currDate= new Date();
        SimpleDateFormat dateOnly= new SimpleDateFormat("d");
        String dateString=dateOnly.format(currDate);
        System.out.println(dateString);
        int dateInteger=Integer.valueOf(dateString);
        if(dateInteger<15) {
            System.out.println("\n djjdjd");
        }else{
                    System.out.println("hfhfh");
            }

        String dateText="12/28/20 9:15:22 pm";
        SimpleDateFormat makeDate=new SimpleDateFormat("MM/dd/yy h:m:s a");
        try {
            Date newDate=makeDate.parse(dateText);
            System.out.println("date after-"+newDate);
            boolean eq=now.equals(newDate);
            System.out.println(eq);

        }catch (ParseException e){
            e.printStackTrace();


        }

        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        //to create Date-oBject using Calendar instsnce: method: getTime//rt :Date
        Date fromCal=cal.getTime();
        System.out.println(fromCal);

        // to create Calendar using Date object methos setTime

        //

        Date HwDate=new Date();
        SimpleDateFormat hwD=new SimpleDateFormat("h a");
        String HwHour=hwD.format(HwDate);
        System.out.println(HwHour);

        Calendar hwCal=Calendar.getInstance();
        hwCal.setTime(HwDate);
        hwCal.add(Calendar.HOUR,2);
        Date myHours=hwCal.getTime();
        String plustwo=hwD.format(myHours);
        System.out.println(plustwo);


        }

    }
