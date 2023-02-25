public class Salario {
    public static void main(String[] args) {

        int horas_semana, valor_hora;
        double salario_bruto, salario_neto, rtfte_percentage, rtfte;

        horas_semana = 48;
        valor_hora = 5000;
        rtfte_percentage = 12.5;

        salario_bruto = horas_semana*valor_hora;
        rtfte = salario_bruto*(rtfte_percentage/100);
        salario_neto = salario_bruto-rtfte;

        System.out.println("Salario bruto: "+salario_bruto);
        System.out.println("Retención en la fuente: "+rtfte);
        System.out.println("Salario neto: "+salario_neto);

    }
}
