
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

    public Producto() {
       this.name = "";
        this.precio = 0;
        this.codigo = 0;
        this.cantidad = 0;
        this.marca = "";
        this.categoria =  ""; 
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
           
    public void pedirdatos_producto(){
        this.name = JOptionPane.showInputDialog(null, "Digite el nombre del producto: ");
        this.precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio del producto: "));
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto: "));
        this.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el cantidad del producto: "));
        this.marca = JOptionPane.showInputDialog(null, "Digite el nombre de la marca: ");
        this.categoria = JOptionPane.showInputDialog(null, "Digite el nombre de la categoria: ");
                
    }
        
   // public void pedirdatos_marca(){
     //   this.marca = JOptionPane.showInputDialog(null, "Digite el nombre de la marca: ");
    //}
    
    //public void pedirdatos_categoria(){
      // this.categoria = JOptionPane.showInputDialog(null, "Digite el nombre de la categoria: ");
    //}
    
    public void mostrarmarca(){
        String opcion = (JOptionPane.showInputDialog( null,"Seleccione la marca","Marca",JOptionPane.PLAIN_MESSAGE,null,new Object[]{marca},"Selecciona")).toString();
        
    }
           
    public void mostrarcategoria(){
        String opcion = (JOptionPane.showInputDialog( null,"Seleccione la categoria","Categoria",JOptionPane.PLAIN_MESSAGE,null,new Object[]{categoria},"Selecciona")).toString();
        
    }     
    
    public void mostrarproducto(){
        String opcion =  (JOptionPane.showInputDialog( null,"Seleccione la producto","Producto",JOptionPane.PLAIN_MESSAGE,null,new Object[]{name},"Selecciona")).toString();
        
    }  

    @Override
    public String toString() {
        return "Producto{" + "name=" + name + ", precio=" + precio + ", codigo=" + codigo + ", cantidad=" + cantidad + ", marca=" + marca + ", categoria=" + categoria + '}';
    }


    
    
    
}
