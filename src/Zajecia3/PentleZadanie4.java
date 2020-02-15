package Zajecia3;

import java.util.Scanner;

public class PentleZadanie4 {
    public static void main(String[] args) {
        System.out.println("zliczający długość łańcucha znakowego");

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dowolny napis:");
        String text = czytnik.nextLine();

//        zliczanie
        int licznik = 0;
        for (int i=0; i<text.length(); i++) {
//            pobierz 1 znak
            char znak = text.charAt(i);
            System.out.println("Znak na pozycji: "+i+" to: "+ znak);
//         jezeli dany zna

            if (znak !=' '){
                licznik++;
            }

        }
        System.out.println("Dlugosc tekstu (ze spacjami) to: "+text.length());
        System.out.println("Dlugosc tekstu bez spacji to: "+licznik);

        System.out.println("Tekst malymi literami to: "+text.toLowerCase());
        System.out.println("Tekst duzymi literami to: "+text.toUpperCase());

        System.out.println("Koniec programu...");
    }
}
