import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String num_inscripcion, nombre;
        double patrimonio;
        int estrato;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de inscripción:");
        num_inscripcion = sc.next();
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = sc.next();
        System.out.println("Ingrese el patrimonio del estudiante:");
        patrimonio = sc.nextDouble();
        System.out.println("Ingrese el estrato social del estudiante:");
        estrato = sc.nextInt();

        double pagmat = 50000;
        if ((patrimonio > 2000000) && (estrato > 3)) {
            pagmat = pagmat + (0.03*patrimonio);
        }

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+num_inscripcion+" Y NOMBRE "+nombre+" DEBE PAGAR: $"+pagmat);

    }

}
