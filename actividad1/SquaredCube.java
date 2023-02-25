import java.util.Scanner;

public class SquaredCube {
    public static void main(String[] args) {

        double number, square, cube;

        Scanner sc = new Scanner(System.in);

        number = sc.nextDouble();
        square = Math.pow(number, 2);
        cube = Math.pow(number, 3);

        System.out.println("Número ingresado: " + number);
        System.out.println("Cuadrado del número: " + square);
        System.out.println("Cubo del número: " + cube);

    }
}
