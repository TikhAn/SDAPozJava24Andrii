package Zajecia1;

import java.util.Scanner;

public class CalculatorBMI {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        double masakg = 0;
        double wzrost = 0;
        double bmi = 0;

        System.out.println("CalculatorBMI");
        System.out.println("Podaj wagy, kg:");
        masakg = czytnik.nextDouble();
        System.out.println("Podaj wzrost, m:");
        wzrost = czytnik.nextDouble();
        bmi = masakg / (wzrost * wzrost);

        System.out.println("twoj BMI: " + bmi);

        // <18.5        -> niedowaga
        // 18.5-24.99   -> waga OK
        // 25.0-29.99   -> nadwaga
        // >30          -> otyl
        if (bmi > 18.5 & bmi < 25) {
            System.out.println("Waga OK - waga w normie");
        } else {
            System.out.println("Zly wynik - waga za duza, badz za mala");
        }

        //todo Math.pov()


    }

}
