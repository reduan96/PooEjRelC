/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author reduan
 */
public class Prueba {

    public static void main(String[] args) {

        Cancion prueba1 = new Cancion();

        System.out.println("valores por defecto de prueba1 "
                + "\nTitulo " + prueba1.getTitulo() + "\nautor "
                + prueba1.getAutor());

        prueba1.setTitulo("TillICollapse");
        prueba1.setAutor("Eminem");

        System.out.println("Valores de prueba1 depues de establecerlos"
                + " con los métodos setters " + "\nTitulo " + prueba1.getTitulo() + "\nautor "
                + prueba1.getAutor());

        Cancion prueba2 = new Cancion("RapName", "ObieTrice");

        System.out.println("valores C.param de prueba2 "
                + "\nTitulo " + prueba2.getTitulo() + "\nautor "
                + prueba2.getAutor());
        //comentario

    }
}
