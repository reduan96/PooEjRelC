/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author reduan
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {

        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {

        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {

        this.capacidadMaxima = capacidadMaxima;
        
        if (capacidadActual > capacidadMaxima) {

            this.cantidadActual = capacidadMaxima;
        } else {
            
            this.cantidadActual = capacidadActual;
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {

        this.cantidadActual = this.capacidadMaxima;
    }

    public double servirTaza(double cantidadAServir) {

        if (this.cantidadActual < cantidadAServir) {

            cantidadAServir = this.cantidadActual;
            this.cantidadActual = 0;
        } else {
            
            this.cantidadActual -= cantidadAServir;
        }
        return cantidadAServir;
    }

    public void vaciarCafetera() {

        this.cantidadActual = 0;
    }

    public double agregarCafe(double cantidadAgregar) {

        if ((cantidadAgregar + this.cantidadActual) > this.capacidadMaxima) {

            cantidadActual = this.capacidadMaxima;
        } else {

            cantidadActual += cantidadAgregar;
        }

        return cantidadAgregar;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
   
}
