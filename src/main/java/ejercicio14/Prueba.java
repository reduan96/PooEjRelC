/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author reduan
 */
public class Prueba {

    public static void main(String[] args) {

        Persona Juan = new Persona();
        String infoPersona = Juan.toString();
        System.out.println("Juan: " + infoPersona);

        Juan.setNombre("Juan");
        Juan.setApellido1("Perez");
        Juan.setApellido2("Reverte");
        Juan.setEdad(20);
        Juan.setNif("09147665G");

        infoPersona = Juan.toString();
        System.out.println(infoPersona);

        Persona Marcos = new Persona("Marcos", "González", "Rivera",
                31, "09938876J");
        String infoPersona2 = Marcos.toString();
        System.out.println(infoPersona2);

        Marcos.setEdad(56);
        infoPersona2 = Marcos.toString();
        System.out.println(infoPersona2);
    }
}
