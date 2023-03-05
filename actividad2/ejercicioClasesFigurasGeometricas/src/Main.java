import java.util.Scanner;

import figura.*;

public class Main {

    public static void main(String[] args) {

        // Object instantiation
        Circulo myCirculo = new Circulo(5);
        Cuadrado myCuadrado = new Cuadrado(5);
        Rectangulo myRectangulo = new Rectangulo(5, 5);
        Triangulo myTriangulo = new Triangulo(3, 4);

        // Methods invocation
        System.out.println("Información de las figuras:\n");
        System.out.println("Circulo:");
        System.out.println("- Radio: "+myCirculo.radio);
        System.out.println("- Area: "+myCirculo.area());
        System.out.println("- Perimetro: "+myCirculo.perimetro());
        System.out.println("");

        System.out.println("Cuadrado:");
        System.out.println("- Lado: "+myCuadrado.lado);
        System.out.println("- Area: "+myCuadrado.area());
        System.out.println("- Perimetro: "+myCuadrado.perimetro());
        System.out.println("");

        System.out.println("Rectangulo:");
        System.out.println("- Base: "+myRectangulo.base);
        System.out.println("- Altura: "+myRectangulo.altura);
        System.out.println("- Area: "+myRectangulo.area());
        System.out.println("- Perimetro: "+myRectangulo.perimetro());
        System.out.println("");

        System.out.println("Triángulo rectangulo:");
        System.out.println("- Base: "+myTriangulo.base);
        System.out.println("- Altura: "+myTriangulo.altura);
        System.out.println("- Hipotenusa: "+myTriangulo.hipotenusa());
        System.out.println("- Area: "+myTriangulo.area());
        System.out.println("- Perimetro: "+myTriangulo.perimetro());
        System.out.println("- Tipo: "+myTriangulo.tipo());
        System.out.println("");

    }

}
