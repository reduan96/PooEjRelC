/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author reduan
 */
public class CuentaBancaria {

    private long numCuenta;
    private String nif;
    private String nomCliente;
    private int saldoActual;
    private double interesAnual;

    public CuentaBancaria() {

    }

    public CuentaBancaria(long numCuenta, String nif, String nomCliente, int saldoActual, double interesAnual) {
        this.numCuenta = numCuenta;
        this.nif = nif;
        this.nomCliente = nomCliente;
        this.saldoActual = saldoActual;
        if (interesAnual > 0.1 && interesAnual < 3) {
            this.interesAnual = interesAnual;
        }
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    public void ingresarIntereses(){
        
        this.saldoActual += (this.interesAnual * this.saldoActual);
    }

    public void ingresarDinero(double cantidad) {

        this.saldoActual += cantidad;
    }

    public void retirarEfectivo(double cantidad) {

        this.saldoActual -= cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nif=" + nif
                + ", nomCliente=" + nomCliente + ", saldoActual=" + saldoActual
                + ", interesAnual=" + interesAnual + '}';
    }

}
