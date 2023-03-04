import java.util.Scanner;

import clases.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los siguientes valores separados por espacios\n- Nombre\n- Porcentaje de retención en la fuente\n- Código del empleado\n- Número de horas trabajadas\n- Valor de la hora");

        Empleado myEmpleado = new Empleado(sc.next(), sc.nextDouble());
        myEmpleado.setCodigoEmpleado(sc.next());
        myEmpleado.addHorasTrabajadas(sc.nextDouble());
        myEmpleado.setValorHora(sc.nextDouble());

        System.out.println("Información del empleado con código "+myEmpleado.getCodigoEmpleado());
        System.out.println("- Nombre: "+myEmpleado.nombre);
        System.out.println("- Salario bruto: "+myEmpleado.salarioBruto());
        System.out.println("- Salario neto: "+myEmpleado.salarioNeto());

    }

}
