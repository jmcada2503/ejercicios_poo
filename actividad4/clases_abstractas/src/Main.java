import animales.*;

public class Main {

    public static void main(String[] args) {

        Animal[] myAnimals = {new Perro(), new Lobo(), new Gato(), new Leon()};
        for (int i=0; i<myAnimals.length; i++) {
            System.out.println("Animal "+(i+1));
            System.out.println("Nombre científico: "+myAnimals[i].getNombreCientifico());
            System.out.println("Hábitat: "+myAnimals[i].getHabitat());
            System.out.println("Alimento: "+myAnimals[i].getAlimento());
            System.out.println("Sonido: "+myAnimals[i].getSonido()+"\n");
        }

    }

}
