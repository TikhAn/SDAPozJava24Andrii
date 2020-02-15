package Zajecie5.ObslugaZamowein;

import java.io.IOException;


//
//

public class ObslugaZamowein {
    public static void main(String[] args) throws IOException {
        Pozycja p1 = new Pozycja("Chleb",1,3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier",3,4);
        System.out.println(p2);

        Zamowienie z = new Zamowienie(20);


    }
}
