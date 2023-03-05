import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nom;
        double nht, vhn, het, hee8, salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador:");
        nom = sc.next();
        System.out.println("Ingrese el número de horas trabajadas:");
        nht = sc.nextDouble();
        System.out.println("Ingrese el valor de una hora trabajada:");
        vhn = sc.nextDouble();

        if (nht > 40) {
            het = nht - 40;
            if (het > 8) {
                hee8 = het - 8;
                salario = 40 * vhn + 16 * vhn + hee8 * 3 * vhn;
            }
            else {
                salario = 40 * vhn + het * 2 * vhn;
            }
        }
        else {
            salario = nht * vhn;
        }

        System.out.println("EL TRABAJADOR "+nom+" DEVENGO: $"+salario);

    }

}
