package inmobiliario;
import java.math.BigDecimal;

public abstract class Inmueble {

    protected int tipo;
    protected int area;
    protected String direccion; 

    public Inmueble() {}

    public Inmueble(int tipo, int area, String direccion) {
        this.tipo = tipo;
        this.area = area;
        this.direccion = direccion;
    }
    
    public abstract BigDecimal valor_compra();

}
