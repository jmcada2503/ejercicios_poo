import clases.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Velocista velocista = new Velocista(1, "Juan", 10.5f, 1.5, 5.0);
        Escalador escalador = new Escalador(2, "Andres", 12.2f, 2.5f, 1.32f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "María", 23.2f, 3.4);

        Ciclista[] ciclistas = {velocista, escalador, contrarrelojista};

        Equipo equipo = new Equipo("Test", ciclistas);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un identificador para mostrar los datos del ciclista: ");
            equipo.mostrarDatos(sc.nextInt());
        }

    }

}
