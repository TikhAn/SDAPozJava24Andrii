package Zajecie4.Funkcje;

public class introFunkcje {

    // prosta funkcja pobierająca 2 argumenty i zwracająca ich sumę
    // funkcje / metody definiujemy w ciele KLASY, a więc nie w mainie

    static int dodaj(int a, int b) {
        return a + b;
    }

    // funkcja która nic nie zwraca, ale wypisuje zawartosc tablicy
    static void printArray(String[] array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");
        }
        // kasujemy ostatni przecinek
        // na przyszłość: eleganckie rozwiązanie z użyciem StringBuilder
        System.out.print('\b');
        System.out.print('\b');

        System.out.print(" ]");
    }

    // funkcja do obliczania n-tego wyrazu ciągu fibonacciego

    static int fibonacci(int n) {
        int fib0 = 0;
        int fib1 = 1;
        int fibn = 0;

        System.out.println("Fibonacci_number (0): " + fib0);
        System.out.println("Fibonacci_number (1): " + fib1);

        for (int i = 2; i <= n; i++) {
            fibn = fib0 + fib1;
            System.out.println("Fibonacci_number (" + i + "): " + fibn);
            fib0 = fib1;
            fib1 = fibn;
        }
        return fibn;
    }


    public static void main(String[] args) {
        int pierwszaLiczba = 10;
        int drugaLiczba = 20;

        int wynik = dodaj(pierwszaLiczba, drugaLiczba);

        System.out.println(wynik);

        String[] imiona = {"ala", "ola", "lola"};
        printArray(imiona);


        System.out.println("Koniec programu...");
    }
}
