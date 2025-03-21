

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        ValorEntero ve1= new ValorEntero(10);
        System.out.println("ve1 = " + ve1);
        ve1.sumarVe(10);
        System.out.println("ve1 +10 = " + ve1);
        ve1.sumarVe(10, 10);
        System.out.println("ve1 +10 +10 = " + ve1); //20 + 10 + 10 = 40

        ve1.sumarVe(2, 8.4); //El 8.4 se trunca al cambiar a int, entonces el .4 se pierde
        System.out.println("ve1 +2 + 8 = " + ve1);//40 + 2 + 8 = 50

        ValorEntero ve2= new ValorEntero(20);
        System.out.println("ve2 = " + ve2);

        ValorEntero ve3 = ve1.compararVe(ve2);
        System.out.println("El ValorEntero mayor es= " + ve3);

        //Publicacion p1 = new Publicacion(); No es posible instancia por ser Publicacion abstracto

        Documento doc0 = new Documento();//Sin parametros
        System.out.println("doc0 = " + doc0.getText());//Va a decir que doc0 no esta definido, porque como su id es 0, checkPublicacion() va a devolver false
        if(doc0.checkPublicacion()){
            System.out.println("doc0 = Id >0");
        } else{
            System.out.println("doc0 = Id ==0");
        }


        Documento doc1 = new Documento(1, "hola");
        Imagen img1 = new Imagen(2, "a.jpg");

        //Se declaran dos objetos de la super clase Publicacion
        Publicacion p1 = doc1;
        Publicacion p2 = img1;


        System.out.println("p1 = " + p1.getText());//Polimorfismo: Se llama al metodo getText de la clase Documento
        System.out.println("p2 = " + p2.getText());//Polimorfismo: Se llama al metodo getText de la clase Imagen

        Mostrable []elementos = new Mostrable[4];
        Imagen img2 = new Imagen(3, "img3.jpg");
        Documento doc2 = new Documento(4, "que tal");

        elementos[0]= doc1; //Al no implementar Mostrable en Documentos.java, se agrege esto para que funcione
        elementos[1]= img1;
        elementos[2]= img2;
        elementos[3]= doc2;

        for(Mostrable m: elementos){
            System.out.println(m.mostrarBN());
            System.out.println(m.mostrarColor());
        }
    }
}