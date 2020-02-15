package Zajecia2;

import java.util.Scanner;

public class CalculatorBMI_2 {
    public static void main(String[] args) {
        System.out.println("CalculatorBMI IF Else");

        float masakg = 0;
        float wzrost = 0;
        double bmi = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wagy, kg:");
        masakg = scan.nextFloat();
        System.out.println("Podaj wzrost, m:");
        wzrost = scan.nextFloat();
        bmi = masakg/Math.pow(wzrost, 2);
// wersja bez Math.pow      bmi = masakg /(wzrost * wzrost);
        System.out.println("twoj BMI: " + bmi);

        // <18.5        -> niedowaga
        // 18.5-24.99   -> waga OK
        // 25.0-29.99   -> nadwaga
        // >30          -> Otylosc
        if (bmi <= 18.5) {
            System.out.println("Waga zbytniska");
        } else if  (bmi<25 ) {
            System.out.println("-waga OK");
        } else if (bmi<30 ) {
            System.out.println("-nadwaga");
        } else {
            System.out.println("-nadwaga2 _ Otylosc");
        }
        System.out.println("Koniec programu...");
    }
}
