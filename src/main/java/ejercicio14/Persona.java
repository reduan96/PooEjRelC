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
public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String nif;

    public Persona() {

        nombre = "";
        apellido1 = "";
        apellido2 = "";
        edad = 0;
        nif = "00000000Q";
    }

    public Persona(String nombre, String apellido1, String apellido2,
            int edad, String nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {

        return nombre + " " + apellido1 + " " + apellido2 + " con edad de "
                + edad + " años " + " y con NIF " + nif;

    }
}
