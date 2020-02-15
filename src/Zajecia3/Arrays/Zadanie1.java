package Zajecia3.Arrays;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

//        tworzmy nowa tablice:
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj" + (i + 1) + "element tablicy:");
            int liczba = scanner.nextInt();
            array[i] = liczba;
        }
//            alternatywne array(i)=scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
        int centr;
        int min = array[0];
        int max = array[0];
        for (int i=1; i<array.length; i++) {
        if (array[i]<min) {
            min=array[i];
        };
        }

        for (int i=1; i<array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            };
        }
        float suma=0;
        float avg=0;

        for (int i=1; i<array.length; i++) {
           suma=suma+array[i];
        };
        avg=suma/(array.length);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Srednie to: " + avg);

//        wypelnij w petli for tablice
//        np
//        Podaj 1 element tablicy"
//        Podaj 2 element tablicy"
//        ...
//        Podaj n-ty element tablicy"
//

        System.out.println("Koniec programu...");
    }
}
