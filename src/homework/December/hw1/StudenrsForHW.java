package homework.December.hw1;

import apple.laf.JRSUIConstants;
import com.sun.codemodel.internal.JCatchBlock;
import com.sun.org.apache.xml.internal.utils.XMLStringFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudenrsForHW {

    //Properties
    String name;
    static int studentID = 0;
    int age;
    String state;
    String courseName;
    String[] courseNames = {"Dev", "QA", "PA"};
    Scanner input = new Scanner(System.in);


    public void newenroll() {

        System.out.println("please enter your age");
        int ageLocal = input.nextInt();
        if (ageLocal < 16) {
            System.out.println("Sorry, you are under age.");
        } else {
            age = ageLocal;
            boolean isCourseValid = false;
            System.out.println("please enter your course name");
            String courseNameLocal = input.next();
            for (String myNmae : courseNames) {
                if (myNmae.equalsIgnoreCase(courseNameLocal)) {
                    isCourseValid = true;
                    courseName = courseNameLocal;
                    System.out.println("Please enter your name");
                    name = input.next();
                    System.out.println("please enter your state");
                    state = input.next();
                    studentID++;
                    break;
                } else {
                    isCourseValid = false;
                }
            }
            if (isCourseValid) {
                System.out.println("Welcome " + name);
            } else {
                System.out.println("incorrect course name");

            }
        }
    }


    public void enroll(String sName, int sAge, String sState, String sCourseName) {

        System.out.println("please enter your age:");
        int hAhe = input.nextInt();
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

    public void changeState() {

        try {

            Scanner input = new Scanner(System.in);
            System.out.println("would you like to change your state?");
            input.next();
            System.out.println("please enter your state");
            String nstate = input.next(state);
            if (nstate.equalsIgnoreCase(state)){
                System.out.println("You entered previous state,please,try again:");
                nstate=input.next(state);
                if (nstate.equalsIgnoreCase(state)){
                    System.out.println("You entered previous state,please try again. one last try left:");
                    nstate=input.next(state);
                    if (nstate.equalsIgnoreCase(state)){
                        System.out.println("You are blocked,sorry");
                    }
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("welcome to new state");


        }
    }



















        public void showSummery () {
            System.out.println("\n****\nStudent summary ***\nName: " + name + "\nAge :" + age + "\nState:" + state + "\nCourse name:" + courseName + "\nStudent ID:" + studentID);
        }

        public void showID ( int id){
            if (id == studentID) {
                System.out.println("Name: " + name + "\nAge :" + age + "\nState:" + state + "\ncourse name:" + courseName + "\n Student ID:" + studentID);
            } else {
                System.out.println("incorect ID");


            }

        }
    }


/**
 * changeState
 *         make user of scanner class to make change state flow interactive
 *         return type - No
 *
 *         Requirement:
 *             New state name should NOT be same as already in the system.
 *             If student enters new state same as the already registered one, show relevant error msg
 *
 *         Note: Handle relevant exceptions
 */



