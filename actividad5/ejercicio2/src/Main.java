import figuras.Cilindro;
import figuras.Esfera;
import figuras.Piramide;

public class Main {

    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro(1, 2);
        System.out.println("Cilindro:");
        System.out.println(cilindro.volumen());
        System.out.println(cilindro.superficie());

        Esfera esfera = new Esfera(2);
        System.out.println("\nEsfera:");
        System.out.println(esfera.volumen());
        System.out.println(esfera.superficie());
        
        Piramide piramide = new Piramide(2, 2, 2);
        System.out.println("\nPiramide:");
        System.out.println(piramide.volumen());
        System.out.println(piramide.superficie());
    }

}
