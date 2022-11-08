

package com.mycompany.lospollitos;

import javax.swing.JOptionPane;


public class LosPollitos {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de bodegas de  Los Pollitos INC");
        
        //Variables de numero de opcion
        int ropcion = 0, numopcion = 0, imopcion= 0, epopcion = 0 , inopcion;
        //Variable del contador del While del menu principal
        int m = 0;
        //Variables Entrada para tranformar en int-Variables de numero de opcion
        String entradaep = "" , entrada = "",entradar = "",entradaim = "",entradain = "";
        
        while (m<2){
            
            //Variables contador de while, los meto en el while del menu principal  para que al cerrar lo submenus(while) los reinicie 
             int  r = 0 , im = 0 , ep = 0 , in = 0;
            // Entrada de datos  y tranformacion a int 
             entrada = JOptionPane.showInputDialog(null, "Digite el número de la opción que desea" + "\n" + "1. Registro" + "\n"+ "2. Ingresar Mercadería"+"\n"+"3. Editar Precio"+"\n"+"4. Ver Inventario"+"\n"+"5. Salir");
             numopcion = Integer.parseInt(entrada);
             
             
            //Mientras i sea menor a 2 va a correr el menu //
             if (numopcion == 1){
                 //hay que agregar las clases para que abran los programas designados
                JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Registro ");
                // menu de Registro 
                while (r < 2){
                     entradar = JOptionPane.showInputDialog(null, "Digite el número de la opción que desea en el menu de Registro" + "\n" + "1. Registro" + "\n"+ "2. Volver al menu");
                     ropcion = Integer.parseInt(entradar);
                    if (ropcion == 1){
                        JOptionPane.showMessageDialog(null, "Bienvenido al Registro ");
                    }
                    if (ropcion == 2){
                        r = 5;
                    }
                    //opcion por si se escribeb un numero que no existe en la lista del menu 
                    if (ropcion > 2 || ropcion < 1){
                        JOptionPane.showMessageDialog( null, "La opcion "+ ropcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu");
                    }
                        
                }
            }
            if (numopcion == 2){
                 //hay que agregar las clases para que habran los programas designados
                JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Ingresar Mercaderia ");
                //Menu de Ingresar Mercaderia
                 while (im < 2){
                    entradaim = JOptionPane.showInputDialog(null, "Digite el número de la opción que desea en el menu de Ingresar Mercaderia" + "\n" + "1. Ingresar Mercaderia" + "\n"+ "2. Volver al menu");
                    imopcion = Integer.parseInt(entradaim);
                    if (imopcion == 1){
                        JOptionPane.showMessageDialog(null, "Bienvenido a Agregar Mercaderia");
                    }
                    if (imopcion == 2){
                        im = 5;
                    }
                    //opcion por si se escribeb un numero que no existe en la lista del menu 
                    if (imopcion > 2 || imopcion < 1){
                        JOptionPane.showMessageDialog( null, "La opcion "+ imopcion + " no existe en nuestro menu","ERROR",JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Por Favor, digite un numero valido de nuestro menu");
                    }
                    
                       
                }
            }
            if (numopcion == 3){
                 //hay que agregar las clases para que habran los programas designados
                JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Editar Precio ");
                //Menu de Editar Precio
                 while (ep < 2){
                    ep = 0;
                    entradaep = JOptionPane.showInputDialog(null, "Digite el número de la opción que desea en el menu de Editar Precio" + "\n" + "1. Editor de Precios" + "\n"+ "2. Volver al menu");
                    epopcion = Integer.parseInt(entradaep);
                    
                    if (epopcion == 1){
                        JOptionPane.showMessageDialog(null, "Bienvenido al Editor de Precios");
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
            if (numopcion == 4){
                 //hay que agregar las clases para que habran los programas designados
                JOptionPane.showMessageDialog(null, "Bienvenido al Menu de Inventario");
                //Menu de Inventario
                 while (in < 2){

                    entradain = JOptionPane.showInputDialog(null, "Digite el número de la opción que desea en el menu de Inventario" + "\n" + "1. Ver Inventario Completo" + "\n"+ "2. Volver al menu");
                    inopcion = Integer.parseInt(entradain);
                    if (inopcion == 1){
                        JOptionPane.showMessageDialog(null, "Bienvenido al Inventario Completo");
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

