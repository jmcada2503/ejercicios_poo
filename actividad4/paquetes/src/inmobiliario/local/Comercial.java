package inmobiliario.local;

import java.math.BigDecimal;

public class Comercial extends Local {

    public String centro_comercial;

    public Comercial(int tipo, int area, String direccion, String localizacion, String centro_comercial) {
        super(tipo, area, direccion, localizacion);
        this.centro_comercial = centro_comercial;
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(3000000));
    }

}
