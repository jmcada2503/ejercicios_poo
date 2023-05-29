import inmobiliario.vivienda.casa.Rural;
import inmobiliario.vivienda.casa.urbana.Conjunto;
import inmobiliario.vivienda.casa.urbana.Independiente;
import inmobiliario.vivienda.apartamento.Familiar;
import inmobiliario.vivienda.apartamento.Apartaestudio;
import inmobiliario.local.Comercial;
import inmobiliario.local.Oficina;

public class Main {

    public static void main(String[] args) {

        Rural casa_rural = new Rural(0, 300, "Carrera 70 #82 40", 5, 2, 2, 1052, 1520);
        Conjunto casa_conjunto = new Conjunto(1, 100, "Calle 23 #32 16", 3, 1, 2, 230000, true);
        Independiente casa_independiente = new Independiente(2, 180, "Cll 80 #32 44", 5, 2, 1);
        Familiar apartamento_familiar = new Familiar(3, 80, "Cra 30 #12 24", 3, 1, 180000);
        Apartaestudio apartaestudio = new Apartaestudio(4, 60, "Cra 22 #11 6", 1);
        Comercial local_comercial = new Comercial(5, 120, "Cll 50 #60 27", "Afuera", "CC Parque Fabricato");
        Oficina oficina = new Oficina(6, 180, "Cll 70 #72 44", "Adentro", false);


        System.out.println("\nValores:");
        System.out.println("Casa Rural: "+casa_rural.valor_compra());
        System.out.println("Casa Urbana Conjunto Residencial: "+casa_conjunto.valor_compra());
        System.out.println("Casa Urbana Independiente: "+casa_independiente.valor_compra());
        System.out.println("Apartamento Familiar: "+apartamento_familiar.valor_compra());
        System.out.println("Apartaestudio: "+apartaestudio.valor_compra());
        System.out.println("Local comercial: "+local_comercial.valor_compra());
        System.out.println("Oficina: "+oficina.valor_compra());

    }

}
