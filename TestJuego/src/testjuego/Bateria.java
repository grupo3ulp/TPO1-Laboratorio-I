package testjuego;

public class Bateria {

    /**
    * *Inicializamos la carga en 1000 para que el robot empiece con la batería llena.
    */
    private double carga = 1000;

    public Bateria() {
    }
    
    public Bateria(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

}
