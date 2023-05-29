package inmobiliario.local;

import java.math.BigDecimal;

public class Oficina extends Local {

    public boolean gobierno;

    public Oficina() {}

    public Oficina(int tipo, int area, String direccion, String localizacion, boolean gobierno) {
        super(tipo, area, direccion, localizacion);
        this.gobierno = gobierno;
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(3500000));
    }

}
