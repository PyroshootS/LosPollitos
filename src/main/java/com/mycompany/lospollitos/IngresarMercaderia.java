
package com.mycompany.lospollitos;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class IngresarMercaderia {
    
    public static void MenuIngresarMercaderia(){
        
    //hay que agregar las clases para que habran los programas designados
    String entradaim;
    int im = 0, imopcion = 0;
   JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Ingresar Mercaderia ");
   //Menu de Ingresar Mercaderia
   while (im < 2){
    entradaim = JOptionPane.showInputDialog(null, """
                                                                  Digite el n\u00famero de la opci\u00f3n que desea en el menu de Ingresar Mercaderia
                                                                  1. Ingresar Mercaderia
                                                                  2. Volver al menu""");
    imopcion = Integer.parseInt(entradaim);
    if (imopcion == 1){
        IngresarMercaderianueva();
    }
    if (imopcion == 2){
        im = 2;
    }
    //opcion por si se escribeb un numero que no existe en la lista del menu 
    if (imopcion > 2 || imopcion < 1){
        JOptionPane.showMessageDialog( null, "La opcion "+ imopcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu");
    }
  }
 }
    public static void IngresarMercaderianueva(){
  
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea ingresar mercaderia: "));
        Producto arreglo_producto[] =  new Producto[cantidad];
        
        for (int i = 0; i<arreglo_producto.length; i++){
            
            arreglo_producto[i]= new Producto();
            arreglo_producto[i].mostrarmarca();
            arreglo_producto[i].mostrarcategoria();
            arreglo_producto[i].mostrarproducto();
         }   
}

}
