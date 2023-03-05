import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        double hour_value, num_hours, salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        name = sc.next();
        System.out.println("Ingrese el valor de una hora del empleado:");
        hour_value = sc.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas:");
        num_hours = sc.nextDouble();

        salary = hour_value * num_hours;

        System.out.println("Información del empleado:");
        System.out.println("- Nombre: "+name);
        if (salary >= 450000) {
            System.out.println("- Salario: "+salary);
        }

    }

}
