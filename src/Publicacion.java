
public abstract class Publicacion { //Abstract: no se pueden instanciar objetos de una clase abstract
    protected int id;

    public Publicacion(){

        this.id = 0;
    }

    public Publicacion(int id){

        this.id = id;
    }

    public String getText(){

        if(this.checkPublicacion()){
            return "id: " + this.id;
        }else{
        return "Id: not defined";
        }
    }

    protected boolean checkPublicacion(){

        //return true;
        return this.id > 0;
    }

    public final void resetId(){//Desde Documento se puede resetear el id
        id = 0;
    }

    private void addId(int id){ //Solo se puede utilizar dentro de la clase
        this.id += id;
    }


}
