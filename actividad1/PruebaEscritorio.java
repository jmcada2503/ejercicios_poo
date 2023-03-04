import java.util.Scanner;

public class PruebaEscritorio {
    public static void main(String[] args) {

        double suma, x, y;

        Scanner sc = new Scanner(System.in);

        suma = 0;
        x = sc.nextDouble();
        suma = suma + x;
        y = sc.nextDouble();
        x = x + Math.pow(y, 2);
        suma = suma + (x/y);
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);

    }
}
