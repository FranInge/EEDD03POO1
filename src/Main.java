

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        ValorEntero ve1= new ValorEntero(10);
        System.out.println("ve1 = " + ve1);
        ve1.sumarVe(10);
        System.out.println("ve1 +10 = " + ve1);
        ve1.sumarVe(10, 10);
        System.out.println("ve1 +10 +10 = " + ve1);

    }
}