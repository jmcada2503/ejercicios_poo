package inmobiliario.vivienda.casa;

import inmobiliario.vivienda.Vivienda;

public abstract class Casa extends Vivienda {

    public int pisos;

    public Casa() {}

    public Casa(int tipo, int area, String direccion, int habitaciones, int baños, int pisos) {
        super(tipo, area, direccion, habitaciones, baños);
        this.pisos = pisos;
    }

}
