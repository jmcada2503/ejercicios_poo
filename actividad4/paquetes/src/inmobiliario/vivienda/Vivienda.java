package inmobiliario.vivienda;

import inmobiliario.Inmueble;

public abstract class Vivienda extends Inmueble {

    protected int habitaciones;
    protected int baños;

    public Vivienda() {}

    public Vivienda(int tipo, int area, String direccion, int habitaciones, int baños) {
        super(tipo, area, direccion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

}
