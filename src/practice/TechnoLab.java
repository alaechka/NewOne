package practice;

import java.util.Scanner;

public class TechnoLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls true/false if you wanna run this loop...");

        boolean isRun = scan.nextBoolean();

        while (isRun) {
            System.out.println("Fins");
            isRun = false;
        }
        // print//
        //1
        //12
        //123
        //1234
        //12345
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();


        }

        for (int i = 1; i <= 4; i++) {
            if (i == 2 || i == 3) {
                System.out.print("#" + "     " + "#");
            } else {
                for (int j = 1; j <= 4; j++) {
                    System.out.print("#" + " ");
                }


            }
            System.out.println();
        }

        /**
         *    *
         *    **
         *    *
         *    *******
         */
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            if (i == 1 || i == 3) {
                System.out.print("*");
            } else if (i == 2) {
                System.out.print("**");
            } else if (i == 4) {
                System.out.print("*******");
                break;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 3; i <= 7; i++) {
            for (int j = 3; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();

            }
            System.out.println();


        }
    }

/** первая линия,сколько раз должно печататься, вторая что должно печататься
 *
 *
 */















