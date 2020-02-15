package Zajecia3.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int wiek = 10;

        String imie = "Piotr";

        int[] liczby = new int[10];
//        wpisywanie wartosci do tablicy
        liczby[0]=25;
        liczby[4]=100;

//        pobieranie wartosci z tablicy
        int wartosc = liczby[4];

//  ArrayIndexOutOfboundsException
//        System.out.println(liczby[-2]); //indeks tablicy NIGDY nie bedzie ujemny
//      System.out.println(liczby[15]); //jesli index wienkszy od dlugoscy to tez blad


//        Sprawdzanie dlugosci tablicy
        int dlugoscTablicy =liczby.length;
        System.out.println("Tabli");

String[] imiona = {"Ala","Piatr","Adam","Karolina","Eliza"};
System.out.println("Dlugosc tablicy to: "+imiona.length);

//        wyswietlenie wszystkich elementow tablicy
        for (int i=0; i<imiona.length;i++) {
            String name = imiona[i];
            System.out.println("Imie nr." + i + " to: " + name);
        }


//            Dynamiczne tworzenie tablicy
            System.out.println("Podaj rozmiar tablicy: ");
            Scanner scanner=new Scanner(System.in);
            int rozmiar = scanner.nextInt();

            int[] dynamicznaTablica = new int[rozmiar];
            System.out.println("Rozmiar dynamicznej tablicy:" + dynamicznaTablica.length);




        System.out.println("Koniec programu...");
    }
}
