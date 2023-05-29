package inmobiliario.local;

import inmobiliario.Inmueble;

public abstract class Local extends Inmueble {

    public String localizacion;

    public Local() {}

    public Local(int tipo, int area, String direccion, String localizacion) {
        super(tipo, area, direccion);
        this.localizacion = localizacion;
    }

}
