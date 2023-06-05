package clases;

public class Persona {

    public String nombre, apellidos, direccion, telefono;

    public Persona(String nombre, String apellidos, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String toString() {
        return this.nombre+" "+this.apellidos;
    }

}
