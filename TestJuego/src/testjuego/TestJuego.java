/*
* INTEGRANTES:
* Luna M. Lopardo
* Marco Silva
* Dante Rodriguez
*/
package testjuego;

import java.util.Scanner;

public class TestJuego {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        //a) Crear un Robot.
        Robot r = new Robot();
        System.out.println(r);
        
        //b) Crear un Hombre y pasarle el Robot creado en el ítem anterior.
        //c) Hacer que el Hombre juegue con el Robot.
        Hombre h = new Hombre();
        h.jugarConRobot(r);
        
        System.out.println("*El hombre deja el robot en el estante.");
        System.out.println("*Otro hombre, que vio lo mucho que el primero se divirtió, agarra el robot.");
        
        //d) Crear otro Hombre y pasarle el mismo Robot
        //e) Hacer que el último Hombre creado juegue con el Robot,
        Hombre h2 = new Hombre();
        h2.jugarConRobot(r);
        
        System.out.println("El robot hizo feliz a dos personas hoy.");
        System.out.println("El robot se va a dormir feliz..");
    }
}
