/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio4.PuntoGeometrico;
/**
 *
 * @author reduan
 */
public class Linea {

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    public Linea() {
        puntoA.setX(0);
        puntoA.setY(0);
        puntoB.setX(1);
        puntoB.setY(1);
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }
    
    
}
