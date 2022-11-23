
package com.mycompany.lospollitos;

public class Marcas {
     private int idMarca;
     private String Marca;
    
    public Marcas() {
    
}
    public Marcas(int idMarcas, String Marca) {
        this.idMarca = idMarcas;
        this.Marca = Marca;
    }
    
    public int GETidMarca(){
        return idMarca;
    }
    public String GETMarca(){
        return Marca;
    }
    
    public void SETidMarca(){
        this.idMarca = idMarca;
    }
    
    public void SETMarca(){
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Marca:{"+"Id de Marca: " + idMarca + "Marca: " + Marca  ; 
    }
}
