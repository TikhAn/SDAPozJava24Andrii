/*package Homework;

import java.util.Scanner;


public class loopSwitch {
    public static void main(String[] args) {

        System.out.println("Wysokosci Miesiecznej Raty Za Zakupiony Sprzet");

        Scanner scan= new Scanner(System.in);

        final double A = 100;
        final double B = 10_000;
        double wyp = 0;

        System.out.println("Podaj cene towara, PLN: ");
        double pln = scan.nextDouble();

        System.out.println("Poday liczba rat:");
        byte rat = scan.nextByte();

        // cena towaru (od 100 zł do 10 tys. zł)

        switch (double) {
            case pln < A && pln > B:
                if  (rat > 6 && rat < 48) {
                System.out.println("Obliczamy raty...");
 */
/*  od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.*//*

                if (rat <= 12) {
                    wyp = 1.025 * pln / rat;
                } else if (rat <= 24) {
                    wyp = 1.05 * pln / rat;
                } else {
                    wyp = 1.1 * pln / rat;
                }

                System.out.println("Miesieczna rata wynosi: " + wyp + " PLN");
                System.out.println("Masz " + rat + " rat  po " + wyp + " PLN");

            } else {
                System.out.println("Zle dane wejsciowe - uruchom program ponownie");

            }


            default:
                System.out.println("Zle dane wejsciowe - uruchom program ponownie");
                break;



        }




    }





}
*/