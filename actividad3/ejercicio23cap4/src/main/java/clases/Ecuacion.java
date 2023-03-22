package clases;

import javax.swing.JOptionPane;

public class Ecuacion {

    public double a, b, c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] result() {
        double discriminant = Math.pow(b, 2)-(4*a*c);
        if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "Esta ecuación no tiene solución en los reales");
            double[] array = {0, 0};
            return array;
        }
        else {
            double[] array = {(-(this.b)+Math.sqrt(discriminant))/(2*this.a), (-(this.b)-Math.sqrt(discriminant))/(2*this.a)};
            return array;
        }
    }

}
