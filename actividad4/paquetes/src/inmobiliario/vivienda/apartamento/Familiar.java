package inmobiliario.vivienda.apartamento;

import inmobiliario.vivienda.Vivienda;
import java.math.BigDecimal;

public class Familiar extends Vivienda {

    public float valor_administracion;

    public Familiar() {}

    public Familiar(int tipo, int area, String direccion, int habitaciones, int baños, float valor_administracion) {
        super(tipo, area, direccion, habitaciones, baños);
        this.valor_administracion = valor_administracion;
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(2000000));
    }

}
