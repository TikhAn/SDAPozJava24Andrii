package Zajecie5;

import Zajecie5.Prostokat.Prostokat;

import java.util.Scanner;

public class ProstokatProgram {

    public static void main(String[] args) {

//        int a = scan.nextInt();
//        int b = scan.nextInt();
  //1
        System.out.println("Stwórz prostokąt1 i dodaj pola bokA oraz bokB:");
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj bokA:");
        int a = scan.nextInt();
        System.out.println("Podaj bokB:");
        int b = scan.nextInt();
        Prostokat Prostokat1 = new Prostokat(a,b);
     //2
        System.out.println("Stwórz prostokąt2 i dodaj pola bokA oraz bokB:");
        System.out.println("Podaj bokA:");
        a = scan.nextInt();
        System.out.println("Podaj bokB:");
        b = scan.nextInt();
        Prostokat Prostokat2 = new Prostokat(a,b);
        //3
        System.out.println("Stwórz prostokąt3 i dodaj pola bokA oraz bokB:");
        System.out.println("Podaj bokA:");
        a = scan.nextInt();
        System.out.println("Podaj bokB:");
        b = scan.nextInt();
        Prostokat Prostokat3 = new Prostokat(a,b);

        System.out.println("Pola prostokąta1: "+ Prostokat1.obliczPole()+" , m2");
        System.out.println("Obwod prostokąta1: "+ Prostokat1.obliczObwod()+" ,m");

        System.out.println("Pola prostokąta2: "+ Prostokat2.obliczPole()+" , m2");
        System.out.println("Obwod prostokąta2: "+ Prostokat2.obliczObwod()+" ,m");

        System.out.println("Pola prostokąta3: "+ Prostokat3.obliczPole()+" , m2");
        System.out.println("Obwod prostokąta3: "+ Prostokat3.obliczObwod()+" ,m");


        System.out.println("Koniec programu...");
    }
}