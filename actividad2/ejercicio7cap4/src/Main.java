import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor de B:");
        b = sc.nextDouble();

        if (a > b) {
            System.out.println("A es mayor que B");
        }
        else {
            if (a == b) {
                System.out.println("A es igual a B");
            }
            else {
                System.out.println("A es menor que B");
            }
        }

    }

}
