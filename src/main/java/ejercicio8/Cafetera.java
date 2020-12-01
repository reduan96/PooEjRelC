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
        
        this.capacidadMaxima = this.cantidadActual;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {

        if (cantidadActual > this.capacidadMaxima) {

            capacidadActual = this.capacidadMaxima;
        }

        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadActual;
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

        if (cantidadActual < cantidadAServir) {

            cantidadAServir = cantidadActual;
            cantidadActual = 0;
        } else {
            cantidadActual -= cantidadAServir;
        }
        return cantidadAServir;
    }

    public void vaciarCafetera() {

        this.cantidadActual = 0;
    }

    public double agregarCafe(double cantidadAgregar) {

        if (cantidadAgregar > this.capacidadMaxima) {

            cantidadAgregar = this.capacidadMaxima;
        }else{
            
            cantidadActual += cantidadAgregar;
        }

        return cantidadAgregar;
    }
}
