package figuras;

public class Piramide implements Figura {

    public double base;
    public double altura;
    public double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    public double volumen() {
        return ((1f/3f)*Math.pow(this.base, 2)*this.altura);
    }

    public double superficie() {
        return (this.apotema*this.base*2) + Math.pow(this.base, 2);
    }

}
