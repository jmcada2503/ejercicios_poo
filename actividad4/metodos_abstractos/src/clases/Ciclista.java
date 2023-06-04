package clases;

public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private float tiempo_acumulado = 0;

    public Ciclista() {};

    public Ciclista(int identificador, String nombre, float tiempo_acumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempo_acumulado = tiempo_acumulado;
    }

    public abstract String imprimirTipo();

    public int getIdentificador() {
        return this.identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getTiempoAcumulado() {
        return this.tiempo_acumulado;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempoAcumulado(float tiempo_acumulado) {
        this.tiempo_acumulado = tiempo_acumulado;
    }

    public void imprimir() {
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tiempo acumulado: " + this.tiempo_acumulado);
    }

}
