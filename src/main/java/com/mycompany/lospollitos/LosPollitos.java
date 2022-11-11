

package com.mycompany.lospollitos;

import javax.swing.JOptionPane;


public class LosPollitos {


    public static void main(String[] args) {
        
        
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de bodegas de  Los Pollitos INC");
        //Variables de numero de opcion
        int numopcion;
        //Variable del contador del While del menu principal
        int m = 0;
        //Variables Entrada para tranformar en int-Variables de numero de opcion
        String entrada;
        
        while (m<2){
            // Entrada de datos  y tranformacion a int 
             entrada = JOptionPane.showInputDialog(null, """
                                                         Digite el n\u00famero de la opci\u00f3n que desea
                                                         1. Registro
                                                         2. Ingresar Mercader\u00eda
                                                         3. Editar Precio
                                                         4. Ver Inventario
                                                         5. Salir""");
             numopcion = Integer.parseInt(entrada);
             
            //Mientras i sea menor a 2 va a correr el menu //
             if (numopcion == 1){
                 Registro.MenuRegistro();
            }
            if (numopcion == 2){
                IngresarMercaderia.MenuIngresarMercaderia();
            }
            if (numopcion == 3){
                EditarPrecio.MenuEditarPrecio();
            }
            if (numopcion == 4){
                VerInventario.MenuVerInventario();
            }
            if (numopcion == 5){
                 //al igualar i  a 5 lo hace mayor a 2 y rompe el ciclo  del While m < 2
                 JOptionPane.showMessageDialog(null, "Gracias por utilzar nuestro sistema. ");
                m = 5;
            }
            //opcion por si se escribeb un numero que no existe en la lista del menu 
            if (numopcion > 5 || numopcion < 1){
                
                JOptionPane.showMessageDialog( null, "La opcion "+ numopcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu");
            }
            
            
        }
    }
}

