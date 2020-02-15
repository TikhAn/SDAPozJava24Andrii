package Zajecie5;

import Zajecie5.Prostokat.Osoba;

public class WstepDoObiektowProgram {
    // pierwsze przyklady tworzenia obiektow


    public static void main(String[] args) {

        // "student" jest obiektem typu Osoba
        // new Osoba --> wywolanie konstruktora bezparametrowego klasy Osoba
        Osoba student = new Osoba();
        student.imie = "Piotr";
        student.nazwisko = "Nowak";
        student.wiek = 30;
        student.wzrost = 1.80;
        student.waga = 80;


        // "uczen" jest obiektem typu Osoba
        // new Osoba --> wywolanie konstruktora bezparametrowego klasy Osoba
        Osoba uczen = new Osoba();
        uczen.imie = "Jan";
        uczen.nazwisko = "Kowalski";
        uczen.wiek = 15;

        // odczyt pola
        String a = student.imie;
        System.out.println("Wartosc pola to: " + a);

        System.out.println("Nazwisko studenta to: " + student.nazwisko);

        // wartosci drugiego obiektu - wartosci ucznia
        System.out.println("uczen.imie- " + uczen.imie);
        System.out.println("uczen.nazwisko- " + uczen.nazwisko);
        System.out.println("uczen.wiek- " + uczen.wiek);

        // zmiana nazwiska studenta
        System.out.println("Po zmianie nazwiska u studenta");
        student.nazwisko = "AAAAAAAA";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);

        // tworzymy obiekty z u
        Osoba pracownik = new Osoba("Anna", "Adamiak", 25);
        System.out.println(pracownik.imie);
        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);


        // Wawolujemy metode "przedstaw sie"
        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(pracownik.przedstawSie());

        // public vs private

    }
}