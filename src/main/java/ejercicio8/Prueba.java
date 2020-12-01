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
public class Prueba {

    public static void main(String[] args) {

        Cafetera cafetera1 = new Cafetera(1000.0, 200.0);
        System.out.println("La cafetera creada tiene " + cafetera1.getCapacidadMaxima()
                + " cc de capacidad máxima y tiene " + cafetera1.getCantidadActual()
                + " cc de capacidad actual");

        cafetera1.llenarCafetera();
        System.out.println("la cafetera tiene " + cafetera1.getCantidadActual() + " cc"
                + " de capacidad actual");

        cafetera1.servirTaza(900);
        System.out.println("la cafetera tiene " + cafetera1.getCantidadActual() + " cc"
                + " de capacidad actual");

        cafetera1.agregarCafe(370);
        System.out.println("la cafetera tiene " + cafetera1.getCantidadActual() + " cc"
                + " de capacidad actual");

        cafetera1.vaciarCafetera();
        System.out.println("la cafetera tiene " + cafetera1.getCantidadActual() + " cc"
                + " de capacidad actual");
    }

}
