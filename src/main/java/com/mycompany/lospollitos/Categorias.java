
package com.mycompany.lospollitos;


public class Categorias {
    private int idCategoria;
    private String categoria;
    
    public Categorias() {
    
}
    public Categorias(int idCategoria, String categorias) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }
    
    public int GETidCategoria(){
        return idCategoria;
    }
    public String GETcategoria(){
        return categoria;
    }
    
    public void SETidCategoria(){
        this.idCategoria = idCategoria;
    }
    
    public void SETcategoria(){
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categoria:{"+"Id de Categoria: " + idCategoria + "Categoria: " + categoria  ; 
    }
    
    
}

