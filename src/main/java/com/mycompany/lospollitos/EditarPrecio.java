
package com.mycompany.lospollitos;
import javax.swing.JOptionPane;


public class EditarPrecio {
    
     public static void MenuEditarPrecio(){
    String entradaep;
    int ep = 0,epopcion;
    //hay que agregar las clases para que habran los programas designado
    JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Editar Precio ");
    //Menu de Editar Precio
    while (ep < 2){
    ep = 0;
    entradaep = JOptionPane.showInputDialog(null, """
                                                  Digite el n\u00famero de la opci\u00f3n que desea en el menu de Editar Precio
                                                  1. Editor de Precios
                                                  2. Volver al menu""");
    epopcion = Integer.parseInt(entradaep);
                   
    if (epopcion == 1){
        EditarPrecio();
    }
    if (epopcion == 2){
        ep = 5;
    }
    //opcion por si se escribeb un numero que no existe en la lista del menu 
    if (epopcion > 2 || epopcion < 1){
        JOptionPane.showMessageDialog( null, "La opcion "+ epopcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu");
    }                       
  }
 }
     
       public static void EditarPrecio(){
  
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea editar precio: "));
        Producto arreglo_producto[] =  new Producto[cantidad];
        
        for (int i = 0; i<arreglo_producto.length; i++){
            
            arreglo_producto[i]= new Producto();
            arreglo_producto[i].mostrarmarca();
            arreglo_producto[i].mostrarcategoria();
            arreglo_producto[i].mostrarproducto();
         } 
    }
}
