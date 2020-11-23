/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author reduan
 */
public class Prueba {

    public static void main(String[] args) {

        PuntoGeometrico prueba1 = new PuntoGeometrico(3, 6);

        System.out.println("posición x de prueba1: " + prueba1.getX());
        System.out.println("posición y de prueba 1: " + prueba1.getY());
        
        PuntoGeometrico prueba2 = new PuntoGeometrico();
        
        System.out.println("Valores por defecto de prueba2: "
        + "\nx: " + prueba2.getX() + "\ny: " + prueba2.getY());
        
        prueba2.setX(5);
        prueba2.setY(7);
        
        System.out.println("posición x de prueba2: " + prueba2.getX());
        System.out.println("posición x de prueba2: " + prueba2.getY());
    }

}
