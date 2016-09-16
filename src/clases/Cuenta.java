/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author liborio
 */
public class Cuenta {

    private long numero_cuenta;
    private long numero_identificacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long numero_identificacion, double saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = saldo_actual;
    }

    public Cuenta(long numero_cuenta, long numero_identifacion) {
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identifacion;
        this.saldo_actual = 0;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(long numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void ActulizarSaldo(double Ian) {
        double Aux, Aux2;
        Aux = this.getSaldo_actual() * (Ian / 365);
        Aux2 = this.getSaldo_actual() + Aux;
        this.setSaldo_actual(Aux2);
    }

    public void Ingresar(double Ingreso) {
        double Aux;
        Aux = this.getSaldo_actual() + Ingreso;
        this.setSaldo_actual(Aux);
    }

    public void Retirar(double Egreso) {
        double Aux;
        Aux = this.getSaldo_actual() - Egreso;
        this.setSaldo_actual(Aux);

    }

    public String Mostrar() {
        String Aux;
        Aux = "No. De La Cuenta Es: " + this.getNumero_cuenta() + "\n"
                + "No. De Identificaciòn Es: " + this.getNumero_identificacion() + "\n"
                + "Su Saldo Actual Es: $ " + this.getSaldo_actual();
        return Aux;
    }
}
