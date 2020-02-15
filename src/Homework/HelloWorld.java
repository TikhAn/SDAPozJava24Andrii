package Homework;

public class HelloWorld {
    static void sayHello(String name) {
        System.out.println("Hello "+ name);
        System.out.println("Hello World inside static void function");
    }
   /* static void sayOlleh(String[] name2) {

        System.out.println("Hello "+ name2);
        for (String i : name2) {
            System.out.print(i + ", ");
        }
        System.out.println("Hello World inside static void function");
    }*/

    public static void main(String[] args) {
        sayHello("");
        sayHello("Andrey");
        sayHello("");
        System.out.println();

        System.out.println("Koniec programu...");
    }
}
