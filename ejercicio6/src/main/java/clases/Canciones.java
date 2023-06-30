package clases;

public class Canciones {
    public String nombre;
    public String genero;
    public String artista;
    public int duracion;

    public Canciones(String nombre, String genero, String artista, int duracion){
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String toString(){
        return "Nombre: "+this.nombre+", Genero: "+this.genero+", Artista: "+this.artista+", Duración: "+String.valueOf(this.duracion);
    }
}
