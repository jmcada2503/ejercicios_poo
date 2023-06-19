package figuras;

public class Esfera implements Figura {

    public double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double volumen() {
        return (4f/3f)*Math.PI*Math.pow(this.radio, 3);
    }

    public double superficie() {
        return 4*Math.PI*Math.pow(this.radio, 2);
    }

}
