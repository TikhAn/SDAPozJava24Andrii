package Zajecie5.Prostokat;

public class Prostokat {


    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int obliczPole() {
        return bokA * bokB;
    }

    public int obliczObwod() {
        return 2 * (bokA + bokB);
    }

    // getter i setter

//    // todo metoda gettera
//    public int getBokA() {
//        return this.bokA;
//    }
//    // todo metoda settera - nic nie zwraca, ustawia wartosc przkazana jako parametr
//
//    public void setBokA(int bokA) {
//        if (bokA>0) {
//        this.bokA = bokA;} else { throw
//    }
}