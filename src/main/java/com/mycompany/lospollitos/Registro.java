
package com.mycompany.lospollitos;
import javax.swing.JOptionPane;



public class Registro {
    
    public static void MenuRegistro(){
     
    String entradar;
    int ropcion;
    int r = 0; 
    //hay que agregar las clases para que abran los programas designados
    JOptionPane.showMessageDialog(null,"Bienvenido al Menu de Registro ");
    // menu de Registro 
while (r <4){
    entradar = JOptionPane.showInputDialog(null, """
                                                 Digite el n\u00famero de la opci\u00f3n que desea en el menu de Registro
                                                 1. Registrar nuevo producto
                                                 2. Registrar una marca
                                                 3. Registrar una categoría
                                                 4. Volver al menu""");
    ropcion = Integer.parseInt(entradar);
    if (ropcion == 1){
        
       RegistrarProducto();
    }
    if (ropcion == 2){
       RegistrarMarca();
    }
     if (ropcion == 3){
        RegistrarCategoria();
    }
    if (ropcion == 4){
        r = 4;
    }
     //opcion por si se escribeb un numero que no existe en la lista del menu 
    if (ropcion > 4 || ropcion < 1){
    JOptionPane.showMessageDialog( null, "La opcion "+ ropcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu");
    }
  }                    
}
    

public static void RegistrarProducto(){
  
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea registrar: "));
        Producto arreglo_producto[] =  new Producto[cantidad];
        
        for (int i = 0; i<arreglo_producto.length; i++){
            
            arreglo_producto[i]= new Producto();
         //   arreglo_producto[i].mostrarmarca();
           // arreglo_producto[i].mostrarcategoria();
            arreglo_producto[i].pedirdatos_producto();
         }   
}

public static void RegistrarMarca(){
      int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de marcas que desea registrar: "));
        Producto arreglo_producto[] =  new Producto[cantidad];
        
        for (int i = 0; i<arreglo_producto.length; i++){
            
            arreglo_producto[i]= new Producto();
            //arreglo_producto[i].pedirdatos_marca();
         }   
    
}

public static void RegistrarCategoria(){
       int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de categorias que desea registrar: "));
        Producto arreglo_producto[] =  new Producto[cantidad];
        
        for (int i = 0; i<arreglo_producto.length; i++){
            
            arreglo_producto[i]= new Producto();
           // arreglo_producto[i].pedirdatos_categoria();
         }   
    
}
}
