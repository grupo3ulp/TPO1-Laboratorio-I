package testjuego;

import java.util.InputMismatchException;
import static testjuego.TestJuego.leer;

public class Hombre {

    public void jugarConRobot(Robot r) {
        boolean flag = true;
        int op;

        /**
         * * En esta clase hicimos el método de jugar con un menú para navegar a través de los métodos
         * * -Para las opciones de avanzar y retroceder va a verificar que el robot esté encendido primero.
         * * -Las opciones de avanzar y retroceder piden la cantidad de pasos que el usuario quiere hacer.
         * * -El método termina cuando se apaga el robot, se le asigna al segundo hombre y al apagar el robot otra vez, finaliza el programa.
         * * -Incluímos un bloque try-catch para manipular el ingreso incorrecto de datos.
         */

        do {
            try {
                System.out.println("__________________________");
                System.out.println("Beep boop, boop beep?");
                System.out.println("1. Encender");
                System.out.println("2. Avanzar");
                System.out.println("3. Retroceder");
                System.out.println("4. Ver estado de batería");
                System.out.println("5. Recargar batería");
                System.out.println("6. Apagar");
                System.out.println("__________________________");
                op = leer.nextInt();

                switch (op) {
                    case 1:
                        r.despertar();
                        System.out.println("Boop beep! Encendido");
                        break;
                    case 2:
                        if (r.isDormido() == true) {
                            System.out.println("Robot apagado, por favor enciéndalo");
                        } else {
                            System.out.println("¿Cuántos pasos querés avanzar?");
                            double p = leer.nextInt();
                            r.avanzar(p);
                        }
                        break;
                    case 3:
                        if (r.isDormido() == true) {
                            System.out.println("Robot apagado, por favor enciéndalo");
                        } else {
                            System.out.println("¿Cuántos pasos querés retroceder?");
                            double p = leer.nextInt();
                            r.retroceder(p);
                        }
                        break;
                    case 4:
                        System.out.println("Batería actual: " + r.energiaActual() + " ("+ r.energiaActual()/10 + "%)");
                        break;
                    case 5:
                        if (r.bateriaLlena()) {
                            System.out.println("La batería ya está llena!");
                        } else {
                            System.out.println("Batería cargada.");
                            r.recargar();
                        }
                        break;
                    case 6:
                        if (r.isDormido() == true) {
                            System.out.println("El robot ya está apagado");
                        } else {
                            r.dormir();
                            System.out.println("Beep boop.. zzZ");
                            flag = false;
                        }
                        break;
                    default:
                        System.out.println("Beep boop? Ingresa una opción válida (Números del 1 al 6)");
                }
            } catch (InputMismatchException e) {
                System.out.println("Beep boop? Ingresa una opción válida (Números del 1 al 6)");
                leer.next();
            } catch (Exception e) {
                System.out.println("Algo salió mal, volvé a intentarlo");
                leer.next();
            }
        } while (flag);
    }
}
