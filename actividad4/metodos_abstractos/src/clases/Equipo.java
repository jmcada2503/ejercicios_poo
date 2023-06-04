package clases;

public class Equipo {

    private String nombre;
    private Ciclista[] ciclistas;
    private static double tiempo_total = 0;

    public Equipo() {}

    public Equipo(String nombre, Ciclista[] ciclistas) {
        this.nombre = nombre;
        this.ciclistas = ciclistas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Ciclista[] getCiclistas() {
        return this.ciclistas;
    }

    public double getTiempo() {
        this.computeTime();
        return this.tiempo_total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclistas(Ciclista[] ciclistas) {
        this.ciclistas = ciclistas;
    }

    private static Ciclista[] push(Ciclista[] array, Ciclista push) {
        Ciclista[] longer = new Ciclista[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }

    public void agregarCiclista(Ciclista ciclista) {
        this.ciclistas = this.push(this.ciclistas, ciclista);
    }

    public void computeTime() {
        double tiempo = 0;
        for (int i=0; i<this.ciclistas.length; i++) {
            tiempo = tiempo + this.ciclistas[i].getTiempoAcumulado();
        }
        this.tiempo_total = tiempo;
    }

    public void mostrarNombres() {
        System.out.println("Nombres:");
        for (int i=0; i<this.ciclistas.length; i++) {
            System.out.println(ciclistas[i].getNombre());
        }
    }

    public void mostrarDatos(int id) {
        for (int i=0; i<this.ciclistas.length; i++) {
            if (ciclistas[i].getIdentificador() == id) {
                System.out.println(ciclistas[i].imprimirTipo());
                ciclistas[i].imprimir();
            }
        }
    }

}
