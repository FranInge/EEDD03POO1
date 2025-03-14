public class ValorEntero {
    int ve;

    public ValorEntero(){
        this.ve = 0;
    }

    public ValorEntero(int ve){//Los constructores son los primeros metodos sobre cargados
        this.ve = ve;
    }

    public int getVe() {
        return ve;
    }

    public void setVe(int ve) {
        this.ve = ve;
    }

    public void sumarVe(int v){
        //this.ve +=;
        //ve+= v
        this.setVe(this.getVe() + v);
    }

    @Override
    public String toString() {
        return "ValorEntero{" +
                "ve=" + ve +
                '}';
    }

    public void sumarVe(int v1, int v2){ //Sobrecargar metodos: Consiste en crear un nuevo metodo
        this.setVe(this.getVe() + v1 + v2);//Con el mismo nombre pero diferente lista de parametros
    }


}
