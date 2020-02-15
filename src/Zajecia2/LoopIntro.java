package Zajecia2;

public class LoopIntro {
    public static void main(String[] args) {

        // prosta petla while wypisujaca warto

        int wiek = 20;
        System.out.println(wiek);

        wiek = wiek + 5;

        System.out.println(wiek);

        wiek += 7;

        System.out.println(wiek);

        wiek += 1;

        System.out.println(wiek);

        wiek++;

        System.out.println(wiek);
// 5. post vs pre  inkrementacja
        System.out.println("Pre vs post inkrementacja");
        System.out.println("Postinkrementacja: Liczba++");
        int liczba = 0;
        System.out.println(liczba++);
        System.out.println(liczba);

        System.out.println("Preinkrementacja: ++numer");
        int numer = 0;
        System.out.println(++numer);
        System.out.println(numer);

        // petla wypisujaca liczby od 0 do 9
        // 9
        System.out.println("Petla while");
                int licznik = 0;
                while (licznik < 10) {
                    System.out.println(licznik);
                    licznik++;
        }

        System.out.println("Petla while++");
        licznik = 0;
        while (licznik < 10) {
            System.out.println(licznik++);
        }
        System.out.println("Petla do while");
        int x= 20;
        do {
            System.out.print(x++);
            System.out.print(" , ");
        } while (x < 10);


    }

    }