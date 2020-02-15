package Zajecie4.Funkcje;

import java.util.Scanner;

public class Zadanie2 {
    static String palindrome(String text) {
        String pal = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt((text.length() - i));
            pal = pal + letter;
        }
        return pal;
    }

    public static void main(String[] args) {
        System.out.println(" program, który wczytuje od uzytkownika ciag znaków, a nastepnie two-\n" +
                "rzy łancuch bedacy odwróceniem podanego łancucha i wyswietla go na ekranie\n");

        System.out.println("Podaj dowolny napis: \n");
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();

        String pali = palindrome(napis);

        System.out.println("\n Napis Palindrome: " + pali);

        System.out.println("\n Koniec programu...");
    }

}
