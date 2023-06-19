package figuras;

public class Cilindro implements Figura {

    public double radio;
    public double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double superficie() {
        return (2*Math.PI*this.radio*this.altura) + (2*Math.PI*Math.pow(this.radio, 2));
    }

    public double volumen() {
        return (Math.PI*Math.pow(this.radio, 2))*this.altura;
    }

}
