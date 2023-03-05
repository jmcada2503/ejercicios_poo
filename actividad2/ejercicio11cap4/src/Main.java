import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double n1, n2, n3, mayor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 3 números separados por espacios:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        if ((n1 > n2) && (n1 > n3)) {
            mayor = n1;
        }
        else {
            if (n2 > n3) {
                mayor = n2;
            }
            else {
                mayor = n3;
            }
        }

        System.out.println("EL VALOR MAYOR ENTRE: "+n1+", "+n2+" Y "+n3+" ES: "+mayor);

    }

}
