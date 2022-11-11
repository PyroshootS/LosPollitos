package com.mycompany.lospollitos;
import javax.swing.JOptionPane;


public class VerInventario {
    
     public static void MenuVerInventario(){
    String entradain;
    int in = 0, inopcion;
    
      //hay que agregar las clases para que habran los programas designados
    JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Inventario");
                //Menu de Inventario
    while (in < 2){

        entradain = JOptionPane.showInputDialog(null, """
                                                      Digite el n\u00famero de la opci\u00f3n que desea en el menu de Inventario
                                                      1. Ver Inventario Completo
                                                      2. Volver al menu""");
        inopcion = Integer.parseInt(entradain);
        if (inopcion == 1){
        //VerInventario();
        }
        if (inopcion == 2){
            in = 5;
        }
        //opcion por si se escribeb un numero que no existe en la lista del menu 
        if (inopcion > 2 || inopcion < 1){
            JOptionPane.showMessageDialog( null, "La opcion "+ inopcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu"); 
        }
    }
        
     }
  public static void VerInventario(){
    String resultado = "Producto";
    
    Producto arreglo_producto[] =  new Producto[3];
          
   for (int i = 0; i <arreglo_producto.length; i++){
       resultado += "Producto" +(i+1) + ":" + arreglo_producto[i].toString()+ "\n";
   }
   JOptionPane.showMessageDialog(null,"Lista de productos\n"+resultado);
    }
        
    
  }

