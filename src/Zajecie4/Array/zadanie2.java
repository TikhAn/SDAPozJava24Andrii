package Zajecie4.Array;

import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println(" Losowa tablica: ");
        for (int i = 0; i < array.length; i++) {
            int losowaLiczba = rand.nextInt(10) + 1;
            array[i] = losowaLiczba;
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n Wystapienia:");
        for (int i = 0; i < 10; i++) {
            int ni = i + 1;
            int k = 0;
            for (int z = 0; z < array.length; z++) {
                if (ni == array[z]) {
                    k++;
                }
            }
            System.out.println((i + 1) + " - " + k);
        }
        System.out.println("Koniec programu...");
    }
}