
package com.mycompany.lospollitos;
import javax.swing.JOptionPane;


public class Producto {
    private String name;
    private double precio;
    private int codigo;
    private int cantidad;
    private String marca;
    private String categoria;
    
    //Constructor
    public Producto(String name, double precio, int codigo, int cantidad, String marca, String categoria){
        this.name = name;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
        this.categoria =  categoria;
    }
    
    //Getters
    public String getname(){
        return this.name;
    }
     public double getprecio(){
        return this.precio;
    }
      public int getcodigo(){
        return this.codigo;
    }
      public int getcantidad(){
        return this.cantidad;
    }
      public String getmarca(){
        return this.marca;
    }
      public String getcategoria(){
        return this.categoria;
    }
      public String getinfoproducto(){
        return ("Producto: " + this.name +"\n"+ "Precio: " + this.precio + "\n" + "Codigo: " + this.codigo + "\n" + "Cantidad: " + this.cantidad + "\n" + "Marca: "+ this.marca + "\n" + "Categoria: "+this.categoria );
    }
      
      
      //Setters
      public void setname(String Nname){
          name = Nname;
      }
       public void setprecio(double Nprecio){
          precio = Nprecio;
      }
        public void setcodigo(int Ncodigo){
          codigo = Ncodigo;
      }
         public void setcantidad(int Ncantidad){
          cantidad = Ncantidad;
      }
          public void setmarca(String Nmarca){
          marca = Nmarca;
      }
           public void setcategoria(String Ncategoria){
          categoria = Ncategoria;
      }
}
