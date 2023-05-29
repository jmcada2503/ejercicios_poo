package inmobiliario.vivienda.casa;
import java.math.BigDecimal;

public class Rural extends Casa {

    public float distancia_municipio;
    public float altitud;

    public Rural() {}

    public Rural(int tipo, int area, String direccion, int habitaciones, int baños, int pisos, float distancia_municipio, float altitud) {
        super(tipo, area, direccion, habitaciones, baños, pisos);
        this.distancia_municipio = distancia_municipio;
        this.altitud = altitud;
    }

    public BigDecimal valor_compra() {
        return new BigDecimal(this.area).multiply(new BigDecimal(1500000));
    }

}
