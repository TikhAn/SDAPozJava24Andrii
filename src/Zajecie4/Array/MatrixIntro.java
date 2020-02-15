package Zajecie4.Array;

import java.util.Random;

public class MatrixIntro {
    public static void main(String[] args) {
        Random r = new Random();

        int[][] macierz = new int[4][2];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                macierz[i][j] = r.nextInt(10);
                System.out.print(macierz[i][j] + ", ");
            }
            System.out.println();
        }
        int min = macierz[0][0];
        int max = macierz[0][0];
        int suma = 0;
        int x = 0;
        for (int i = 0; i < macierz.length; i++) {
            int maxi = macierz[i][0];
            for (int j = 0; j < macierz[i].length; j++) {
                suma = suma + macierz[i][j];
                x++;
                if (macierz[i][j] > maxi) {
                    maxi= macierz[i][j];
                }
                if (macierz[i][j] < min) {
                    min = macierz[i][j];
                }
                if (macierz[i][j] > max) {
                    max = macierz[i][j];
                }
            }
            System.out.println("max po "+(i+1)+" -> " + maxi);
        }
       double avg = suma / x;
        System.out.println("------------");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Suma: " + suma);
        System.out.println("liczba elementów: " + x);
        System.out.println("Srednie to: " + avg);

        System.out.println("Koniec programu...");
    }
}
