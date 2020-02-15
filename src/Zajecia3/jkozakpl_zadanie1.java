package Zajecia3;

import java.util.Scanner;

public class jkozakpl_zadanie1 {
    public static void main(String[] args) {
        System.out.println("program, który pobiera od uzytkownika liczbe całkowita dodatnia, a na-\n" +
                "stepnie wyswietla na ekranie kolejno wszystkie liczby niepatrzyste nie wieksze od\n" +
                "podanej liczby.");

     Scanner czytnik = new Scanner(System.in);
     System.out.println("Podaj liczbe całkowita dodatnia:");
     int a = czytnik.nextInt();

        for (int i=1; i<a; i=i+2) {
            System.out.println(i);
        }

        System.out.println("Koniec programu...");
    }
}
