package Homework_JF;

public class TestTax {
    public static void main(String[] args) {
        //Tax t = new Tax();
        NJtax t=new NJtax();

        t.grossIncome=40000;
        t.numberOfDependents=2;
        t.state="NJ";

        double yourTax = t.calcTax();

        double njt = t.adjustForStudents(yourTax);

        System.out.println("You tax is "+njt);
    }
}
