/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico12;

/**
 *
 * @author reduan
 */
public class Empleado {

    private String nif;
    private double sueldoBase;
    private double pagoPHoraExtra;
    private double horasExtrasMes;
    private double tipoIrpf;
    private boolean casado;
    private int nHijos;

    public Empleado() {

        nif = "00000000Q";
        sueldoBase = 0;
        pagoPHoraExtra = 0;
        horasExtrasMes = 0;
        tipoIrpf = 0;
        casado = false;
        nHijos = 0;
    }

    public Empleado(String nif, double sueldoBase, double pagoPHoraExtra,
            double horasExtrasMes, double tipoIrpf, boolean casado, int nHijos) {

        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoPHoraExtra = pagoPHoraExtra;
        this.horasExtrasMes = horasExtrasMes;
        this.tipoIrpf = tipoIrpf;
        this.casado = casado;
        this.nHijos = nHijos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPHoraExtra() {
        return pagoPHoraExtra;
    }

    public void setPagoPHoraExtra(double pagoPHoraExtra) {
        this.pagoPHoraExtra = pagoPHoraExtra;
    }

    public double getHorasExtrasMes() {
        return horasExtrasMes;
    }

    public void setHorasExtrasMes(double horasExtrasMes) {
        this.horasExtrasMes = horasExtrasMes;
    }

    public double getTipoIrpf() {
        return tipoIrpf;
    }

    public void setTipoIrpf(double tipoIrpf) {
        this.tipoIrpf = tipoIrpf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getnHijos() {
        return nHijos;
    }

    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    @Override
    public String toString() {

        if (casado == true) {

            return "Empleado con nif " + nif + ", sueldo base de " + sueldoBase
                    + "eur, se le paga por hora extra " + pagoPHoraExtra + " eur "
                    + ",\ncon " + horasExtrasMes + " horas/mes y un tipo IRPF de "
                    + tipoIrpf + " %,casado y con " + nHijos + " hijos";

        }

        return "Empleado con nif " + nif + ", sueldo base de " + sueldoBase
                + "eur, se le paga por hora extra " + pagoPHoraExtra + " eur "
                + ",\ncon " + horasExtrasMes + " horas/mes y un tipo IRPF de "
                + tipoIrpf + " %,no casado y con " + nHijos + " hijos";
    }
}
