import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double valcomp, valpag, pdes;
        String color;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra:");
        valcomp = sc.nextDouble();
        System.out.println("Ingrese el color de la bolita:");
        color = sc.next();

        if (color.equals("BLANCO")) {
            pdes = 0;
        }
        else {
            if (color.equals("VERDE")) {
                pdes = 10;
            }
            else {
                if (color.equals("AMARILLO")) {
                    pdes = 25;
                }
                else {
                    if (color.equals("AZUL")) {
                        pdes = 50;
                    }
                    else {
                        pdes = 100;
                    }
                }
            }
        }

        valpag = valcomp-pdes*valcomp/100;

        System.out.println("EL CLIENTE DEBE PAGAR: $"+valpag);

    }

}
