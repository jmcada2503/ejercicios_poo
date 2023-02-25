import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

        double radio, area, longitud;

        Scanner sc = new Scanner(System.in);

        radio = sc.nextDouble();

        area = Math.PI*Math.pow(radio, 2);
        longitud = 2*Math.PI*radio;

        System.out.println("Area del círculo: " + area);
        System.out.println("Longitud de la circunferencia: " + longitud);

    }
}
