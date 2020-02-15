package Zajecia2;

public class ForLoopIntro {
    public static void main(String[] args) {

        String imie = "Piotr";
        System.out.println(imie);

        for (int i=0; i<10; i++) {
            String nazwisko= "Kowalski";
            System.out.println(i);
            System.out.println(imie);
            System.out.println(nazwisko);
        }
        String nazwisko= "Kowalski";
        for (int i=10; i<20; i++) {
            System.out.println(i);
            System.out.println(imie);
        }
        System.out.println("Koniec programu...");

    }


}
