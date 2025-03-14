public class Imagen extends Publicacion {

    String archivo;

    public Imagen(){
        super();
        archivo = "";
    }

    public Imagen(int idp, String archivo){//Si ponemos el mismo nombre de archivo, se utiliza el this.archivo para definir que es el atributo de la clase
        super(idp);
        this.archivo = archivo;
    }

    public String getText(){//Se sobreescribe el metodo getText heredada de Publicacion
        return super.getText() + " img archivo: " + this.archivo;//super.getText() llama al metodo de la superclase
    }

}
