package Zajecie4.Array;

import java.util.Random;
import java.util.Scanner;

public class zadani2_varClass {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int arraySize = scanner.nextInt();

        int[] liczby = new int[arraySize];
        int[] wystapienia = new int[10];
        int index = 0;

        for (int i = 0; i < liczby.length; i++) {
            int randomnumer = rand.nextInt(10) + 1;
            liczby[i] = randomnumer;
            System.out.print(liczby[i] + ", ");
        }
        for (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }
        for (int i = 0; i < liczby.length; i++) {
            index = liczby[i];
            wystapienia[(index)]++;
        }
        System.out.println("\n Wystapienia:");
        for (int i = 0; i < wystapienia.length; i++) {
            System.out.println(i + " ---> " + wystapienia[i]);
        }
        System.out.println("\n Koniec programu...");
    }
}