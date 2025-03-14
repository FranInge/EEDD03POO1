public abstract class Publicacion { //Abstract: no se pueden instanciar objetos de una clase abstract
    protected int id;

    public Publicacion(){
        this.id = 0;
    }

    public Publicacion(int id){
        this.id = id;
    }

    public String getText(){
        return "id: " + this.id;
    }
}
