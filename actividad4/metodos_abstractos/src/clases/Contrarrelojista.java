package clases;

public class Contrarrelojista extends Ciclista {

    private double velocidad_maxima;

    public Contrarrelojista() {}

    public Contrarrelojista(int identificador, String nombre, float tiempo_acumulado, double velocidad_maxima) {
        super(identificador, nombre, tiempo_acumulado);
        this.velocidad_maxima = velocidad_maxima;
    }

    public double getVelocidadMaxima() {
        return this.velocidad_maxima;
    }

    public void setVelocidadMaxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public String imprimirTipo() {
        return "Es un contrarrelojista";
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima: " + this.velocidad_maxima);
    }

}
