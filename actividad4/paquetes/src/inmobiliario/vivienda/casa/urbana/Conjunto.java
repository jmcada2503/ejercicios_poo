package inmobiliario.vivienda.casa.urbana;

import inmobiliario.vivienda.casa.Casa;
import java.math.BigDecimal;

public class Conjunto extends Casa {

    public float valor_administracion;
    public boolean incluye_areas_comunes;

    public Conjunto() {}

    public Conjunto(int tipo, int area, String direccion, int habitaciones, int baños, int pisos, float valor_administracion, boolean incluye_areas_comunes) {
        super(tipo, area, direccion, habitaciones, baños, pisos);
        this.valor_administracion = valor_administracion;
        this.incluye_areas_comunes = incluye_areas_comunes;
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(2500000));
    }

}
