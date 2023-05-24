import java.util.Scanner;

import banco.CuentaAhorros;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CuentaAhorros myCuenta = new CuentaAhorros(10000, 12);

        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Menú:");
            System.out.println("1- Consignar");
            System.out.println("2- Retirar");
            System.out.println("3- Calcular extracto");
            System.out.println("4- Ver valores de la cuenta");
            System.out.println("5- Salir");
            System.out.println("");
            System.out.println("Seleccione una opción: ");
            System.out.println("---------------------------------------------------------");

            int option = in.nextInt();

            if (option == 1) {
                System.out.println("Ingrese el monto a consignar: ");
                float test = in.nextFloat();
                System.out.println("Consignado: "+test);
                myCuenta.consignar(test);
            }
            else if (option == 2) {
                System.out.println("Ingrese el monto a retirar: ");
                myCuenta.retirar(in.nextFloat());
            }
            else if (option == 3) {
                myCuenta.extracto_mensual();
                System.out.println("Los extractos mensuales fueron calculados...\n");
            }
            else if (option == 4) {
                myCuenta.imprimir();
            }
            else {
                break;
            }
        }

    }

}
