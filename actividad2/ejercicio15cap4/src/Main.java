import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los pesos de las cuatro esferas separados por espacios:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();

        if ((a == b) && (a == c)) {
            if (d > a) {
                System.out.print("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            }
            else {
                System.out.print("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        }
        else {
            if ((a == b) && (a == d)) {
                System.out.print("LA ESFERA C ES LA DIFERENTE");
                if (c > a) {
                    System.out.println(" Y ES DE MAYOR PESO");
                }
                else {
                    System.out.println(" Y ES DE MENOR PESO");
                }
            }
            else {
                if ((a == c) && (a == d)) {
                    System.out.print("LA ESFERA B ES LA DIFERENTE");
                    if (b > d) {
                        System.out.println(" Y ES DE MAYOR PESO");
                    }
                    else {
                        System.out.println(" Y ES DE MENOR PESO");
                    }
                }
                else {
                    System.out.print("LA ESFERA A ES LA DIFERENTE");
                    if (a > b) {
                        System.out.println(" Y ES DE MAYOR PESO");
                    }
                    else {
                        System.out.println(" Y ES DE MENOR PESO");
                    }
                }
            }
        }

    }

}
