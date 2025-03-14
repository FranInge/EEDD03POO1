public class ValorEntero {
    private int ve;
    //public static final int veCte=0; final: no se puede sobreesccribir en cualquier sobreclase que herede

    public ValorEntero(){
        this.ve = 0;
    }

    public ValorEntero(int ve){//Los constructores son los primeros metodos sobre cargados
        this.ve = ve;
        //this.veCte = 2; No se puede modificar una constante
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


    //Metodo que decuelva una REFERENCIA (tipo valorEntero) al objeto ValorEntero con mayor valor ve

    public ValorEntero compararVe(ValorEntero o){
        if(this.getVe() > o.getVe()){
            return this;
        }else{
            return o;
        }
    }




    /*
    public static ValorEntero mayor(ValorEntero ve1, ValorEntero ve2){
        if(ve1.getVe() > ve2.getVe()){
            return ve1;
        }else{
            return ve2;
        }
    }*/
}
