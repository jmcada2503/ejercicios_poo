import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los pesos de las tres esferas separados por un espacio:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if ((a > b) && (a > c)) {
            System.out.println("La esfera de mayor peso es la A, con un peso de "+a);
        }
        else if ((b > a) && (b > c)) {
            System.out.println("La esfera de mayor peso es la B, con un peso de "+b);
        }
        else {
            System.out.println("La esfera de mayor peso es la C, con un peso de "+c);
        }

    }

}
