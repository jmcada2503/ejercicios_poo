public class PruebaEscritorio {
    public static void main(String[] args) {

        double suma, x, y;

        Scanner sc = new Scanner(System.in);

        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + (x/y);
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);

    }
}
