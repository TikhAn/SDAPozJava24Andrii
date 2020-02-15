package Zajecie4.Funkcje;

import java.util.Scanner;

public class Zadanie2Class {
    static String reverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(" program, który wczytuje od uzytkownika ciag znaków, a nastepnie two-\n" +
                "rzy łancuch bedacy odwróceniem podanego łancucha i wyswietla go na ekranie\n");

        System.out.println("Podaj dowolny napis: \n");
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();

        String text = reverseString(napis);
        System.out.println("\n Nowy Napis : " + text);

        System.out.println("\n Koniec programu...");
    }
}
