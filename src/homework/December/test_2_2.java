package homework.December;

public class test_2_2 {

    public static void main(String[] args) {
        int input11=5;
        int input12=1;
        int input13=3;
        int input14=10;
        int num1=factorial(input11);
        int num2=factorial(input12);
        int num3=factorial(input13);
        int num4=factorial(input14);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }


    public static int factorial(int number){
        int find=1;
        for (int i=1; i<=number; i++){
            find=find*i;
        }
        return find;
    }


}
/**
 * Ques-2:
 * Create a method to return factorial value of input-int-value
 * points: 20
 */
/*
 *
 * eg:
 * input -> 5
 * returned value -> (5*4*3*2*1) = 120
 *
 *
 * input -> 1
 * returned value -> (1) = 1
 *
 * input -> 3
 * returned value -> (3*2*1) = 6
 *
 * input -> 10
 * returned value -> (10*9*8*7*6*5*4*3*2*1) = 3628800
 */


