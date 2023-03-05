import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores a, b y c de la ecuación separados por espacios:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double discriminant = Math.pow(b, 2)-(4*a*c);
        if (discriminant < 0) {
            System.out.println("Esta ecuación no tiene solución en los números reales");
        }
        else {
            System.out.println("Las posibles soluciones para esta ecuación son:");
            System.out.println("x = "+((-b+discriminant)/(2*a)));
            System.out.println("x = "+((-b-discriminant)/(2*a)));
        }

    }

}
