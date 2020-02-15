package Zajecia1;

import java.util.Scanner;

public class converterTemperatury {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        double stopnieC = 0;
        double stopnieF = 0;

        System.out.println("Converter Temperatury");
        System.out.println("Podaj stopnie Celsjusa:");
        stopnieC = czytnik.nextDouble();
        stopnieF = 1.8 * stopnieC + 32;

        System.out.println("Stopnie Fahrenheita: " + stopnieF + " F");

        System.out.println("Podaj stopnie Fahrenheita:");
        stopnieF = czytnik.nextDouble();
        stopnieC = (stopnieF - 32) / (1.8);

        System.out.println("Stopnie Celsiusa: " + stopnieC + " C");

    }

}
