package Zajecie5.ObslugaZamowein;

public class Zamowienie {
    private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maxRozmiar;

    //
    // wywolujemy konstruktor parametrowy moze sluzyc do ustawienia wartosci domys

    public Zamowienie() {
        this.(DOMYSLNY_ROZMIAR_ZAMOWIENIA);
    }


//    public Zamowienie() {
//        this.maxRozmiar = 10;
//        pozycje = new Pozycja[maksRozmiar];


    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar]
    }

    public void dodajPozycje(Pozycja p) {
        if (this.ileDodanych >= maxRozmiar) {
            System.out.println("Nie mozna dodac zamownienia - osiagnieto max rozmiar");
        } else {
            this.pozycje[ileDodanych] = pozycje;
            ileDodanych++;

            // lub w 1 linijce
            //this.pozycje[ileDodanych++] =P;

        }
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (Pozycja p : pozycje) {
            if (p ! = null){
                wartoscZamowienia += p.obliczWartosc();
            }
        }
        return wartoscZamowienia;
    }
//    public double obliczWartosc() {
//        throw new RuntimeException("Do zaimplementolentowania");
    public String toString() {
        String result = "Zamowienie: \n";
        for (int i = 0; i < ileDodanych; i++) {
            result += pozycje[];
        }
    }
}
