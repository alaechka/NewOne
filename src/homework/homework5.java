package homework;

public class homework5 {
    public static void main(String[] args) {

        // task 1.
        // if number divisible by 5
        int number = 105;
        String condition1 = "Divisible by 5";

        if (number % 5 == 0) {
            System.out.println("\n" + condition1);
        }

        // if number divisible by 3
        String condition2 = "Divisible by 3";
        if (number % 3 == 0) {
            System.out.println("\n" + condition2);
        }

        // if number is divisible by 5 and by 3 print "Divisible by 5 and3"

        String condition3 = "Divisible by 5 and 3";

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("\n " + condition3);

        }

        // if number is not divisible by 5,3 or 15 Print the value in int ver.

        String condition4 = "105";
        if (number % 5 != 0 && number % 3 != 0 && number % 15 != 0) {
            System.out.println("\n" + condition4);
        }

        //Task 2.

        double StudentScore = 85.00;
        int MaxScore = 100;
        double ScoringPercentage = StudentScore / MaxScore * 100;

        System.out.println("\n Scoring Persantage="+ ScoringPercentage);

        if (ScoringPercentage<=100 && ScoringPercentage>=91) {
            System.out.println("\n GradeA");
        } else if (ScoringPercentage<=90.99 && ScoringPercentage>=81) {
            System.out.println("\n Grade B");
        } else if (ScoringPercentage<=80.99&& ScoringPercentage>=71) {
            System.out.println("\n Grade C");
        } else if (ScoringPercentage<=70.00 && ScoringPercentage>=61) {
            System.out.println("\n Grade D");
        } else {
            System.out.println("\n Invalid student score entered");




        }





        }







        }
