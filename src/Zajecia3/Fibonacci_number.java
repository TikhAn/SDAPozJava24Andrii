package Zajecia3;

import java.util.Scanner;

public class Fibonacci_number {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj Fibonacci_number:");
        int f = czytnik.nextInt();

        int fib0 = 0;
        int fib1 = 1;
        int fibf = 0;

        System.out.println("Fibonacci_number (0): "+fib0);
        System.out.println("Fibonacci_number (1): "+fib1);

        for (int i = 2; i <= f; i++) {
            fibf = fib0 + fib1;
            System.out.println("Fibonacci_number ("+i+ "): "+fibf);
            fib0 = fib1;
            fib1 = fibf;
        }
        System.out.println("Fibonacci_number(" + f + ") jest: "+fibf);

        System.out.println("Koniec programu...");
    }
}
