package testjuego;

public class Robot {

    private Bateria bateria = new Bateria();
    private boolean dormido = true;

    
    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    //Devuelve la cantidad de energía actual de la batería
    public double energiaActual() {
        return bateria.getCarga();
    }
    
    /*
    * Tanto para el método de avanzar como para el de retroceder, hicimos que el robot 
    * se mueva hasta donde le de la energía y setee la carga de la batería a 0 si la agota;
    */
    public void avanzar(double cantPasos) {
        if (cantPasos / 10 > energiaActual()) {
            System.out.println("No alcanza la bateria para dar los pasos");
            System.out.println("Se avanza en su lugar, " + energiaActual() * 10 + " pasos.");
            System.out.println("No queda más energia.");
            bateria.setCarga(0);
        } else {
            System.out.println("Se avanzan " + cantPasos + " pasos.");
            bateria.setCarga(energiaActual() - (cantPasos / 10));
        }
    }

    public void retroceder(double cantPasos) {
        if (cantPasos / 10 > energiaActual()) {
            System.out.println("No alcanza la bateria para retroceder esa cantidad de pasos");
            System.out.println("Se retrocede en su lugar, " + energiaActual() * 10 + " pasos.");
            System.out.println("No queda más energia.");
            bateria.setCarga(0);
        } else {
            System.out.println("Se retrocede " + cantPasos + " pasos.");
            bateria.setCarga(energiaActual() - (cantPasos / 10));
        }
    }
 
    public void dormir() {
        dormido = true;
    }

    public void despertar() {
        dormido = false;
    }

    //Recargar setea la batería en 1000
    public void recargar() {
        bateria.setCarga(1000d);
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000d;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    @Override
    public String toString() {
        return "Robot{" + "Carga de bateria: " + bateria.getCarga() + ", Dormido: " + dormido + '}';
    }

}
