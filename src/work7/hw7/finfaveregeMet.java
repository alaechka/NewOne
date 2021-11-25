package work7.hw7;

public class finfaveregeMet {

    public static void main(String[] args) {
        int[] numb1={65,87,98,4};
        int[] numb2={54,98,6,76};
        double create=findAverege(numb1);
        double create2=findAverege(numb2);
        System.out.println(create);
        System.out.println(create2);

    }







    public static double findAverege(int[] putnumbers) {
        int[] mynum = putnumbers;
        double convertNum = 0;
        for (int i = 0; i < putnumbers.length; i++) {
            convertNum = convertNum + putnumbers[i];
        }

double convertMynum=convertNum/ putnumbers.length;
        return convertMynum;
    }
}

