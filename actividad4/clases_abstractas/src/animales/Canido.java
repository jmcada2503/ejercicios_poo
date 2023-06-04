package animales;

public abstract class Canido extends Animal {

    public String getNombreCientifico() {
        return this.nombre_cientifico;
    }

    public String getSonido() {
        return this.sonido;
    }

    public String getAlimento() {
        return this.alimento;
    }

    public String getHabitat() {
        return this.habitat;
    }

}
