package Zajecia2;

public class Pentlelll {
    public static void main(String[] args) {

// program k
        System.out.println("Zadanie 1");

//        wersja 1
        System.out.println("Zadanie 1:Pętlę for W1");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }

        }

// ------------wersja 2
        System.out.println("Zadanie 1:Pętlę for W2");

        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + ", ");
        }

// ------------wersja 3 bez 0
        System.out.println("Zadanie 1:Pętlę for W2");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + ", ");
        }



        // ------------wypisac liczby nieparyste 0-100 w odwrotnej kolejnosci
        System.out.println("wypisac liczby nieparyste 0-100 w odwrotnej kolejnosci");
        for (int i = 99; i > 0; i=i-2) {
            System.out.print(i + ", ");
        }




    /*    System.out.println("Zadanie 1:Pętlę while");
        int i = 0;
        while (i<100 ) {
            System
        }*/


            System.out.println("konec Zadanie 1");

        System.out.println("Zadanie 3");
        int suma =0;
        for (int i = 0; i <= 100; i = i+1) {
            suma+=i;}
        System.out.println(suma);
        System.out.println("konec Zadanie 3");

           System.out.println("Koniec programu...");
        }

    }



