import java.util.Scanner;

public class EdadJuan {
    public static void main(String[] args) {

        int edad_juan, edad_alberto, edad_ana, edad_mama;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la edad de Juan ( años )");
        edad_juan = sc.nextInt();
        edad_alberto = (edad_juan*2)/3;
        edad_ana = (edad_juan*4)/3;
        edad_mama = edad_juan + edad_alberto + edad_ana;

        System.out.println("Juan tiene "+edad_juan+" años");
        System.out.println("Alberto tiene "+edad_alberto+" años");
        System.out.println("Ana tiene "+edad_ana+" años");
        System.out.println("La mamá de Juan tiene "+edad_mama+" años");

    }
}
