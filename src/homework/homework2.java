package homework;

public class homework2 {
    public static void main(String[] args) {
        // convert Deg-Celsius into deg-Fahrenheit
        /**
         * ft = (cT × 9/5) + 32
         * cT=1
         * ft=95
         */
        double cTemp=0;
        double fTemp= (cTemp*1.8)+32;
        System.out.println("\nFahrenheit into celsius = "+fTemp);

        /// convert Deg-celsius into kelvin

        /**
         * cT=1
         * kT=308,15
         * kT=cT + 273.15
         */

        double kTemp= cTemp+273.15;
        System.out.println("\nKelvin into celsius = "+kTemp);

        //convert fahrenheit into celsius
        /** tF=0
         * tC=-17,2
         * cT= tF-32*5/9
         */
        double tFah=0;
        double cTem=tFah-32*5/9;
        System.out.println("\nCelsius into Fahrenheit ="+cTem);

        // convert fahrenheit into kelvins

        /** tF=0
         * tK=255,3
         * tK=(tF+459,67)*5/9
         */
        double kelTemp=(tFah+459.67)*5/9;
        System.out.println("\nKelvins into Fahrenheith ="+kelTemp);

        // convert Kelvins into celsius

        /** tK=0
         * tC=273,15
         * tC=tK-273,15
         */
        double kelvTemp=0;
        double celInkel= kelvTemp-273.15;
        System.out.printf("\nCelsius into Kelvins ="+celInkel);

        //convert kelvins into fahrenheit

        /** tk=0
         * tf=-459,67
         * tf=tK*9/5-459,67
         */
        double fahInKel= kelvTemp*9/5-459.67;
        System.out.println("\nFahrenheits into Kelvins ="+fahInKel);












    }
}



