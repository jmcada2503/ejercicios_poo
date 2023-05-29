package inmobiliario.vivienda.casa.urbana;

import inmobiliario.vivienda.casa.Casa;
import java.math.BigDecimal;

public class Independiente extends Casa {

    public Independiente() {}

    public Independiente(int tipo, int area, String direccion, int habitaciones, int baños, int pisos) {
        super(tipo, area, direccion, habitaciones, baños, pisos);
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(3000000));
    }

}
