package Zajecie4.Funkcje;

import java.util.Scanner;

public class Zadanie1 {
    static int countLastLetter(String text) {
        //poberamy
        text = text.toLowerCase();
        char lastLetter = text.charAt(text.length() - 1);
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (lastLetter == letter) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Podaj dowolny napis, a ja policze ilosc wystaplen ostatney litery: \n");
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();

        // wywołujemy funkcję
        int liczbaWystapien = countLastLetter(napis);

        System.out.println("\n Ostatnia litera w wyrazie wystapila " + liczbaWystapien + " razy");

        System.out.println("\n Koniec programu...");
    }
}
