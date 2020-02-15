package Zajecia1;

import java.util.Scanner;

public class CzytnikIntro {
    public static void main(String[] args){
//        aby moc czytac dane od uzytkownika
//        musimy utworzyc obiekt typu Scanner
//        wg nastepujacej skladni
        Scanner czytnik =new Scanner(System.in);

//        czytnik to zmienna/obiekt typu Scanner
//        wiek to zmienna typu int
//   todo     w momencie pisania kodu nie wiemy ile

        String imie;
        double wiek;
        double waga = 65.5;

       System.out.println("Podaj swoje imie: ");
       imie =czytnik.next();

        System.out.println("Podaj swoj wiek: ");
        wiek =czytnik.nextDouble();

        System.out.println("Witaj,"+imie+"! Masz "+wiek+" lat");
    }


}
