package clases;

public class Velocista extends Ciclista {

    private double potencia_promedio;
    private double velocidad_promedio;

    public Velocista() {};

    public Velocista(int identificador, String nombre, float tiempo_acumulado, double potencia_promedio, double velocidad_promedio) {
        super(identificador, nombre, tiempo_acumulado);
        this.potencia_promedio = potencia_promedio;
        this.velocidad_promedio = velocidad_promedio;
    }

    public double getPotenciaPromedio() {
        return this.potencia_promedio;
    }

    public double getVelocidadPromedio() {
        return this.velocidad_promedio;
    }

    public void setPotenciaPromedio(double potencia_promedio) {
        this.potencia_promedio = potencia_promedio;
    }

    public void setVelocidadPromedio(double velocidad_promedio) {
        this.velocidad_promedio = velocidad_promedio;
    }

    public String imprimirTipo() {
        return "Es un velocista";
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + this.potencia_promedio);
        System.out.println("Velocidad promedio: " + this.velocidad_promedio);
    }

}
