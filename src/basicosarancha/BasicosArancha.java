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
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
     // Método para mostrar ejemplos de tipos cadenas.
    }

    public static void cadenas() {

        //Estos son los tipos básicos
        String cadena;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        cadena = "cadena de String";

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor cadena: " + cadena);
        System.out.println("Valor cadena + cadena: " + (cadena+cadena));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numericos();
        cadenas();
    }
    
}
