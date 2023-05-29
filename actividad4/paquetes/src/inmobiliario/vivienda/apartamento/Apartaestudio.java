package inmobiliario.vivienda.apartamento;

import inmobiliario.vivienda.Vivienda;
import java.math.BigDecimal;

public class Apartaestudio extends Vivienda {

    public Apartaestudio() {
        this.habitaciones = 1;
    }

    public Apartaestudio(int tipo, int area, String direccion, int baños) {
        super(tipo, area, direccion, 1, baños);
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(1500000));
    }

}
