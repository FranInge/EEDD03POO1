

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        ValorEntero ve1= new ValorEntero(10);
        System.out.println("ve1 = " + ve1);
        ve1.sumarVe(10);
        System.out.println("ve1 +10 = " + ve1);
        ve1.sumarVe(10, 10);
        System.out.println("ve1 +10 +10 = " + ve1);

        ValorEntero ve2= new ValorEntero(20);
        System.out.println("ve2 = " + ve2);

        ValorEntero ve3 = ve1.compararVe(ve2);
        System.out.println("El ValorEntero mayor es= " + ve3);

        //Publicacion p1 = new Publicacion(); No es posible instancia por ser Publicacion abstracto

        Documento doc1 = new Documento(1, "hola");
        Imagen img1 = new Imagen(2, "a.jpg");

        Publicacion p1 = doc1;
        Publicacion p2 = img1;

        System.out.println("p1 = " + p1.getText());//Polimorfismo: Se llama al metodo getText de la clase Documento
        System.out.println("p2 = " + p2.getText());
    }
}