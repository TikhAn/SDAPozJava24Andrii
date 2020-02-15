package Zajecia3;

import java.util.Scanner;

public class jkozak_z2_zadanie2 {
    public static void main(String[] args) {
        System.out.println("program pobierajacy od uzytkownika dwie liczby całkowite A oraz B,\n" +
                "A < B, a nastepnie wyznaczajacy sume ciagu liczb od A do B, czyli sume ciagu\n" +
                "(A,A + 1, . . . ,B). Obliczenia nalezy wykonac trzykrotnie stosujac kolejno petle:\n" +
                "while, do-while, for.");

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita dodatnia A:");
        int a = czytnik.nextInt();
        System.out.println("Podaj liczbe całkowita dodatnia B:");
        int b = czytnik.nextInt();

if (a<b) {
    int i=a;
    int sum=0;
    while (i<=b) {
        sum =sum+i;
        i=i+1;
    }
    System.out.println("sume ciagu liczb od A do B(while): "+sum);
    i=a;
    sum=a;
    do {i=i+1;
        sum =sum+i;
    } while (i<b);
    System.out.println("sume ciagu liczb od A do B(do-while): "+sum);
    i=a;
    sum=0;
    for (i =a; i<=b; i++) {
        sum += i;
        }
    System.out.println("sume ciagu liczb od A do B(for): "+sum);
}
else {        System.out.println("A musi byc mniejsze od B");
}

        System.out.println("Koniec programu...");
    }
}
