package animales;

public abstract class Animal {

    protected String sonido;
    protected String alimento;
    protected String habitat;
    protected String nombre_cientifico;

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimento();
    public abstract String getHabitat();

}
