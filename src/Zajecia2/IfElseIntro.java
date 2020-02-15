package Zajecia2;

import java.util.Scanner;

public class IfElseIntro {
    public static void main(String[] args) {
        // <18.5        -> niedowaga
        // 18.5-24.99   -> waga OK
        // 25.0-29.99   -> nadwaga
        // >30          -> otyl

        Scanner scan = new Scanner(System.in);

        System.out.println("IF Else Intro");
        System.out.println("Podaj swoj wiek:");
        int wiek = scan.nextInt();

        if (wiek >=18) {
            System.out.println("Jestes pelnoletni");

        } else {
            System.out.println("Nie jestes pelnoletni");



        }

    }

}
