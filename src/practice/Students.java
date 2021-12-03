package practice;

import apple.laf.JRSUIConstants;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Students {

    //Properties
    String name;
    static int studentID = 0;
    int age;
    String state;
    String courseName;
    String[] courseNames = {"Dev", "QA", "PA"};

    public void enroll(String sName, int sAge, String sState, String sCourseName) {
       Scanner input=new Scanner(System.in);

        if (sAge < 16) {
            System.out.println("Sorry, you are under age.");


        } else {

            boolean isCourseValid = false;
            for (String cName : courseNames) {
                if (cName.equalsIgnoreCase(sCourseName)) {
                    isCourseValid = true;
                    name = sName;
                    age = sAge;
                    state = sState;
                    studentID++;
                    courseName = sCourseName;

                    break;
                } else {
                    isCourseValid = false;
                }
            }
            if (isCourseValid) {
                System.out.println("Welcome" + sName);
            } else {
                System.out.println("incorrect course name ");
            }
        }
    }


    //change name
    //input new name
    //return type -no

    public void changeName(String newName) {
        name = newName;

    }

    public void changeState(String newState) {
        state = newState;
    }

    public void showSummery() {
        System.out.println("Name: " + name + "\n Age :" + age + "\nState:" + state + "\ncourse name:" + courseName + "\n Student ID:" + studentID);
    }

    public void showID(int id) {
        if (id == studentID) {
            System.out.println("Name: " + name + "\n Age :" + age + "\nState:" + state + "\ncourse name:" + courseName + "\n Student ID:" + studentID);
        } else {
            System.out.println("incorect ID");


        }

    }

}






    //show Summery



