public class Documento extends Publicacion {//Publicacion se convierte en superclase
    String doc;

    public Documento(){
        super();
        doc = "";
    }

    public Documento(int idp, String docp){
        super(idp);
        doc = docp;
    }

    public String getText(){//Se sobreescribe el metodo de la superclase
        return super.getText() + " doc: " + this.doc;//super.getText() llama al metodo de la superclase
    }
}
