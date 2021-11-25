package work7;

public class hw7findMax {
    public static void main(String[] args) {
        int[]input1={65,98,765};
        int[]input2={65,33,987,123};

        int blabla=findmaximum(input1);
        int blabla2=findmaximum(input2);
        System.out.println(blabla);
        System.out.println(blabla2);

    }



   public static int findmaximum(int[] inputNumbers){

       int findmax1=inputNumbers[0];
       for (int i=0;i<inputNumbers.length;i++){
           if (findmax1<inputNumbers[i]) {
               findmax1 = inputNumbers[i];
           }

           }
       return findmax1;
       }

    }

