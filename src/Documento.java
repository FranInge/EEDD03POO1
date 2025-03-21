public class Documento extends Publicacion implements Mostrable{//Publicacion se convierte en superclase. Documento hereda de Publicacion
    String doc; // Es decir que Documento dispone de los mismos elementos que Publicacion. Ej get.Text(), resetId()

    public Documento(){
        super();
        doc = "";
    }

    public Documento(int idp, String docp){
        super(idp);
        doc = docp;
    }

    public String getText(){//Se sobreescribe el metodo getText heredada de Publicacion

        if( !super.checkPublicacion()){ //Si no esta definida la Publicacion....
            return "Doc Id: not defined";
        } else {
            return super.getText() + " doc: " + this.doc;//super.getText() llama al metodo de la superclase
        }
    }

    /* Da error porque el resetId es final en Publicacion. Un metodo de aqui no se puede sobreescribir, porque le agregamos final en Publicacion
    El metodo resetId no puede ser sobreescito como final
    public final void resetId(){//Desde Documento se puede resetear el id
        id = 0;
    }*/

    public void resetDoc(){
        super.resetId(); // Si es posible utilizar el metodo final
        //super.addId(2); // No se puede utilizar el metodo addId porque es un metodo privado.

        doc="";
    }

    public String mostrarColor(){
        return "Color: " + this.doc;
    }

    public String mostrarBN(){
        return "MostrarBN: " + this.doc;
    }
}
