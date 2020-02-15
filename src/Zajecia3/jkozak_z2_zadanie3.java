package Zajecia3;

import java.util.Scanner;

public class jkozak_z2_zadanie3 {
    public static void main(String[] args) {

        System.out.println("program, który wczytuje od uzytkownika liczbe całkowita dodatnia n, a\n" +
                "nastepnie wyswietla na ekranie wszystkie potegi liczby 2 nie wieksze, niz podana\n" +
                "liczba");

        System.out.println("Ala \n powiedala \t \"Dzisiaj ladna pogoda\" ");
        System.out.println("C:\\Users\\\\Moje dokumenty\\obraz.jpg");


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita dodatnia:");
        int a = sc.nextInt();
// I rozwiazanie
        for (int i=1; i<=a; i=i*2) {
            System.out.println(i);
        }

        // II rozwiazanie

        for (int i=0; Math.pow(2,i)<=a; i++) {
            System.out.println(Math.pow(2,i));
        }
        System.out.println("Koniec programu...");
    }
}
