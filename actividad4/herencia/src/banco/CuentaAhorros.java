package banco;

public class CuentaAhorros extends Cuenta {

    private boolean activa;

    public CuentaAhorros(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
        this.activa = (saldo >= 10000);
    }

    public void consignar(float ingreso) {
        if (this.activa) {
            super.consignar(ingreso);
        }
    }

    public void retirar(float retiro) {
        if (this.activa) {
            super.retirar(retiro);
        }
    }

    public void extracto_mensual() {
        if (this.num_retiros > 4) {
            this.saldo -= (1000*(num_retiros-4));
        }
        super.extracto_mensual();
        this.activa = (this.saldo >= 10000);
    }

    public void imprimir() {
        System.out.println("Valores de la cuenta\n");
        System.out.println("- Saldo: "+this.saldo);
        System.out.println("- Comisión: "+this.comision);
        System.out.println("- Número de transacciones: "+(this.num_retiros+this.num_consignaciones));
    }

}
