package homework;

public class test {
    public static void main(String[] args) {

        int [] ggg={3,4,5,2};
        int print=znachenia(ggg);
        System.out.println(print);



        }
        public static int znachenia(int[] chisla){
        int[]myNum=chisla;
        int sum=0;
        for (int i=0; i<myNum.length;i++){
            sum+=myNum[i];
        }
        return sum;
        }





        }








