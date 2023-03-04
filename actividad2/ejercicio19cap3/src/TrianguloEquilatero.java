import java.util.Scanner;

public class TrianguloEquilatero {

    public double lado;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado:");

        TrianguloEquilatero triangle = new TrianguloEquilatero(sc.nextDouble());

        System.out.println("El perímetro de este triángulo es "+triangle.perimetro()+", su altura es "+triangle.altura()+" y su área es "+triangle.area());

    }

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double perimetro() {
        return (lado*3);
    }

    public double altura() {
        return Math.sqrt(Math.pow(lado, 2)*Math.pow((lado/2), 2));
    }

    public double area() {
        return (this.lado * this.altura())/2;
    }

}
