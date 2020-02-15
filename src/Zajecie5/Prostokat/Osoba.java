package Zajecie5.Prostokat;

public class Osoba {

    //    pola w klasie
    public String imie;
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;

    // konstruktor bezparametrowy
    // jesli nie ma zadnego konstruktora to pusty konstruktor jest generowany automatycznie
    // jesli zdefiniujemy JAWNIE konstruktor parametrowy, to ten konstruktor juz nie jest generowany automa
    // jesli potrzebujemy domyslnego konstruktora to musimy
    // jesli usuniemy ten konstruktor to bedziemy musieli zawsze tworzyc obiekty osoba
    // za pomoca konstruktora 3 argumentowego
    public Osoba(){
        System.out.println("Twozre obiekt typu osoba...");
    }

    public Osoba (String imie, String nazwisko, int w) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        // trzeci parametr nazwa sie inaczej niz pole, wiec this.wiek nie potrzebne
        // mozna od razu wiek = w;
        wiek = w;
    }


    // definicja metody do opisu Osoby
public String przedstawSie(){
        return "Na imie mam "+ this.imie+", nazywam sie "+this.nazwisko+"i mam "+wiek+"lat";
}


}