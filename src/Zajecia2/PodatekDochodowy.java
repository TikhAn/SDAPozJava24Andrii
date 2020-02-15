package Zajecia2;

import java.util.Scanner;

public class PodatekDochodowy {
    public static void main(String[] args) {


        System.out.println("Podatek dochodowy od osób fizycznych");

        double pln = 0;
        double wyn = 0;
        final double PROG_PODATKOWY = 85528;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoj roczny dochód, PLN :");
        pln = scan.nextDouble();
        System.out.println("Od dochódy" + pln + " nalezny podatek:");

        // do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN
        // od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyzki ponad 85.528,00
        if (pln <= PROG_PODATKOWY) {
            wyn=0.18*pln - 556.02 ;
            System.out.println("do wyplaty:"+wyn);

        } else {
            wyn=14839.02 +0.32*(pln - PROG_PODATKOWY);
            System.out.println("do wyplaty:"+wyn);
        }
        System.out.println("Koniec programu...");

    }
}
