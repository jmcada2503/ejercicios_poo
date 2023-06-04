package clases;

public class Escalador extends Ciclista {

    private float aceleracion_promedio_subida;
    private float grado_soportado;

    public Escalador() {}

    public Escalador(int identificador, String nombre, float tiempo_acumulado, float aceleracion_promedio_subida, float grado_soportado) {
        super(identificador, nombre, tiempo_acumulado);
        this.aceleracion_promedio_subida = aceleracion_promedio_subida;
        this.grado_soportado = grado_soportado;
    }

    public float getAceleracionPromedioSubida() {
        return this.aceleracion_promedio_subida;
    }

    public float getGradoSoportado() {
        return this.grado_soportado;
    }

    public void setAceleracionPromedioSubida(float aceleracion_promedio_subida) {
        this.aceleracion_promedio_subida = aceleracion_promedio_subida;
    }

    public void setGradoSoportado(float grado_soportado) {
        this.grado_soportado = grado_soportado;
    }

    public String imprimirTipo() {
        return "Es un escalador";
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio en subida: " + this.aceleracion_promedio_subida);
        System.out.println("Grado soportado: " + this.grado_soportado);
    }

}
