import java.util.Scanner;

public class Triangulo {

    public double[] lados = new double[3];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de los tres lados separados por espacio:");

        Triangulo triangle = new Triangulo();
        for (int i = 0; i < 3; i++) {
            triangle.lados[i] = sc.nextDouble();
        }

        System.out.println("El perímetro de este triángulo es "+triangle.perimetro()+", su semiperímetro es "+triangle.semiperimetro()+" y su área es "+triangle.area());

    }

    public double perimetro() {
        double ans = 0;
        for (int i = 0; i < 3; i++) {
            ans += this.lados[i];
        }
        return ans;
    }

    public double semiperimetro() {
        return this.perimetro()/2;
    }

    public double area() {
        double ans = this.semiperimetro();
        for (int i = 0; i < 3; i++) {
            ans *= (this.semiperimetro() - this.lados[i]);
        }
        return Math.sqrt(ans);
    }

}
