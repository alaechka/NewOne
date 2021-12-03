package practice;

import javax.naming.InvalidNameException;
import java.nio.channels.NotYetBoundException;
import java.util.Scanner;

public class Institute {
    public static void main(String[] args) {


        //устанавливаем отношения между классами
        Students s1 = new Students();
        s1.enroll("Alina", 27, "DE","QA");
        System.out.println();
        s1.showID(1);

        Students s2=new Students();
        s2.enroll("Ksenia",15, "NY","Dev");

        System.out.println();
        Students s3=new Students();
        s3.enroll("Evgenia",26,"FL","PA");








        //
    }

}
