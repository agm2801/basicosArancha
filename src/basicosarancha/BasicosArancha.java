/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosarancha;

/**
 *
 * @author Arancha
 */
public class BasicosArancha {

    /**
     * Método para mostrar ejemplos de tipos logicos.
     */
    public static void logicos() {

        //Estos son los tipos básicos
        boolean t, f;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        t = true;
        f = false;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        if ( t == f){
            System.out.println("t y f son iguales en operador ==");
        } else{
            System.out.println("t y f son distintos en operador ==");
        }
        
        if (t != f){
            System.out.println("t y f son distintos en operador !=");
        } else{
            System.out.println("t y f son iguales en operador !=");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        logicos();
    }
    
}
