package banco;

public class Cuenta {
        
    protected float saldo;
    protected int num_consignaciones = 0;
    protected int num_retiros = 0;
    protected float tasa_anual;
    protected float comision = 0;

    public Cuenta(float saldo, float tasa_anual) {
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
    }

    public void consignar(float ingreso) {
        this.saldo += ingreso;
        this.num_consignaciones += 1;
    }

    public void retirar(float retiro) {
        if (retiro <= this.saldo) {
            this.saldo -= retiro;
            this.num_retiros += 1;
        }
    }

    private void calcular_interes() {
        float valor_interes = this.saldo*((this.tasa_anual/12)/100);
        this.saldo += valor_interes;
    }

    public void extracto_mensual() {
        this.saldo -= this.comision;
        this.calcular_interes();
    }

    public void imprimir() {
        System.out.println("Valores de la cuenta\n");
        System.out.println("- Saldo: "+this.saldo);
        System.out.println("- Número de consignaciones: "+this.num_consignaciones);
        System.out.println("- Número de retiros: "+this.num_retiros);
        System.out.println("- Tasa anual: "+this.tasa_anual);
        System.out.println("- Comisión: "+this.comision);
    }

}
