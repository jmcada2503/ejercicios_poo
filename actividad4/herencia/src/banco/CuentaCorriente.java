package banco;

public class CuentaCorriente extends Cuenta {

    private float sobregiro = 0;

    public void retirar(float retiro) {
        if (retiro > this.saldo) {
            this.sobregiro = (retiro - this.saldo);
            this.saldo = 0;
            this.num_retiros += 1;
        }
        else {
            super.retirar(retiro);
        }
    }

    public void consignar(float ingreso) {
        if (this.sobregiro >= ingreso) {
            this.sobregiro -= ingreso;
            this.num_consignaciones += 1;
        }
        else {
            super.consignar(ingreso-sobregiro);
            this.sobregiro = 0;
        }
    }

    public void extracto_mensual() {
        super.extracto_mensual();
    }

    public void imprimir() {
        System.out.println("Valores de la cuenta\n");
        System.out.println("- Saldo: "+this.saldo);
        System.out.println("- Comisión: "+this.comision);
        System.out.println("- Número de transacciones: "+(this.num_consignaciones+this.num_retiros));
        System.out.println("- Sobregiro: "+this.sobregiro);
    }

}
